package ex8_orderprogram;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int input;
        while (true) {
            System.out.print("[System] 코드스테이츠 점장님 어서오세요.\n" +
                    "[System] 해당 프로그램의 기능입니다.\n" +
                    "1. 물건 정보(제품명) 등록하기\n" +
                    "2. 물건 정보(제품명) 등록 취소하기\n" +
                    "3. 물건 넣기 (제품 입고)\n" +
                    "4. 물건 빼기 (제품 출고)\n" +
                    "5. 재고 조회\n" +
                    "6. 프로그램 종료\n" +
                    "------------------------------\n" +
                    "[System] 원하는 기능의 번호를 입력하세요 :");

            input = scanner.nextInt();

            if(input == 6) {
                System.out.println("[System] 프로그램을 종료합니다.\n" +
                        "[System] 감사합니다.");
                OrderSystem.getOrderSystem().closeScanner();
                scanner.close();
                break;
            }

            switch (input){
                case 1:
                    OrderSystem.getOrderSystem().joinItemService();
                    break;
                case 2:
                    OrderSystem.getOrderSystem().deleteItemService();
                    break;
                case 3:
                    OrderSystem.getOrderSystem().addItemService();
                    break;
                case 4:
                    OrderSystem.getOrderSystem().subItemService();
                    break;
                case 5:
                    OrderSystem.getOrderSystem().printListWithCount();
                    break;

                default:
                    System.out.println("틀린 번호입니다. 다시 입력해주세요.");
                    break;
            }

        }
    }
}






/*
[System] 코드스테이츠 점장님 어서오세요.
[System] 해당 프로그램의 기능입니다.
1. 물건 정보(제품명) 등록하기
2. 물건 정보(제품명) 등록 취소하기
3. 물건 넣기 (제품 입고)
4. 물건 빼기 (제품 출고)
5. 재고 조회
6. 프로그램 종료
* */