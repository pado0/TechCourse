package Daily_algo;

public class ex21_largestProductOfThree {
    public static int[] numbers;
    public static int[] select = new int[3];
    public static int maxSol = -2147000000;

    public static int largestProductOfThree(int[] arr) {
        // dfs로 3개 고르게 풀어볼까
        numbers = new int[arr.length];
        numbers = arr;
        dfs(0,0);
        return maxSol;
    }

    static void dfs(int i, int count){
        if(i > numbers.length) return;
        if(count == select.length ) {
            int mul = 1;
            for(int t=0 ; t< select.length ; t++){
                mul = mul * numbers[select[t]];
            }
            if(maxSol < mul) maxSol = mul;
            return;
        }
        else {
            // 고른다
            select[count] = i;
            dfs(i+1, count + 1);
            // 안고른다
            dfs(i+1, count);
        }
    }
}



