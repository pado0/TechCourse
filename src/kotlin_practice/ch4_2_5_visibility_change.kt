package kotlin_practice

fun main(){

    val lc = LengthCounter()
    println(lc.counter)
    lc.addWord("123")
    println(lc.counter)

    // lc.counter = 10 // set이 private라 오류


}

class LengthCounter{
    var counter: Int = 0
        private set

    fun addWord(word: String){
        counter += word.length
    }
}