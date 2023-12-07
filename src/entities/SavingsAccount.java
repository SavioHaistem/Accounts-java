package entities;

public class SavingsAccount extends Account {
    private Double interestRate;

    public void SavingsAccount() {

    }

    public SavingsAccount(Integer id, String holder, Double balance, Double interestRate) {
        super(id, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        this.balance -= 5;
    }

    @Override
    public void withdraw(double amount) {
        //this.balance -= amount;
        super.withdraw(amount);
        this.balance += 5;
    }
}
