package kotlin_ex6_kiosk
class OrderMenu (var menuName: String,
                 var menuNum: Int,
                 var menuPrice: Int,
                 var menuCount: Int){

    fun totalPrice(price: Int, count: Int): Int {
        return price * count

    }
}