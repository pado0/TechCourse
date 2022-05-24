package ex9_chickenDelivery.Entity;

public class Restaurant {
    private String name;
    private String mainMenu;
    private int mainMenuPrice;

    private Review review;



    public Restaurant(String name, String mainMenu, int mainMenuPrice) {
        this.name = name;
        this.mainMenu = mainMenu;
        this.mainMenuPrice = mainMenuPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(String mainMenu) {
        this.mainMenu = mainMenu;
    }

    public int getMainMenuPrice() {
        return mainMenuPrice;
    }

    public void setMainMenuPrice(int mainMenuPrice) {
        this.mainMenuPrice = mainMenuPrice;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
