package ex2_99dan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MIN_RANGE = 2;
        final int MAX_RANGE = 9;

        System.out.print("[안내] 희망하는 구구단을 숫자로 입력해 주세요 (2~9) : ");

        // 스캔으로 입력받기
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        scanner.close(); // 스캐너 명시적으로 닫기

        System.out.println(input + " 단 이 입력되었습니다.");

        // 범위를 벗어나면 경고 출력하고 프로그램 종료하기
        if(input > MAX_RANGE || input < MIN_RANGE){
            System.out.println("[경고] 구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.");
            System.out.println("프로그램을 종료합니다.");
            return;
        }

        // 범위안에 있으면 반복하며 구구단 출력하기
        for(int i=1 ; i <= MAX_RANGE ; i++){
            System.out.println(input + " * " + i + " = " + (input * i));
        }
    }
}
