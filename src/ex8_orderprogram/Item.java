package ex8_orderprogram;

public class Item {

    private int id; // item id
    private String name; // 제품 이름
    private int count;   // 제품 수량

    // Item 생성자로 카운트는 0으로 세팅해주기
    public Item(String name, int count) {
        this.count = count;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
