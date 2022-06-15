package kotlin_practice

import javax.crypto.Cipher

fun main() {

    // toString 상속받지 않으면 주소값 리턴
    println(Client("name", 123))

    val client1 = Client("hyo", 321)
    val client2 = Client("hyo", 321)
    // equals()를 상속받지 않으면 false 리턴
    println(client1.equals(client2))

    val processed = hashSetOf(Client("jin", 456))
    // hashcode()를 상속받지 않으면 false 리턴
    println(processed.contains(Client("jin", 456)))

}


class Client(val name: String, val postalCode: Int){

    // toString() 오버라이드 하여 사용
    override fun toString() = "clinet $name $postalCode"

    // equals() 오버라이드하여 사용
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Client)
            return false
        // 두 객체 프로퍼티 값이 같은지 확인 후 bool 리턴
        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int = name.hashCode() *  31 + postalCode
}

