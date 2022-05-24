package ex9_chickenDelivery.service;

import ex9_chickenDelivery.Entity.Restaurant;
import ex9_chickenDelivery.Main;
import ex9_chickenDelivery.Repository.RestaurantRepository;
import ex9_chickenDelivery.Repository.ReviewRepository;

import java.util.HashMap;

import static ex9_chickenDelivery.Main.scanner;

public class RestaurantService {

    private static RestaurantService restaurantService;

    private RestaurantService() {
    }

    public static RestaurantService getInstance(){
        if(restaurantService == null) restaurantService = new RestaurantService();
        return restaurantService;
    }

    RestaurantRepository restaurantRepository = RestaurantRepository.getInstance();

    // 레스토랑 등록
    public void regRestaurant(){
        System.out.println("[안내] 반갑습니다. 가맹주님!\n" +
                           "[안내] 음식점 상호는 무엇인가요?");
        System.out.print(">>> ");
        String restaurantName = Main.scanner.nextLine();


        System.out.println("[안내] 대표 메뉴 이름은 무엇인가요?");
        System.out.print(">>> ");
        String mainMenu = Main.scanner.nextLine();

        System.out.println("[안내] 해당 메뉴 가격은 얼마인가요?");
        System.out.print(">>> ");
        int mainMenuPrice = Main.scanner.nextInt();

        restaurantRepository.joinRestaurant(new Restaurant(restaurantName, mainMenu, mainMenuPrice));
        System.out.println("[안내] " + restaurantName+"에 음식("+ mainMenu +"," + mainMenuPrice+ ") 추가되었습니다");

        System.out.println("[시스템] 가게 등록이 정상 처리되었습니다.");
    }

    // 등록된 레스토랑 출력 (테스트용)
    public void printRestaurantList(){
        HashMap<String, Restaurant> restaurantList = restaurantRepository.getRestaurantList();
        for (String s : restaurantList.keySet()) {
            // 등록된 레스토랑 출력
            System.out.println("상호명 = " + s);
        }
    }
}
