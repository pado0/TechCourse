package Daily_study_example;

public class Polymor {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyCoffee(new Americano(1000));
        customer.buyCoffee(new CaffeLatte(2000));

        System.out.println(customer.money + "원 남았습니다.");
    }
}

class Coffee{
    int price;

    public Coffee(int price) {
        this.price = price;
    }
}

class Americano extends Coffee {
    public Americano(int price) {
        super(price);
    }
    @Override
    public String toString(){
        return "아메리카노";
    }
}

class CaffeLatte extends Coffee {
    public CaffeLatte(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "카페라떼";
    }
}

class Customer{
    int money = 50000;

    void buyCoffee(Coffee coffee) {
        if (money < coffee.price) {
            System.out.println("잔약이 부족");
            return;
        }
        money = money - coffee.price;
        System.out.println(coffee + "를 구입했습니다.");
    }
}