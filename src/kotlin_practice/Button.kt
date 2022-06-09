package kotlin_practice

fun main() {
    Button().click()
    Button().showOff()
}

class Button : Clickable, Focusable{
    override fun click() = println("i was clicked")
    override fun showOff() {
        //super<상위타입>으로 선언하면 어떤 상위 타입 메소드를 호출할지 지정 가능
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

interface Clickable{
    fun click()
    fun showOff() = println("i'm clickable")
}

interface Focusable{
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("i'm focusable!")
}