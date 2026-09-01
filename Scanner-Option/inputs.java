import java.util.Scanner;
public class inputs {
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Your name :");
        String name = scan.nextLine();

        System.out.println("Your name : "+name);
        scan.close();
    }
    
};