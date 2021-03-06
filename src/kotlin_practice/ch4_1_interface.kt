package kotlin_practice

fun main(args: Array<String>) {

    // super 처리한 함수 호출
    Button().click()
    Button().showOff()

    println("----------------")
    val button = Button();
    button.showOff() //  click, showoff 둘다 호출
    button.setFocus(true)

}

class Button : Clickable, Focusable{
    override fun click() = println("i was clicked")
    override fun showOff() {

        //super<상위타입>으로 선언하면 어떤 상위 타입 메소드를 호출할지 지정 가능. Clickable에서는 디폴트 메서드가 동작
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

interface Clickable{
    fun click()
    fun showOff() = println("i'm clickable") // 디폴트 구현이 있는 메서드
}

interface Focusable{
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("i'm focusable!")
}