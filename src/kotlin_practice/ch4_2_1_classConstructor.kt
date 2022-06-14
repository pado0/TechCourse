package kotlin_practice

// 주 생성자와 부 생성자를 정의하고, 초기화 블록을 선언해보자.
fun main(){

    val userCon = UserCon("name")
    println(userCon.nickname) // name이 초기화되어 set. 읽어와짐.
    val forCon = ForCon("name", 10)

    val forPriority = ForPriority("hyo", 100, 200)


}

// 주 생성자가 없는 일반 클래스
class NotCon{
    val test = 1;
}
// 주 생성자가 있는 클래스. nickname을 입력해야 인스턴스 생성이 가능
// val, var을 붙여주어 프로퍼티의 선언과 초기화를 같이 해준다.
// 초기화란 setter의 역할.
class UserCon(val nickname: String)

// 주 생성자 프로퍼티가 두 개인 클래스
class ForCon(val name: String, val age: Int)

// 위 선언에서 생략된 것 : constructor 키워드
class ForConCompare constructor(val name: String, val age: Int)

// init으로 초기화 : 코틀린에선 주생성자에 코드 추가가 불가하다.
// 생성자로 입력된 값으로 처리하고 싶은게 있다면 초기화 블록을 사용한다.
// val/ var 키워드를 사용하지 않고 개발자가 직접 초기화.
class InitTest(nameParam: String){

    val name: String
    init {
        if(nameParam.isEmpty()){
            throw java.lang.IllegalArgumentException("error")
        }
        // 값 초기화
        this.name = nameParam
    }
}

// 부생성자: 클래스 블록 내에 존재하는 생성자. constructor 키워드 생략 불가
class ForSubCon(val name: String){

    var agetest: Int = 10
    var height: Int = 400

    // 부생성자는 무조건 주생성자에게 생성을 위임해야함.
    // this()를 통해 대신 생성해달라고 요청
    constructor(name: String, age:Int) : this(name){
        this.agetest = age // age만 여기서 처리하고, name은 주생성자에서 처리
    }

    // height만 여기서 처리하고, (name, age)는 1차 부생성자에게 위임
    // 1차 부생성자는 주생성자에 위임
    constructor(name:String, age:Int, height:Int) : this(name, age){
        this.height = height
    }
}

// 생성자 우선순위 with init
// 1. init 2.최상위 생성위임 생성자(주생성자), 3.. 1차..n차 부생성자 순으로 호출
class ForPriority {
    var pname: String = "name"
    var page: Int = 1
    var pheight: Int = 2

    init {
        println("call init block")
    }

    constructor(name: String){
        this.pname = name
        println(" name constructor! ")
    }

    constructor(name: String, age: Int) : this(name){
        this.page = age
        println(" age constructor! ")
    }

    constructor(name: String, age: Int, height: Int): this(name, age){
        this.pheight = height
        println(" height constructor! ")
    }
}

// 참고로 주/부 생성자 지정하지 않았을 경우 디폴트생성자(인자없음)이 자동생성됨