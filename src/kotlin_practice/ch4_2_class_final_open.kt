package kotlin_practice

fun main(){


}

class CannotOverride{
    fun test() {}
}

open class RichButton : Clickable{
    fun disable() {} // final
    open fun animate() {}
    override fun click() { } // 기반 클래스, 인터페이스의 메소드는 open이 디폴트
}

abstract class Animated(){ // 추상클래스. 추상함수를 가진 클래스
    abstract fun animate() // 추상함수

    open fun stopAnimating(){ } // 추상클래스더라도 추상함수가 아닌 함수는 final이다. open을 통해 오버라이드 허용 가능
    fun animateTwice() {}
}
