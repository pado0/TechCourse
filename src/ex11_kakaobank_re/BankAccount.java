package ex11_kakaobank_re;

//일반 계좌 클래스
public class BankAccount {
    //처음 잔액은 0
    int balance = 0;

    // 생성자
    public BankAccount(){
    }
    public BankAccount(int balance) {
        this.balance = balance;
    }

    //입금기능의 메서드
    public void deposit(int amount) {
        balance += amount;
    }

    //출금기능의 메서드
    public void withdraw(int amount) {
        balance -= amount;
    }

    //계좌 확인 기능의 메서드
    public int getBalance() {
        return balance;
    }
}