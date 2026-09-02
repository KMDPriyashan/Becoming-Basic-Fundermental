
import java.util.Scanner;

public class example {
    static Scanner inputs = new Scanner(System.in);
    static double totalOrderAmount = 0;
    static Double Useramount1, Useramount2, Useramount3, Useramount4;
    static String name1, name2, name3, name4;
    static double user1presentage, user2presentage, user3presentage, user4presentage;
    static int serviseCharege;

    public static void main(String args[]) {

        System.out.print("Enter Your name: ");
        name1 = inputs.nextLine();
        System.out.print(name1 + " enter Your order amount : ");
        Useramount1 = inputs.nextDouble();

        inputs.nextLine(); // Consume the newline character left by nextDouble()

        System.out.print("Enter Your name: ");
        name2 = inputs.nextLine();
        System.out.print(name2 + " enter Your order amount : ");
        Useramount2 = inputs.nextDouble();

        inputs.nextLine(); // Consume the newline character left by nextDouble()

        System.out.print("Enter Your name: ");
        name3 = inputs.nextLine();
        System.out.print(name3 + " enter Your order amount : ");
        Useramount3 = inputs.nextDouble();

        inputs.nextLine(); // Consume the newline character left by nextDouble()

        System.out.print("Enter Your name: ");
        name4 = inputs.nextLine();
        System.out.print(name4 + " enter Your order amount : ");
        Useramount4 = inputs.nextDouble();

        inputs.nextLine(); // Consume the newline character left by nextDouble()

        System.out.print("Enter Services charge (%): ");
        serviseCharege = inputs.nextInt();

        userOrderAmount(Useramount1, Useramount2, Useramount3, Useramount4);
        amountPresentage(serviseCharege);
        totalAmount();
    }

    public static void userOrderAmount(Double Useramount1, Double Useramount2, Double Useramount3, Double Useramount4) {

        totalOrderAmount = Useramount1 + Useramount2 + Useramount3 + Useramount4;
        System.out.println("Total Order Amount is : " + totalOrderAmount);
    }

    public static void amountPresentage(int servicesCharge) {
        user1presentage = (Useramount1 / totalOrderAmount) * 100;
        user2presentage = (Useramount2 / totalOrderAmount) * 100;
        user3presentage = (Useramount3 / totalOrderAmount) * 100;
        user4presentage = (Useramount4 / totalOrderAmount) * 100;

        System.out.println("Percentage of " + name1 + " is : " + user1presentage);
        System.out.println("Percentage of " + name2 + " is : " + user2presentage);
        System.out.println("Percentage of " + name3 + " is : " + user3presentage);
        System.out.println("Percentage of " + name4 + " is : " + user4presentage);
    }
     
    public static void totalAmount(){

        double totalAmount = totalOrderAmount + (totalOrderAmount * serviseCharege / 100);
        System.out.println("Total Amount (including service charge) is : " + totalAmount);
    }
}
