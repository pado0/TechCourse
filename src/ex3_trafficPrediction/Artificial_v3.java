package ex3_trafficPrediction;

public class Artificial_v3 {
    public static void main(String[] args) {
        float[][] xy_lists = {{374, 385, 375, 401}, {1161, 1401, 1621, 1681}};
        double sum = 0; // 오차의 합 변수

        System.out.println("[인공지능 프로그램 V3]");
        System.out.println("==============================");
        System.out.print("[안내] 인공지능 프로그램에 할당된 데이터");

        // 문제에서 주어진 값 그대로 출력
        for (int i = 0; i < xy_lists[0].length; i++) {
            System.out.println((i + 1) + "번 째 데이터) " +
                    "[실제값] 웹 페이지 방문자 수 : " + xy_lists[0][i] +
                    "[인공지능 예측값] 웹 페이지 방문자 수 : " + xy_lists[1][i]);
        }
        System.out.println();

        // 오차 출력
        for (int i = 0; i < xy_lists[0].length; i++) {
            float err = xy_lists[0][i] - xy_lists[1][i];
            System.out.println("[" + (i+1) + "번째 데이터] 실제 값과 예측값의 편차 : " + err);
            System.out.println("[안내] 오차의 제곱 : " + err * err);
            System.out.println();
            sum += err * err;
        }

        System.out.println("==============================");
        System.out.println("[안내] 인공지능 프로그램의 성능(오차의 제곱 합) : " + sum);
    }
}
