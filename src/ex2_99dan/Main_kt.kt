package ex2_99dan

fun main(args: Array<String>) {
    val minBound = 2 // name 컨벤션이 명확하다.
    val maxBound = 9

    print("[안내] 희망하는 구구단을 숫자로 입력해 주세요 (2~9) : ")
    val input = readLine()!!.toInt() // 입력이 매우 편리하다.

    println("$input 단이 입력되었습니다.")

    if(input < minBound || input > maxBound){
        println("[경고] 구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.")
        println("프로그램을 종료합니다.")
    }


    for (i in 1..maxBound) {
        println("$input * $i = ${input * i}")
    }

}