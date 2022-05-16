package Daily_algo

fun main(args: Array<String>) {
    val person = Person()
    person.age = 11;
    person.showMe()
}

class Person{
    var name: String = ""
        get(): String = "getter test"

    var age : Int = 0;

    fun showMe(){
        println("$name, $age")
    // showMe에서 name 읽을때 자동으로 get()호출. setter같은데;...?
        // 왜 hyo가 안들어가는지 이해가 안간다.
    // showMe에서 name 호출 -> person.name 이 됨
        // == person.getName == 커스텀 게터의 리턴값 getter test가 반환됨
    //person.getName()

   }
}