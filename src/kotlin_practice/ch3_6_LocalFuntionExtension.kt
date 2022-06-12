package kotlin_practice;

fun main (args : Array<String>){
    saveUserV1(User(1, "one", "seoul"))
    saveUserV2(User(2, "two", "busan"))
    saveUserV3(User(3, "three", "jeju"))
    saveUserV4(User(4, "four", ""))
}

class User(val id: Int, val name: String, val address: String)

// 필드 검증 중복 버전
fun saveUserV1(user: User) {
    if(user.name.isEmpty()){
        throw java.lang.IllegalArgumentException("can't save user name")
    }

    if (user.address.isEmpty()) {
        throw java.lang.IllegalArgumentException("can't save user address")
    }
}

// 검증용 함수 분리하기
fun saveUserV2(user: User) {
    fun validate(user: User, value: String, fieldName: String) {
        if(value.isEmpty()) {
            throw java.lang.IllegalArgumentException("can't save ${user.id} "+ "${fieldName}")
        }
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
}

// 로컬 함수에서 바깥 함수의 파라미터 접근하기
fun saveUserV3(user: User){
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw java.lang.IllegalArgumentException("cant save ${user.id} $fieldName") // user에 직접 접근 가능
        }
    }

    validate(user.name, "Name")
    validate(user.address, "address")
}

// 확장함수로 분리
fun saveUserV4(user: User){
    user.validateBeforeSave();
}

// User의 확장함수로 사용하면 user의 프로퍼티를 직접 사용할 수 있음
fun User.validateBeforeSave(){
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw java.lang.IllegalArgumentException("cant save ${id} $fieldName") // user에 직접 접근 가능
        }
    }

    validate(name, "Name")
    validate(address, "address")
}