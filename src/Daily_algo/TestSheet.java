package Daily_algo;

public class TestSheet {
    public static void main(String[] args) {
        String str = "YlQO uT9";
        int sum = 0;
        int count = 0;

        for(int i=0 ; i< str.length(); i++){
            char c = str.charAt(i);
            int base = c - '0';
            System.out.println("base: " + base);
            // 숫자인지 찾기
            if(base >= 0 && base <= 9){
                sum += base;
                count++;
            }
            // 공백인지 찾기
            else if(c == ' ') {
                System.out.println("chk");
                count++;
            }
        }

        System.out.println(sum);
        System.out.println(count);
        System.out.println((int)Math.round(sum/count +0.0));
    }

}
