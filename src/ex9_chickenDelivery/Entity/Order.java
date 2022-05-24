package ex9_chickenDelivery.Entity;

import ex9_chickenDelivery.MemberType;

public class Order {

    private String customerName;
    private String restaurantName;
    private String menuName;

    public Order(String customerName, String restaurantName, String menuName) {
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.menuName = menuName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
