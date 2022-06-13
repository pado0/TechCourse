package kotlin_practice

// [사용의 이유] 컴파일러가 기반 클래스의 하위 클래스를 몰라서, 예외처리를 강제함
// 세 가지 클래스
abstract class PersonState
class Running : PersonState()
class Walking : PersonState()
class Idle : PersonState()

// 각 state 별 문구를 출력해야함
// else 브랜치 강제하는 이유 : 컴파일러가 PersonState를 상속받는 하위 클래스의 종류를 알지 못하기 때문
fun getStateMessage(personState: PersonState) : String{
    return when (personState) {
        is Running -> "Person is running"
        is Walking -> "Person is walking"
        is Idle -> "Person is doing nothing"
        else -> "no state" // kotlin에서 else 브랜치를 강제
    }
}

// [사용예시] sealed 클래스로 컴파일러에게 하위 클래스가 무엇인지 알게되어 else절 불필요
sealed class DogState
class DogRunning : DogState()
class DogWalking : DogState()
class DogIdle : DogState()

fun getDonStateMessage(dogState: DogState): String {
    return when (dogState) {
        is DogRunning -> "run"
        is DogWalking -> "walk"
        is DogIdle -> "idle"
    }
}

// [사용예시 2] oject는 싱글톤 패턴으로 한번만 메모리에 올라가고 재사용됨. 상태가 없는 경우 object로 정의
sealed class CatState
object CatRunning : CatState()
object CatWalking : CatState()
object CatIdle : CatState()

fun getCatStateMessage(catState: CatState): String {
    return when (catState) {
        is CatRunning -> "run"
        is CatWalking -> "walk"
        is CatIdle -> "idle"
    }
}

fun main(){

}
