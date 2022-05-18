package Daily_algo

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list) // toString이 디폴트 출력으로 고정되어있음.
    println(joinToString(list, ";", "[", "]"))
    println(joinToString(list, postfix = "k", prefix = "b", separator = "|"))
    println(joinToString(list, postfix = "k", prefix = "b"))

}

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = " * ",
    prefix: String = "{ ",
    postfix: String = " }"
): String {
    val result = java.lang.StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString();
}