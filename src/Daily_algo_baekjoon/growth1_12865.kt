package Daily_algo_baekjoon

import java.util.Scanner
import kotlin.math.max

fun main(args: Array<String>) {

    // 입력 스캐너 세팅
    var scanner = Scanner(System.`in`)

    // 변수세팅
    var n = scanner.nextInt()
    var k = scanner.nextInt()
    var w = IntArray(n+1)
    var v = IntArray(n+1)

    for(i in 1..n){
        w[i] = scanner.nextInt()
        v[i] = scanner.nextInt()
    }

    //dp[i][j] : i - 가방번호, j - 증가시키는 무게
    var dp = Array(n+1) { IntArray(k + 1) { 0 } }

    for (i in 1..n) {
        for (j in 1..k) {
            // 가방 크기가 넣으려는 물건 무게보다 작을 때, 안넣는다.
            dp[i][j] = dp[i-1][j] // j=3kg까지 담을 수 있을때 i=4kg라면 i-1번째 물건 가치 유지

            // 가방 크기가 넣으려는 물건 무게보다 클때, 넣을지 말지 값 비교
            if(j - w[i] >= 0) {
                dp[i][j] = max(dp[i-1][j], dp[i-1][j - w[i]] + v[i])
            }
        }
    }
    println(dp[n][k])
}