package Daily_algo_baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
* 백준이가 정수를 외칠때마다, 동생은 지금까지 말한 값 중 중간값을 말해야함
* 짝수개라면 중간값 중 작은걸 말해야한다.
*
* 넣고 정렬
* -> 정렬 말고 우선순위 큐로 풀기.
* */
public class growth2_1655 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
            int[] tmp = new int[i+1];
            for(int j=0 ; j<=i ; j++){
                tmp[j] = arr[j];
            }

            Arrays.sort(tmp);
            int l = tmp.length;
            if(l%2 == 1) System.out.println(tmp[l/2]);
            else System.out.println(tmp[l/2 -1]);
        }
        // 1 -> 0
        // 1 5 -> 0
        // 1 2 5 -> 1
        // 1 2 5 10 -> 1
        // 1 2 5 10 11 ->2

        System.out.println();
    }
}
