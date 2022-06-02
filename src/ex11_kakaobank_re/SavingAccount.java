package ex11_kakaobank_re;

//정기 예금 계좌 클래스
//일반계좌 클래스를 부모클래스로 둔다. (상속)
public class SavingAccount extends BankAccount{
    int balance = 0;
    boolean maturity = false;
    public SavingAccount(){

    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    public SavingAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(int amount) {
        if(!maturity) System.out.println("만기후에 입금 가능합니다.");
        else balance += amount;
    }

    @Override
    //출금기능의 메서드
    public void withdraw(int amount) {
        if(maturity) System.out.println("만기 후에 출금 가능합니다");
        else balance -= amount;
    }

    public int Matured(){
        maturity = true;
        double res =balance * ( 1 + 0.02);
        return (int) res;
    }

}