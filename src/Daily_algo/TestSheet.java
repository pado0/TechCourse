package Daily_algo;

import java.util.*;



public class TestSheet {

    static HashMap<Integer, Long> hashMap = new HashMap<>();
    final static Long DEVIDER = 94906249L;

    public static void main(String[] args) {

        System.out.println(power(5, 22));


    }

    public static long power(int base, int exponent) {

        if (exponent == 0) return 1;
        //if (exponent == 1) return base; //%2 조건 if 문에 걸려서 없어도 됨

        int devided = exponent / 2;
        Long tmp = power(base, devided);
        Long result_loop = tmp * tmp % DEVIDER;

        if(exponent % 2 == 1) return result_loop * base % DEVIDER;
        return result_loop;
    }
}



