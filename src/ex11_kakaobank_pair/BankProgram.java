package ex11_kakaobank_pair;

import java.util.HashMap;
import java.util.Scanner;

public class BankProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, BankAccount> hashMap = new HashMap<>(); //키: 계좌명, 값: 객체 자체

        while (true){
            System.out.println("계좌 명을 입력해주세요. ");
            String name = scanner.nextLine();

            System.out.println("계좌 최초 입금 금액을 입력해주세요.");
            int amount = scanner.nextInt();

            System.out.println("계좌 유형을 입력해주세요. 1: 일반, 2:정기예금");
            int type = scanner.nextInt();
            scanner.nextLine();

            // 객체 생성해서 해시에 넣어줌
            hashMap.put(name, new BankAccount(name, amount, type));

            if(type == 0) break;

        }
        for(String s : hashMap.keySet()) {
            System.out.println(hashMap.get(s).getBalance());
            System.out.println(hashMap.get(s).getName());
        }

    }
}
