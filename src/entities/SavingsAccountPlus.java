package entities;

public class SavingsAccountPlus extends SavingsAccount {
    private Double bonus;

    public SavingsAccountPlus(Integer id, String holder, Double balance, Double interestRate) {
        super(id, holder, balance, interestRate);
    }

/*
    @Override
    public void withdraw(double mount) {

    }
*/

}
