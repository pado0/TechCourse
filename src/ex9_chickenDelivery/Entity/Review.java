package ex9_chickenDelivery.Entity;

public class Review {
    private String customerName;
    private String restaurantName;
    private String menuName;
    private int starPoint;

    public Review(String customerName, String restaurantName, String menuName, int starPoint) {
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.menuName = menuName;
        this.starPoint = starPoint;
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

    public int getStarPoint() {
        return starPoint;
    }

    public void setStarPoint(int starPoint) {
        this.starPoint = starPoint;
    }
}
