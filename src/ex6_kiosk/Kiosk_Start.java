package ex6_kiosk;

import java.util.Arrays;

public class Kiosk_Start {
    public static void main(String[] args) {


        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("------------------------------");

        Order order = new Order();

        // 안내문구 출력
        order.printGuide();

        // 메뉴 번호 입력
        order.chooseNum();

        // 메뉴 수량 입력
        order.chooseOrderQuantity();

        order.output(order.getMenuNum(), order.getOrderQuantity());


    }
}
