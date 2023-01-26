import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
                System.out.print("Enter anuual interest rate: ");
                double anuualInterestRate=input.nextDouble();
                double monthlyInterestRate=anuualInterestRate/1200;
                System.out.print("Enter number of year as an integer:");
                int numberOfYears=input.nextInt();
                System.out.print("Enter loan amount: ");
                double loanAmmount=input.nextDouble();
                double monthlyPayment=loanAmmount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
                double totalPayment=monthlyPayment*numberOfYears*12;
                System.out.println("The monthly payment is: " + monthlyPayment);
                System.out.print("The total payment is: " + totalPayment);

    }
}
