package ex7_fibonacci;

import java.util.Scanner;

public class Fibonacci_array {

    public static void main(String[] args) {

        // 입력받는 함수
        int fibonacciNum = getUserInput();

        // 피보나치 돌리기
        int[] fibonacci = new int[fibonacciNum];
        getFibonacci(fibonacci);

        // 피보나치 출력
        printNumbers(fibonacci);

    }

    // 입력함수
    public static int getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("[안내] 피보나치 수열 프로그램 시작.");
        System.out.print("원하는 수열의 개수를 입력해 주세요 : ");
        return scanner.nextInt();
    }

    // 피보나치 계산 함수
    public static void getFibonacci(int fibonacci[]) {

        for(int i=0 ; i<fibonacci.length ; i++){
            if(i == 0 || i == 1) fibonacci[i] = 1;
            else{
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
    }

    // 수열 출력 함수
    public static void printNumbers(int[] fibonacci){
        System.out.println("[피보나치 수열 출력]");
        for (int i : fibonacci) {
            System.out.println(i);
        }
    }
}
