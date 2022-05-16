package ex6_kiosk;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Order {
    private int menuNum;
    private int orderQuantity;

    private static int[] numList = { 1, 2, 3, 4 };
    private static int[] costList = {1000, 1500, 1000, 2000};

    // 주문 안내문구 출력
    public void printGuide(){
        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)");
    }

    // 메뉴 선택
    public void chooseNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        this.menuNum = scanner.nextInt();
        if (!IntStream.of(numList).anyMatch(x -> x == this.menuNum)) {
            System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.\n");
            chooseNum();
        }
    }

    // 수량 입력
    public void chooseOrderQuantity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.");
        System.out.println("(※ 최대 주문 가능 수량 : 99)");
        this.orderQuantity = scanner.nextInt();

        if(this.orderQuantity >= 100){
            System.out.println("[경고]" + this.orderQuantity+"개는 입력하실 수 없습니다.");
            System.out.println("[경고] 수량 선택 화면으로 돌아갑니다.");
            chooseOrderQuantity();
        }
    }

    // 결제 금액 출력
    public void output(int menuNum, int orderQuantity) {
        int totalCost = costList[menuNum-1] * orderQuantity;
        System.out.println("[안내] 주문하신 메뉴의 총 금액은 "+ totalCost + "원 입니다.");
        System.out.println("[안내] 이용해 주셔서 감사합니다.");
    }

    public int getMenuNum() {
        return menuNum;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public static int[] getNumList() {
        return numList;
    }
}
