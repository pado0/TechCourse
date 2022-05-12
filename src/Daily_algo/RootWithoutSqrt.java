package Daily_algo;

public class RootWithoutSqrt {
    public static void main(String[] args) {
        int num = 2;
        double xn1;
        double xn = 1.000;

        while(true){
            System.out.println("xn = " + xn);

            // 근접한 제곱수를 구한다.
            xn1 = ( xn * xn + num ) / (2 * xn);
            System.out.println("xn1 = " + xn1);

            // 구한 제곱수의 제곱을 구한다.
            double xn2 = xn1 * xn1;
            System.out.println("xn2 = " + xn2);

            // 제곱한 값이 실제값과 유사한지 비교한다
            if( Math.round(xn2*1000)/1000.0 == num) {
                System.out.println(Math.round(xn2*1000)/1000);
                System.out.println(String.valueOf(xn1));
                break;
            }

            // 유사하지 않다면 추정치 변경해서 다시 실행한다.
            xn = xn + 0.001;

        }

    }
}