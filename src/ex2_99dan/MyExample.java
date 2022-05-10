package ex2_99dan;

import java.util.Scanner;

public class MyExample {
    public static void main(String[] args) {
        final int MIN_RANGE = 2;
        final int MAX_RANGE = 9;
        // 스캐너 만들기
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("[안내] 희망하는 구구단을 숫자로 입력해 주세요 (2~9)");
            System.out.print("종료를 원한다면 -1를 입력해주세요 : ");


            int input = scanner.nextInt();

            if(input == -1) break;
            System.out.println(input + " 단 이 입력되었습니다.");

            // 범위를 벗어나면 경고 출력하고 프로그램 종료하기
            if (input > MAX_RANGE || input < MIN_RANGE) {
                System.out.println("[경고] 구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.");
                System.out.println("값을 다시 입력해주세요.");
                continue;
            }

            // 범위안에 있으면 반복하며 구구단 출력하기
            for (int i = 1; i <= MAX_RANGE; i++) {
                System.out.println(input + " * " + i + " = " + (input * i));
            }
        }
        scanner.close(); // 스캐너 명시적으로 닫기
    }
}
