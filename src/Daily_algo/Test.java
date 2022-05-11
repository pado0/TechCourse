package Daily_algo;

public class Test {
    public static void main(String[] args) {
        //Example example = new Example();
        Example example1 = new Example(5, 10);
    }

}
class Example{
    public Example(){
        System.out.println("기본생성자");
    }

    public Example(int x) {
        this();
        System.out.println("매개변수 1개 생성자");
    }

    public Example(int x, int y){
        this(10);
        System.out.println("매개변수 2개 생성자");
    }
}