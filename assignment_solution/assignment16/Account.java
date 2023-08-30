package assignment16;

public class Account {
    private int accountBalance, AccountNumber;

    protected void setBalance(int add) {
        this.accountBalance += add;
    }

    protected void getWithdraw(int with) {
        this.accountBalance -= with;
    }

    protected int getBalance() {
        return this.accountBalance;
    }
}
