package entities;

public class Account {
    protected Integer id;
    protected String holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer id, String holder, Double balance) {
        this.id = id;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5;
    }
}
