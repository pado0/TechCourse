package ex11_kakaobank_re;

import java.sql.SQLOutput;
import java.util.Scanner;


public class BankProgram {
    static Scanner sc = new Scanner(System.in);

    public static String inputName(){
        // 계좌명
        System.out.println("생성할 계좌명을 입력해주세요.");

        //스캐너
        String bankName = sc.next();
        return bankName;
    }

    public static int inputVal(){
        System.out.println("입금할 금액을 입력해주세요.");

        //스캐너
        int inputVal = sc.nextInt();
        return inputVal;
    }


    public static void main(String[] args) {

        // 계좌명 받기
        String bankName;

        // 최초 입금 받기
        int inputVal;

        //계좌 생성을 생생자를 통해서 만든다
        BankAccount ba = new BankAccount();
        SavingAccount sa = new SavingAccount();

        String[] array = {"0. 종료", "1. 잔액 호출", "2. 입금", "3. 출금", "4. 정기 예금 확인", "5. 일반계좌생성", "6. 예금계좌 생성", "7. 예금 계좌 만기 처리 후 금액 조회"};

        boolean isSA = false;
        while (true) {

            // 처음은 뱅킹에서 어떤 기능을 쓸지
            System.out.println("스마트 뱅킹");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

            int num = sc.nextInt();
            System.out.println(array[num] + "을 선택하였습니다.");

            if(num == 0) {
                System.out.println("프로그램을 종료하겠습니다.");
                return;
            }else if(num == 1) {
                if(isSA) System.out.println("현재 계좌 잔액은 " + sa.getBalance() + "입니다.");
                else System.out.println("현재 계좌 잔액은 " + ba.getBalance() + "입니다.");
            }else if(num == 2) {
                System.out.println("입금할 금액을 입력해주세요.");
                if(isSA) {sa.deposit(sc.nextInt()); System.out.println(sa.getBalance());}
                else {ba.deposit(sc.nextInt()); System.out.println(ba.getBalance());}
            }else if(num == 3) {
                System.out.println("출금할 금액을 입력해주세요.");
                if(isSA) {sa.withdraw(sc.nextInt()); System.out.println(sa.getBalance());}
                else {ba.withdraw(sc.nextInt()); System.out.println(ba.getBalance());}
            }else if(num == 5) {
                bankName = inputName();
                inputVal = inputVal();

                // 계좌 생성 문구 넣기
                ba = new BankAccount(inputVal);
                System.out.println("계좌명은 " + bankName + "입니다.");
                System.out.println("현재 계좌 잔액은 " + ba.getBalance() + "입니다.");
                isSA = false;

            }else if(num == 6) {
                bankName = inputName();
                inputVal = inputVal();

                sa = new SavingAccount(inputVal);
                // 계좌 생성 문구 넣기
                System.out.println("정기 예금 계좌명은 " + bankName + "입니다.");
                System.out.println("현재 계좌 잔액은 " + sa.getBalance() + "입니다.");
                isSA = true;
            }else if (num == 7){
                sa.Matured();
            }

        }


    }
}