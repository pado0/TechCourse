package Daily_algo;

public class Main {
    public static void main(String[] args) {
        func(new int[10]);

    }

    public static void func(int[] arr){
        arr[0] = 0;
        arr[1] = 1;

        for (int i : arr) {
            System.out.println("i = " + i);
        }
    }
}
