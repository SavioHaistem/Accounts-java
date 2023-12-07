package entities;

public final class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount() {

    }

    public BusinessAccount(Integer id, String holder, Double balance, Double loanLimit) {
        super(id, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        this.balance += amount;
    }
}
