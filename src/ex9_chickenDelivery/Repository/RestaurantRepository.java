package ex9_chickenDelivery.Repository;

import ex8_orderprogram.ItemRepository;
import ex9_chickenDelivery.Entity.Restaurant;

import java.util.HashMap;

public class RestaurantRepository {


    // 레퍼지토리 싱글톤 처리
    private static RestaurantRepository restaurantRepository;
    private RestaurantRepository() {
    }

    public static RestaurantRepository getInstance() {
        if(restaurantRepository == null) restaurantRepository = new RestaurantRepository();
        return restaurantRepository;
    }

    // 레스토랑 등록 해시 메모리
    private HashMap<String, Restaurant> hashMap = new HashMap<>();


    // 레스토랑 등록
    public void joinRestaurant(Restaurant restaurant) {
        hashMap.put(restaurant.getName(), restaurant);
    }

    // 레스토랑 전체 목록 조회
    public HashMap<String, Restaurant> getRestaurantList(){
        return hashMap;
    }

    // 상호명으로 레스토랑 조회
    public Restaurant getRestaurantByName(String name) {
        return hashMap.get(name);
    }
}
