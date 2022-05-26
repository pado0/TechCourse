package Daily_study_example;

import java.util.ArrayList;

public class ch14_lambda {

    public static void main(String[] args) {

        // 익명함수 형태
        MyFunction f = new MyFunction() {
            @Override
            public int oper(int a, int b) {
                return a + b;
            }
        };

        // 람다형태
        MyFunction f2 = (int x , int y) -> x + y;
        
        int result = f2.oper(1, 2);
        System.out.println("result = " + result);
        System.out.println("result = " + f2.oper(3, 4));

        f2 = (int x, int y) -> x * y;
        result = f2.oper(1, 2);
        System.out.println("result = " + result);
        System.out.println("result = " + f2.oper(3, 4));

        // 메서드 레퍼런스
        MyFunction f3 = Integer::sum;
        System.out.println(f3.oper(10, 10));

        Calculator c1 = new Calculator();
        
        MyFunction f4 = c1::mul; // 내가 정의한 함수로 Myfunction 재정의
        System.out.println("f4.sum(10,20) = " + f4.oper(10,20));

        // 컬렉션에 정의된 함수형 인터페이스, ex foreach
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.forEach(i -> System.out.println(i));
        arrayList.forEach(System.out::println);
    }
    
    static class Calculator{
        public int mul(int x, int y) {
            return x * y;
        }
    }
    
}
interface MyFunction {
    public abstract int oper(int a, int b);
}
