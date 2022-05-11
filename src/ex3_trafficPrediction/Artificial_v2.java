package ex3_trafficPrediction;

import java.util.Scanner;

public class Artificial_v2 {
    public static void main(String[] args) {
        final int ITER_NUM = 4;
        double[] inputs = {580, 700, 810, 840};

        Scanner scanner = new Scanner(System.in);

        System.out.println("[인공지능 프로그램 V2]");
        System.out.println("==============================");
        System.out.print("[System] a 값을 입력하여 주세요 : ");
        int a = scanner.nextInt();

        System.out.print("[System] b 값을 입력하여 주세요 : ");
        int b = scanner.nextInt();
        System.out.println("==============================");
        System.out.println("[안내] 입력된 \'광고비\'는 다음과 같습니다. ");

        for(int i=0 ; i<ITER_NUM ; i++){
            System.out.print(i+1 + "번째) " + inputs[i] +"원 ");
        }

        System.out.println("\n[안내] AI의 \'웹 페이지 방문자\' 예측 결과는 다음과 같습니다. ");
        for(int i=0; i<ITER_NUM ; i++){
            System.out.println(i + "번째 예측) " + (a * inputs[i] + b) +"회 방문");}

        scanner.close();

    }
}
