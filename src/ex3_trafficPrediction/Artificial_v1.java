package ex3_trafficPrediction;

/*
웹 페이지 방문자 수  = (a * 광고비 ) + b
* */

import java.util.Scanner;

public class Artificial_v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("[인공지능 프로그램 V1]\n" +
                "==============================\n" +
                "[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : ");

        int fee = scanner.nextInt();
        int a = 2;
        int b = 1;

        System.out.println("[안내] 입력된 광고비는 "+ fee +" 원 입니다.");
        System.out.println("[안내] AI의 예측(클릭 수)은 "+ (a * fee + b) +"회 입니다.");

        scanner.close();
    }
}
