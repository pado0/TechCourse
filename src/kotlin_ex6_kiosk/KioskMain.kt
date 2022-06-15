package kotlin_ex6_kiosk

import java.util.*

fun main (){
    // Kisok main 함수
    // 스캐너 열기
    var scanner = Scanner(System.`in`)

    println("원하는 메뉴의 번호를 입력해주세요")
    println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)")
    val menuNum = scanner.nextInt()

    println("메뉴의 수량을 입력해주세요")
    val menuCount = scanner.nextInt()

    // order 생성
    var order = OrderMenu("메뉴명", menuNum, 1000, menuCount)

    println(order.totalPrice(order.menuPrice, order.menuCount))


}