package Daily_algo_baekjoon;

import java.io.*;
import java.util.*;

/*
* 백준이가 정수를 외칠때마다, 동생은 지금까지 말한 값 중 중간값을 말해야함
* 짝수개라면 중간값 중 작은걸 말해야한다.
*
* -> 정렬 말고 우선순위 큐로 풀기.
* 그 수들의 가운데 있는 수를 말하는 것.
*
* */
public class growth2_1655 {
    public static void main(String[] args) throws IOException {
        // 시간초과 원인 2
        //Scanner scanner = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 우선순위 큐 정렬방법
        PriorityQueue<Integer> decPQ = new PriorityQueue<>((a,b) -> b - a);
        PriorityQueue<Integer> incPQ = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (decPQ.size() == incPQ.size()) {
                decPQ.add(x);
            } else incPQ.add(x);

            if (!decPQ.isEmpty() && !incPQ.isEmpty() && decPQ.peek() > incPQ.peek()) {
                incPQ.add(decPQ.poll()); // 얘가 들어와도, inc의 peek는 변하지 않음
                decPQ.add(incPQ.poll());
            }
            bw.write(decPQ.peek()+"\n");
            //System.out.println(decPQ.peek());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
