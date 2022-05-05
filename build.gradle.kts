import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    id("org.jetbrains.compose") version "1.0.1"
}

group = "me.lazaroofarrill"
version = "1.0"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(compose.desktop.currentOs)

    implementation("io.github.copper-leaf:ballast-core:1.1.0")
    implementation("io.github.copper-leaf:ballast-repository:1.1.0")
    implementation("io.github.copper-leaf:ballast-debugger:1.1.0")
    implementation("io.github.copper-leaf:ballast-firebase-crashlytics:1.1.0")
    implementation("io.github.copper-leaf:ballast-firebase-analytics:1.1.0")
    testImplementation("io.github.copper-leaf:ballast-test:1.1.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "compose_playground"
            packageVersion = "1.0.0"
        }
    }
}