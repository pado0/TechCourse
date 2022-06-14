package kotlin_practice;

fun main(){
    println(PrivateUser("hyo"))
    println(SubscribingUser("gywls@namve.rocm").nickname) // .nickname 형식으로 getter 호출.
}

interface UserI {
    val nickname:String
}

// 주생성자에서 인터페이스 프로퍼티 값 정의
class PrivateUser(override val nickname: String) : UserI

// 커스텀 게터 호출시마다 @ 기준 파싱하여 전달.
// nickname이 커스텀 게터에서 연산된 값으로 세팅됨.
class SubscribingUser(val email: String) : UserI{
    override val nickname: String
        get() = email.substringBefore("@") // 커스텀 게터 선언
}

