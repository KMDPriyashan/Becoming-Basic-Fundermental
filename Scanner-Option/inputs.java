import java.util.Scanner;
public class inputs {
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter Your name :");
        String name = scan.nextLine();

        System.out.print("Enter Your Salary :");
        double salary = scan.nextDouble();

        System.out.print("Enter Your Marrid or Unmarrid? :");
        boolean marrid = scan.nextBoolean();

        System.out.print("Enter Your started letter :");
        char nameA = scan.next().charAt(0);

        System.out.println("Your name : "+name);
        System.out.println("Your salary : "+salary);
        System.out.println("Your marrid : "+marrid);
        System.out.println("Your stated letter : "+nameA);
        scan.close();
    }
    
};