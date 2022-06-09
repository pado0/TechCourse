package kotlin_practice

// 확장함수: 클래스 밖에 선언되지만, 해당 클래스에 속하는 것 처럼 쓸 수 있음
// 원하는 메소드를 어떤 클래스에 사용한 것 처럼 쓸 수 있다.
// 클래스에 이미 정의된 메소드나 프로퍼티를 사용할 수는 없다.
// 오버라이드 불가하다.

class Student(var name: String, var age: Int){}

fun Student.firstName(): Char = this.name[0]


fun main(args : Array<String>){
    val student = Student("Tina", 10)
    println(student.firstName())


    val list = listOf("args: ", *args)
    println(list)

}