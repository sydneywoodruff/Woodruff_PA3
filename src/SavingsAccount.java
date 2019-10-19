
public class SavingsAccount
{
    private static double annualInterestRate = 0.0;

    private double savingsBalance;

    public SavingsAccount(double amt){
        this.savingsBalance = amt;
    }

    public void calculateMonthlyInterest(){
        double interest;
        interest = (this.savingsBalance * (annualInterestRate/100))/12;
        this.savingsBalance += interest;
    }

    public void balance(){
        System.out.printf("| $%.2f", this.savingsBalance);
    }

    public static void modifyInterestRate(double newRate){
        annualInterestRate = newRate;
    }
}




