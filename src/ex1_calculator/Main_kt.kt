package ex1_calculator

fun main(args: Array<String>) {
    println("=========================")
    println(" 주택용 전기요금(저압) 계산기 in kt")
    println("=========================")

    printBill(99)
    printBill(150)
    printBill(250)
}
fun printBill(capa:Int) {
    println("$capa kWh의 전기요금은 ${ElectricBillCalculate(capa)}원 입니다.")
}

fun ElectricBillCalculate(kwh: Int) : Double {
    var result = 0.0 // 가변변수 선언 IN DOUBLE
    var tkwh = kwh // 코틀린은 매개변수 값 변경 불가하므로 별도 변수로 선언
    while (tkwh > 0) {
        if (tkwh <= 100) {
            result += tkwh * 60.7
            tkwh = 0
        } else if (tkwh in 101..200) { // 범위지정 연산자로 변환. a..b : a<=x<=b
            result += (kwh - 100) * 125.9
            tkwh = 100
        } else if (tkwh in 201..300) {
            result += (kwh - 200) * 187.9
            tkwh = 200
        } else if (tkwh in 301..400) {
            result += (kwh - 300) * 280.6
            tkwh = 300
        } else if (tkwh in 401..500) {
            result += (tkwh - 400) * 417.7
            tkwh = 400
        } else {
            result += (tkwh - 500) * 670.6
            tkwh = 500
        }
    }
    return result
}

