package Daily_algo;

import java.util.*;


public class ex29_tiling_dp {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println(tiling(4));
    }

    static int tiling(int num) {

        for(int i = 0 ; i < num ; i++){
            if(i == 0) arrayList.add(1);
            else if(i == 1) arrayList.add(2);
            else{
                arrayList.add(arrayList.get(i-1) + arrayList.get(i-2));
            }
        }

        return arrayList.get(num-1);
    }
}
