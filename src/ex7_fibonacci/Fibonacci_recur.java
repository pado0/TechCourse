package ex7_fibonacci;

import java.util.HashMap;
import java.util.Scanner;

public class Fibonacci_recur {
    static HashMap<Integer, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {

        // 입력받는 함수
        int input = getUserInput();

        // 입력 예외처리
        if(input <= 0){
            System.out.println("[안내] 0개 이하를 입력하셨습니다. 출력물이 없어 프로그램을 종료합니다.");
            return;
        }

        // 피보나치 돌리기
        fibonacci(input-1);

        // 피보나치 출력
        printNumbers();

    }

    public static int getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("[안내] 피보나치 수열 프로그램 시작.");
        System.out.print("원하는 수열의 개수를 입력해 주세요 : ");
        return scanner.nextInt();
    }
    public static int fibonacci(int num) {

        if(hashMap.containsKey(num)) return hashMap.get(num);
        if (num == 0 || num == 1) {
            hashMap.put(num, 1);
            return 1;
        }

        int result = fibonacci(num-1) + fibonacci(num-2);
        hashMap.put(num, result);
        return result;
    }

    public static void printNumbers(){
        System.out.println("[피보나치 수열 출력]");
        for (Integer key : hashMap.keySet()) {
            System.out.println(hashMap.get(key));
        }
        System.out.println("[안내] 프로그램을 종료합니다.");
    }
}
