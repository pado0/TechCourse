package ex1_calculator;

public class MyExample {
    public static void main(String[] args) {
        // 구간 별 통행료 계산하기
        System.out.println("=================================");
        System.out.println("     자동차 탄소 배출량 과세 계산기");
        System.out.println(" -- 주행 거리와 주행 시간을 입력하세요--");
        System.out.println("=================================");

        printBill(100, 2);
        printBill(280, 3);
        printBill(320, 4);
        printBill(509, 5);

    }

    public static void printBill(int km, int time){
        System.out.println(km + "km 이동시 탄소 배출 과세는 " +
                DistanceCalculate(km, time)+ "원 입니다.");
    }

    public static double DistanceCalculate(int km, int time) {
        double result = 0; // 최종 결과값

        // 구간별로 탄소세 계산
        while (km > 0) { // 구간 별 계산 완료되어 더이상 계산할 값이 없으면 멈춤
            if (km <= 100) {
                result += km * 20 * time; // 구간에 다른 비용 합
                km = 0;
            } else if (km > 100 && km <= 200) {
                result += (km - 100) * 30* time; // 본 구간에서는 50에 대한 값만 계산
                km = 100; // 50에 대해 계산 해주었으니 나머지 100을 잔여 구간으로 남겨둠. 나머지 구간도 동일.
            } else if (km > 200 && km <= 300) {
                result += (km - 200) * 40* time;
                km = 200;
            } else {
                result += (km - 300) * 50* time;
                km = 300;
            }
        }
        return result;
    }
}
