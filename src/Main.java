public class Main {
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println(" 주택용 전기요금(저압) 계산기");
        System.out.println("=========================");

        printBill(99);
        printBill(150);
        printBill(250);
        printBill(301);
        printBill(450);
        printBill(510);
    }

    // main에서 입력을 깔끔하게 하기 위해 별도로 print 함수 선언
    public static void printBill(int capa){
        System.out.println(capa + "kWh의 전기 요금은 " +
                ElectricityBillCalculate(capa)+ "원 입니다.");
    }

    // 전기요금 계산하는 함수 선언
    public static double ElectricityBillCalculate(int kwh) {
        double result = 0; // 최종 결과값

        // 구간별로 전기요금 게산
        while (kwh > 0) { // 구간 별 계산 완료되어 더이상 계산할 값이 없으면 멈춤
            if (kwh <= 100) {
                result += kwh * 60.7; // 구간에 다른 비용 합
                kwh = 0;
            } else if (kwh > 100 && kwh <= 200) {
                result += (kwh - 100) * 125.9; // 150kwh면, 본 구간에서는 50에 대한 값만 계산
                kwh = 100; // 50에 대해 계산 해주었으니 나머지 100을 잔여 구간으로 남겨둠. 나머지 구간도 동일.
            } else if (kwh > 200 && kwh <= 300) {
                result += (kwh - 200) * 187.9;
                kwh = 200;
            } else if (kwh > 300 && kwh <= 400) {
                result += (kwh - 300) * 280.6;
                kwh = 300;
            } else if (kwh > 400 && kwh <= 500) {
                result += (kwh - 400) * 417.7;
                kwh = 400;
            } else {
                result += (kwh - 500) * 670.6;
                kwh = 500;
            }
        }
        return result;
    }


}