package ex9_chickenDelivery.Repository;

import ex9_chickenDelivery.Entity.Order;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderRepository {

    private static OrderRepository orderRepository;

    private OrderRepository() {
    }

    public static OrderRepository getInstance() {
        if(orderRepository == null) orderRepository = new OrderRepository();
        return orderRepository;
    }

    // 주문은 중복이 가능하므로 ArrayList를 사용하자
    // private HashMap<String, Order> hashMap = new HashMap<>();
    private List<Order> orders = new ArrayList<>();

    public void joinOrder(Order order) {
        //hashMap.put(order.getCustomerName(), order);
        orders.add(order);
    }

    // 주문자 명으로 주문이력 찾기
    public List<Order> findOrderByCustomerName(String customerName) {

        List<Order> tmpOrders = new ArrayList<>();
        for (Order order : orders) {
            if(order.getCustomerName().equals(customerName)){
                tmpOrders.add(order);
            }
        }

        return tmpOrders;
    }
}

