package Daily_algo_baekjoon;
import java.util.Scanner;

public class growth1_12865 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int sol = 0;
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[][] dp = new int[N + 1][K + 1];
        int[] w = new int[N + 1];
        int[] v = new int[N + 1];

        for (int i = 1; i <= N; i++) {

            w[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
        }
        // dp 시작
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                dp[i][j] = dp[i - 1][j]; // j - w[i] < 0일 때도 기록 해줘야함.
                if(j - w[i] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
                }
            }
        }

        System.out.println(dp[N][K]);
    }
}
