package Daily_algo
fun main(args: Array<String>) {

    val person = Person("hyojin", 28)
    person.showMe();
    person.showAge(person)
}

internal class Person{
    var name: String = "";
    var age: Int = 0;

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }


    internal fun showAge(p: Person) = println(p.age)
    fun showMe(){
        println("$name, $age")
    }
}