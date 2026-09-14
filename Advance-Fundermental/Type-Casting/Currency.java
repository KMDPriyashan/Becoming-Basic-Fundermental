import java.util.Scanner;

public class Currency {
    static double LKRamount;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the USD Amount : ");
        double usdmount = scan.nextDouble();

        System.out.println("enter the exchange rate : ");
        double exchangeRate = scan.nextDouble();

        LKRamount = usdmount*exchangeRate;
        System.out.println("Your Exchange LKR Amount : "+LKRamount);

        int lkrInt = (int)LKRamount;
        System.out.println("Integer lkr Amount : "+lkrInt);

        long lkrlong = (long)LKRamount;
        System.out.println("long lkr Amount : "+lkrlong);

        float lkrFloat = (float)LKRamount;
        System.out.println("Float lkr Amount : "+lkrFloat);

        short lkrshort = (short)LKRamount;
        System.out.println("Short LKR amount : "+lkrshort);

        scan.close();
    }
}
