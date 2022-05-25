package Daily_algo_baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStream
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Collections
import java.util.PriorityQueue

fun main(args: Array<String>) {

    val dec = PriorityQueue<Int>(Collections.reverseOrder())
    val inc = PriorityQueue<Int>()

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    repeat(n) {
        val input = br.readLine().toInt()

        if (dec.size == inc.size) {
            dec.add(input)
        }else{
            inc.add(input)
        }

        if (!dec.isEmpty() && !inc.isEmpty() &&
            dec.peek() > inc.peek()
        ) {
            inc.add(dec.poll())
            dec.add(inc.poll())
        }
        val output = dec.peek()
        bw.write("$output\n")

    }

    bw.flush()
    bw.close()
    br.close()
}