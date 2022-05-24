package ex9_chickenDelivery.service;

import ex9_chickenDelivery.Entity.Order;
import ex9_chickenDelivery.Entity.Restaurant;
import ex9_chickenDelivery.Main;
import ex9_chickenDelivery.Repository.OrderRepository;
import ex9_chickenDelivery.Repository.RestaurantRepository;

import java.util.HashMap;

import static ex9_chickenDelivery.Main.scanner;

public class OrderService {

    private static OrderService orderService;

    private OrderService() {
    }

    public static OrderService getInstance(){
        if(orderService == null) orderService = new OrderService();
        return orderService;
    }

    OrderRepository orderRepository = OrderRepository.getInstance();
    RestaurantRepository restaurantRepository = RestaurantRepository.getInstance();

    // 메뉴 주문
    public void orderMenu(){
        System.out.println("[안내] 고객님! 메뉴 주문을 진행하겠습니다!");
        System.out.println("[안내] 주문자 이름을 알려주세요!");

        System.out.print(">>> " );
        String customerName = Main.scanner.nextLine();

        System.out.println("[안내] 주문할 음식점 상호는 무엇인가요?");
        System.out.print(">>> " );
        String restaurantName = Main.scanner.nextLine();

        // 예외처리. 상호명 기준으로 repository 조회
        Restaurant restaurant = restaurantRepository.getRestaurantByName(restaurantName);

        // 예외처리. 등록되지 않은 상호일때
        if(restaurant == null){
            System.out.println("존재하지 않는 음식점 상호입니다. 다시 입력해주세요.");
            orderMenu();
            return;
        }

        System.out.println("[안내] 주문할 메뉴 이름을 알려주세요!");
        System.out.print(">>> " );
        String menuName = Main.scanner.nextLine();

        // 예외처리. 해당 상호에 없는 메뉴일때
        if(!restaurant.getMainMenu().equals(menuName)){
            System.out.println("해당 음식점에 존재하지 않는 메뉴입니다. 처음부터 다시 입력해주세요.");
            orderMenu();
            return;
        }

        orderRepository.joinOrder(new Order(customerName, restaurantName, menuName));
        System.out.println("[안내]" +customerName+"님!");
        System.out.println("[안내] " +restaurantName +"매장에 " + menuName +"주문이 완료되었습니다.");
    }
}
