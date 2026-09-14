import java.util.Scanner;

public class LankaTrustBank {
    static double loanAmount, interestRate, loanPeriod;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        

        System.out.println("enter the Loan Amount : ");
        loanAmount = scan.nextDouble();

        System.out.println("enter the anuual interest rate (%) : ");
        interestRate = scan.nextDouble();

        System.out.println("enter the loan tenure : ");
        loanPeriod = scan.nextDouble();

        EMIreport();

        



    }

    public static void EMIreport(){
        double monthlyInterestrate = interestRate/12.0;
        int months = (int)loanPeriod*12;
        double monthlyEMI = loanAmount*monthlyInterestrate*(Math.pow((1+monthlyInterestrate),months)/(Math.pow((1+monthlyInterestrate),months)-1));
        double totalPayment = monthlyEMI*months;
        double totalInterest = totalPayment-loanAmount;

        System.out.println("Monthly Interest Rate : "+monthlyInterestrate);
        System.out.println("Number of months : "+months);
        System.out.println("Monthlu EMI Value : "+monthlyEMI);
        System.out.println("Total Payement : "+totalPayment);
        System.out.println("Total Interest : "+totalInterest);
        
        System.out.println("/n");

        System.out.println("rounded-up EMI : "+Math.ceil(monthlyEMI));
        System.out.println("rounded-up EMI : "+Math.floor(monthlyEMI));
        System.out.println("rounded-up EMI : "+(int)Math.round(monthlyEMI));

        System.out.println("/n");

        System.out.println("Maximum (EMI,Interest) : "+Math.max(totalInterest, monthlyEMI));
        System.out.println("Maximum (EMI,Interest) : "+Math.min(totalInterest, monthlyEMI));
        System.out.println("Maximum (EMI,Interest) : "+Math.abs(totalPayment));


        System.out.println("enter the expected annual return rate (%) : ");
        int returnRate = scan.nextInt();

        double doubleInvesment = 72/returnRate;
        System.out.println("Years to Double Investment: "+Math.ceil(doubleInvesment));

        double futureValue = loanAmount*Math.pow((1+monthlyInterestrate),months);
        System.out.println("Future Value : "+futureValue);

    }

    
}
