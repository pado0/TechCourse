package ex9_chickenDelivery;

import ex9_chickenDelivery.service.OrderService;
import ex9_chickenDelivery.service.RestaurantService;
import ex9_chickenDelivery.service.ReviewService;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            int n = printGuide();

            switch (n){
                case 1:
                    scanner.nextLine();// 입력제거
                    RestaurantService.getInstance().regRestaurant();
                    break;
                case 2:
                    scanner.nextLine();// 입력제거
                    ReviewService.getInstance().getReviews();
                    break;
                case 3:
                    scanner.nextLine();// 입력제거
                    OrderService.getInstance().orderMenu();
                    break;
                case 4:
                    scanner.nextLine();// 입력제거
                    ReviewService.getInstance().writeReview();
                    break;
            }
            if(n == 5) {
                System.out.println("[안내] 이용해주셔서 감사합니다.");
            }
        }

    }

    public static int printGuide(){
        System.out.println("[치킨의 민족 프로그램 V1] \n" +
                "-------------------------\n" +
                "1) [사장님용] 음식점 등록하기\n" +
                "2) [고객님과 사장님용] 음식점 별점 조회하기\n" +
                "3) [고객님용] 음식 주문하기\n" +
                "4) [고객님용] 별점 등록하기\n" +
                "5) 프로그램 종료하기\n" +
                "-------------------------\n" +
                "[시스템] 무엇을 도와드릴까요? ");
        System.out.print(">>> ");
        int input = scanner.nextInt();
        return input;
    }
}
