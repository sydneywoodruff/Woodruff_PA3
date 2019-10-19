
public class Application {

    public static void main(String[] args){
        int months;

        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);

        SavingsAccount.modifyInterestRate(4.0);

        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("   Month \t   Saver1 \t\t   Saver2   ");
        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for(int i = 1; i < 13; ++ i){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.print(" | \t" + i + "\t\t");

            saver1.balance();

            System.out.print(" | \t ");

            saver2.balance();

            System.out.println(" | ");
        }

        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" \tSetting the Interest Rate to 5.0%   ");
        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        SavingsAccount.modifyInterestRate(5.0);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.print(" | 13\t\t");

        saver1.balance();

        System.out.print(" | \t");

        saver2.balance();

        System.out.println("  | ");

        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

}
