package Daily_study_example;

public class ch14_lambda {

    public static void main(String[] args) {

        // 익명함수 형태
        MyFunction f = new MyFunction() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        // 람다형태
        MyFunction f2 = (int x , int y) -> x + y;
        int result = f2.sum(1, 2);
    }
}
interface MyFunction {
    public abstract int sum(int a, int b);
}