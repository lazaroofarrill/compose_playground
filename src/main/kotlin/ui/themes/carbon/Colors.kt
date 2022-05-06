package ui.themes.carbon

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class CarbonColors(
    val background: Color,
    val layer: Color,
    val field: Color,
    val border: Color,
    val text: Color,
    val link: Color,
    val icon: Color,
    val support: Color,
    val focus: Color,
    val skeleton: Color,
)

val LocalCarbonColors = staticCompositionLocalOf {
    CarbonColors(
        background = Color.Unspecified,
        layer = Color.Unspecified,
        field = Color.Unspecified,
        border = Color.Unspecified,
        text = Color.Unspecified,
        link = Color.Unspecified,
        icon = Color.Unspecified,
        support = Color.Unspecified,
        focus = Color.Unspecified,
        skeleton = Color.Unspecified,
    )
}

object CarbonShades {
    val Black = Color(0xff000000)
    val White = Color(0xffffffff)

    object Gray {

    }
}


val Black = Color(0xff000000)
val BlackHover = Color(0xff212121)

val White = Color(0xffffffff)
val WhiteHover = Color(0xffe8e8e8)

val Yellow10 = Color(0xfffcf4d6)
val Yellow20 = Color(0xfffddc69)
val Yellow30 = Color(0xfff1c21b)
val Yellow40 = Color(0xffd2a106)
val Yellow50 = Color(0xffb28600)
val Yellow60 = Color(0xff8e6a00)
val Yellow70 = Color(0xff684e00)
val Yellow80 = Color(0xff483700)
val Yellow90 = Color(0xff302400)
val Yellow100 = Color(0xff1c1500)


val Yellow10Hover = Color(0xfff8e6a0)
val Yellow20Hover = Color(0xfffccd27)
val Yellow30Hover = Color(0xffddb00e)
val Yellow40Hover = Color(0xffbc9005)
val Yellow50Hover = Color(0xff9e7700)
val Yellow60Hover = Color(0xff755800)
val Yellow70Hover = Color(0xff806000)
val Yellow80Hover = Color(0xff5c4600)
val Yellow90Hover = Color(0xff3d2e00)
val Yellow100Hover = Color(0xff332600)


val Orange10 = Color(0xfffff2e8)
val Orange20 = Color(0xffffd9be)
val Orange30 = Color(0xffffb784)
val Orange40 = Color(0xffff832b)
val Orange50 = Color(0xffeb6200)
val Orange60 = Color(0xffba4e00)
val Orange70 = Color(0xff8a3800)
val Orange80 = Color(0xff5e2900)
val Orange90 = Color(0xff3e1a00)
val Orange100 = Color(0xff231000)


val Orange10Hover = Color(0xffffe2cc)
val Orange20Hover = Color(0xffffc69e)
val Orange30Hover = Color(0xffff9d57)
val Orange40Hover = Color(0xfffa6800)
val Orange50Hover = Color(0xffcc5500)
val Orange60Hover = Color(0xff9e4200)
val Orange70Hover = Color(0xffa84400)
val Orange80Hover = Color(0xff753300)
val Orange90Hover = Color(0xff522200)
val Orange100Hover = Color(0xff421e00)


val Red10 = Color(0xfffff1f1)
val Red20 = Color(0xffffd7d9)
val Red30 = Color(0xffffb3b8)
val Red40 = Color(0xffff8389)
val Red50 = Color(0xfffa4d56)
val Red60 = Color(0xffda1e28)
val Red70 = Color(0xffa2191f)
val Red80 = Color(0xff750e13)
val Red90 = Color(0xff520408)
val Red100 = Color(0xff2d0709)


val Red100Hover = Color(0xff540d11)
val Red90Hover = Color(0xff66050a)
val Red80Hover = Color(0xff921118)
val Red70Hover = Color(0xffc21e25)
val Red60Hover = Color(0xffb81922)
val Red50Hover = Color(0xffee0713)
val Red40Hover = Color(0xffff6168)
val Red30Hover = Color(0xffff99a0)
val Red20Hover = Color(0xffffc2c5)
val Red10Hover = Color(0xffffe0e0)


val Magenta10 = Color(0xfffff0f7)
val Magenta20 = Color(0xffffd6e8)
val Magenta30 = Color(0xffffafd2)
val Magenta40 = Color(0xffff7eb6)
val Magenta50 = Color(0xffee5396)
val Magenta60 = Color(0xffd02670)
val Magenta70 = Color(0xff9f1853)
val Magenta80 = Color(0xff740937)
val Magenta90 = Color(0xff510224)
val Magenta100 = Color(0xff2a0a18)


val Magenta100Hover = Color(0xff53142f)
val Magenta90Hover = Color(0xff68032e)
val Magenta80Hover = Color(0xff8e0b43)
val Magenta70Hover = Color(0xffbf1d63)
val Magenta60Hover = Color(0xffb0215f)
val Magenta50Hover = Color(0xffe3176f)
val Magenta40Hover = Color(0xffff57a0)
val Magenta30Hover = Color(0xffff94c3)
val Magenta20Hover = Color(0xffffbdda)
val Magenta10Hover = Color(0xffffe0ef)


val Purple10 = Color(0xfff6f2ff)
val Purple20 = Color(0xffe8daff)
val Purple30 = Color(0xffd4bbff)
val Purple40 = Color(0xffbe95ff)
val Purple50 = Color(0xffa56eff)
val Purple60 = Color(0xff8a3ffc)
val Purple70 = Color(0xff6929c4)
val Purple80 = Color(0xff491d8b)
val Purple90 = Color(0xff31135e)
val Purple100 = Color(0xff1c0f30)

val Purple100Hover = Color(0xff341c59)
val Purple90Hover = Color(0xff40197b)
val Purple80Hover = Color(0xff5b24ad)
val Purple70Hover = Color(0xff7c3dd6)
val Purple60Hover = Color(0xff7822fb)
val Purple50Hover = Color(0xff9352ff)
val Purple40Hover = Color(0xffae7aff)
val Purple30Hover = Color(0xffc5a3ff)
val Purple20Hover = Color(0xffdcc7ff)
val Purple10Hover = Color(0xffede5ff)


val Blue10 = Color(0xffedf5ff)
val Blue20 = Color(0xffd0e2ff)
val Blue30 = Color(0xffa6c8ff)
val Blue40 = Color(0xff78a9ff)
val Blue50 = Color(0xff4589ff)
val Blue60 = Color(0xff0f62fe)
val Blue70 = Color(0xff0043ce)
val Blue80 = Color(0xff002d9c)
val Blue90 = Color(0xff001d6c)
val Blue100 = Color(0xff001141)

val Blue100Hover = Color(0xff001f75)
val Blue90Hover = Color(0xff00258a)
val Blue80Hover = Color(0xff0039c7)
val Blue70Hover = Color(0xff0053ff)
val Blue60Hover = Color(0xff0050e6)
val Blue50Hover = Color(0xff1f70ff)
val Blue40Hover = Color(0xff5c97ff)
val Blue30Hover = Color(0xff8ab6ff)
val Blue20Hover = Color(0xffb8d3ff)
val Blue10Hover = Color(0xffdbebff)


val Cyan10 = Color(0xffe5f6ff)
val Cyan20 = Color(0xffbae6ff)
val Cyan30 = Color(0xff82cfff)
val Cyan40 = Color(0xff33b1ff)
val Cyan50 = Color(0xff1192e8)
val Cyan60 = Color(0xff0072c3)
val Cyan70 = Color(0xff00539a)
val Cyan80 = Color(0xff003a6d)
val Cyan90 = Color(0xff012749)
val Cyan100 = Color(0xff061727)


val Cyan10Hover = Color(0xffcceeff)
val Cyan20Hover = Color(0xff99daff)
val Cyan30Hover = Color(0xff57beff)
val Cyan40Hover = Color(0xff059fff)
val Cyan50Hover = Color(0xff0f7ec8)
val Cyan60Hover = Color(0xff005fa3)
val Cyan70Hover = Color(0xff0066bd)
val Cyan80Hover = Color(0xff00498a)
val Cyan90Hover = Color(0xff013360)
val Cyan100Hover = Color(0xff0b2947)


val Teal10 = Color(0xffd9fbfb)
val Teal20 = Color(0xff9ef0f0)
val Teal30 = Color(0xff3ddbd9)
val Teal40 = Color(0xff08bdba)
val Teal50 = Color(0xff009d9a)
val Teal60 = Color(0xff007d79)
val Teal70 = Color(0xff005d5d)
val Teal80 = Color(0xff004144)
val Teal90 = Color(0xff022b30)
val Teal100 = Color(0xff081a1c)

val Teal10Hover = Color(0xffacf6f6)
val Teal20Hover = Color(0xff57e5e5)
val Teal30Hover = Color(0xff25cac8)
val Teal40Hover = Color(0xff07aba9)
val Teal50Hover = Color(0xff008a87)
val Teal60Hover = Color(0xff006b68)
val Teal70Hover = Color(0xff007070)
val Teal80Hover = Color(0xff005357)
val Teal90Hover = Color(0xff033940)
val Teal100Hover = Color(0xff0f3034)

val Green10 = Color(0xffdefbe6)
val Green20 = Color(0xffa7f0ba)
val Green30 = Color(0xff6fdc8c)
val Green40 = Color(0xff42be65)
val Green50 = Color(0xff24a148)
val Green60 = Color(0xff198038)
val Green70 = Color(0xff0e6027)
val Green80 = Color(0xff044317)
val Green90 = Color(0xff022d0d)
val Green100 = Color(0xff071908)


val Green10Hover = Color(0xffb6f6c8)
val Green20Hover = Color(0xff74e792)
val Green30Hover = Color(0xff36ce5e)
val Green40Hover = Color(0xff3bab5a)
val Green50Hover = Color(0xff208e3f)
val Green60Hover = Color(0xff166f31)
val Green70Hover = Color(0xff11742f)
val Green80Hover = Color(0xff05521c)
val Green90Hover = Color(0xff033b11)
val Green100Hover = Color(0xff0d300f)

val CoolGray10 = Color(0xfff2f4f8)
val CoolGray20 = Color(0xffdde1e6)
val CoolGray30 = Color(0xffc1c7cd)
val CoolGray40 = Color(0xffa2a9b0)
val CoolGray50 = Color(0xff878d96)
val CoolGray60 = Color(0xff697077)
val CoolGray70 = Color(0xff4d5358)
val CoolGray80 = Color(0xff343a3f)
val CoolGray90 = Color(0xff21272a)
val CoolGray100 = Color(0xff121619)


val CoolGray10Hover = Color(0xffe4e9f1)
val CoolGray20Hover = Color(0xffcdd3da)
val CoolGray30Hover = Color(0xffadb5bd)
val CoolGray40Hover = Color(0xff9199a1)
val CoolGray50Hover = Color(0xff757b85)
val CoolGray60Hover = Color(0xff585e64)
val CoolGray70Hover = Color(0xff5d646a)
val CoolGray80Hover = Color(0xff434a51)
val CoolGray90Hover = Color(0xff2b3236)
val CoolGray100Hover = Color(0xff222a2f)


val Gray10 = Color(0xfff4f4f4)
val Gray20 = Color(0xffe0e0e0)
val Gray30 = Color(0xffc6c6c6)
val Gray40 = Color(0xffa8a8a8)
val Gray50 = Color(0xff8d8d8d)
val Gray60 = Color(0xff6f6f6f)
val Gray70 = Color(0xff525252)
val Gray80 = Color(0xff393939)
val Gray90 = Color(0xff262626)
val Gray100 = Color(0xff161616)

val Gray10Hover = Color(0xffe8e8e8)
val Gray20Hover = Color(0xffd1d1d1)
val Gray30Hover = Color(0xffb5b5b5)
val Gray40Hover = Color(0xff999999)
val Gray50Hover = Color(0xff7a7a7a)
val Gray60Hover = Color(0xff5e5e5e)
val Gray70Hover = Color(0xff636363)
val Gray80Hover = Color(0xff474747)
val Gray90Hover = Color(0xff333333)
val Gray100Hover = Color(0xff292929)


val WarmGray10 = Color(0xfff7f3f2)
val WarmGray20 = Color(0xffe5e0df)
val WarmGray30 = Color(0xffcac5c4)
val WarmGray40 = Color(0xffada8a8)
val WarmGray50 = Color(0xff8f8b8b)
val WarmGray60 = Color(0xff726e6e)
val WarmGray70 = Color(0xff565151)
val WarmGray80 = Color(0xff3c3838)
val WarmGray90 = Color(0xff272525)
val WarmGray100 = Color(0xff171414)


val WarmGray10Hover = Color(0xfff0e8e6)
val WarmGray20Hover = Color(0xffd8d0cf)
val WarmGray30Hover = Color(0xffb9b3b1)
val WarmGray40Hover = Color(0xff9c9696)
val WarmGray50Hover = Color(0xff7f7b7b)
val WarmGray60Hover = Color(0xff605d5d)
val WarmGray70Hover = Color(0xff696363)
val WarmGray80Hover = Color(0xff4c4848)
val WarmGray90Hover = Color(0xff343232)
val WarmGray100Hover = Color(0xff2c2626)