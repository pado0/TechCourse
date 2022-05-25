package Daily_study_example;

public class Ch10_innerclass {
    public static void main(String[] args) {
        Outer outer = new Outer();
    }
}

class Outer{
    private int num =1;
    private InClass inClass;
    public Outer() {
        inClass = new InClass();
    }

    class InClass {
        void print(){
            System.out.println("chk");
        }
    }

}
