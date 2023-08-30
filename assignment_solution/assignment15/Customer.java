package assignment15;

import assignment16.Account;

class Customer extends Account {
    private String Account, CustomerName;

    public void deposit(int depo) {
        setBalance(depo);
    }

    public void withdraw(int with) {
        getWithdraw(with);
    }

    public int checkBalance() {
        return getBalance();
    }

    public static void main(String[] args) {
        Customer foo = new Customer();
        foo.deposit(500);
        foo.withdraw(200);
        System.out.println("balance :" + foo.checkBalance());
    }

}