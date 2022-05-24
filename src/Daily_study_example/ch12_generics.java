package Daily_study_example;

import java.util.ArrayList;
import java.util.Comparator;

public class ch12_generics {
    public static void main(String[] args) {
        Basket basket = new Basket("String");
        String a = (String) basket.getObject();
        Box<String> box = new Box<>();
        box.setItem("String 입니다.");
        System.out.println("box = " + box.getItem());

        Box<Integer> box2 = new Box<>();
        box2.setItem(1234);

        System.out.println(returnInput(123));
        System.out.println(returnInput("String"));
        System.out.println(returnInput(box2));
    }
    static <T> T returnInput(T id) {
        return id;
    }

    static class Box<T>{

        T item;
        T[] itemArr; // T타입 배열을 위한 참조변수

        void setItem(T item) {
            this.item = item;
        }

        T getItem() {
            return this.item;
        }
    }
}
class Basket {
    public Basket(Object object) {
        this.object = object;
    }

    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

