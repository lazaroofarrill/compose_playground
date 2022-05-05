package main

import (
	"errors"
	"fmt"
	"github.com/gobeam/stringy"
	"log"
	"os"
	"path/filepath"
	"strings"
)

func main() {
	var err error

	templateName := os.Args[1]
	print(templateName)
	fullName := os.Args[2]
	println(fullName)

	root := "../component_template"
	var files []string
	err = filepath.Walk(root, func(path string, info os.FileInfo, err error) error {
		if !info.IsDir() && strings.Index(path, "ktt") != -1 {
			files = append(files, path)
		}
		return nil
	})
	if err != nil {
		panic(err)
	}

	for _, file := range files {
		data, _ := os.ReadFile(file)
		dataString := string(data)

		packagePath, componentName := getPath(fullName)
		dataToSave := replaceTokens(dataString, packagePath, componentName)

		fileNameSplit := strings.Split(file, "/")
		newFileName := replaceTokens(fileNameSplit[len(fileNameSplit)-1], packagePath, componentName)
		newFileName = strings.ReplaceAll(newFileName, "ktt", "kt")
		newFileName = toPascalCase(newFileName)
		newFileName = strings.ReplaceAll(newFileName, "Kt", ".kt")
		packageUri := strings.ReplaceAll(packagePath, ".", "/")
		saveFolder := fmt.Sprintf("../../src/main/kotlin/%s", packageUri)
		newPath := fmt.Sprintf("%s/%s", saveFolder, newFileName)
		println(newPath, "the new path")
		binaryData := []byte(dataToSave)
		//println(binaryData)
		//println(packageUri)
		if _, err := os.Stat(saveFolder); errors.Is(err, os.ErrNotExist) {
			err := os.Mkdir(saveFolder, os.ModePerm)
			if err != nil {
				log.Println(err)
			}
		}
		err = os.WriteFile(newPath, binaryData, os.ModePerm)
		if err != nil {
			panic(err)
			return
		}
	}
}

func getPath(value string) (string, string) {
	splinted := strings.Split(value, "/")
	name := splinted[len(splinted)-1]

	return strings.Join(splinted, "."), name
}

func replaceTokens(data string, packagePath string, componentName string) string {
	splitPath := strings.Split(packagePath, ".")
	newPackagePath := strings.Join(append(splitPath[:len(splitPath)-1], toCamelCase(splitPath[len(splitPath)-1])), ".")
	println(newPackagePath)
	var result = data
	result = strings.ReplaceAll(result, "{{pascalName}}", toPascalCase(componentName))
	result = strings.ReplaceAll(result, "{{camelName}}", toCamelCase(componentName))
	result = strings.ReplaceAll(result, "{{packagePath}}", newPackagePath)
	result = strings.ReplaceAll(result, "{{snakeName}}", toSnakeCase(componentName))
	result = strings.ReplaceAll(result, "{{kebabCase}}", toKebabCase(componentName))
	return result
}

func toKebabCase(value string) string {
	return stringy.New(value).KebabCase().ToLower()
}

func toSnakeCase(value string) string {
	return stringy.New(value).SnakeCase().KebabCase().ToLower()
}

func toPascalCase(value string) string {
	return stringy.New(value).CamelCase()
}

func toCamelCase(value string) string {
	stringyContract := stringy.New(value)
	stringyContract.CamelCase()
	return stringy.New(stringyContract.CamelCase()).LcFirst()
}
