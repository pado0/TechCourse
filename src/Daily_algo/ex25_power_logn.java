package Daily_algo;

import java.util.HashMap;
/*
// 사용한 생각
O(LogN) 이려면 분할정복 / 투포인터.. 같은 반씩 쪼개는 알고리즘 사용해야함.
2^5 = 2^2 * 2^2 * 2
    = (2^1*2^1) * (2^1*2^1) * 2

3^5 = 3^2 * 3^2 * 3^1
내가 이전에 구현한건 O(N)
 */

public class ex25_power_logn {
    static HashMap<Integer, Long> hashMap = new HashMap<>();
    final static Long DEVIDER = 94906249L;

    public static void main(String[] args) {

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
