import java.util.Scanner;
public class Authentication {
    static int count1 =0;
    static int count2 =0;
    static int count3 =0;
    static int count4 =0;


    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("enter Your username :");
        String username = scan.nextLine();

        System.out.print("enter your password : ");
        String password = scan.nextLine();

        usernamecheck(username);
        passwordcheck(password);

        scan.close();
    }

    public static void usernamecheck(String username){
        char firstletter = username.charAt(0);
        if(username.length() <= 15 || username.length() >= 5){
            if(username.contains(" ") || username.contains("@") || username.contains("$") || username.contains("#") || username.contains("&") || username.contains("%") || username.contains("!")){
                System.out.println("username is invalid.. ! (can't include the space or symbles)");
            }else if(!Character.isLetter(firstletter)){
                System.out.println("username is invalid.. ! (can start with the digits or symbles)");
            }else{
                System.out.println("Congratulation..! username is valid.. ! Welcome to becomming..... ");
            }
        }else{
            System.out.println("please enter the between 5-15 charcture.. !");
        }
    }

    public static void passwordcheck(String password){
        if(password.length() >= 8){
            for(int x=0; x<password.length(); x++){
                char letter = password.charAt(x);
                if(Character.isUpperCase(letter)){
                    count1++;
                }else if(Character.isLowerCase(letter)){
                    count2++;
                }else if(Character.isDigit(letter)){
                    count3++;
                }else{
                    count4++;
                }
            }

            if(count1 >= 1 && count2 >= 1 && count3 >= 1 && count4 >= 1){
                System.out.println("Congratulations..! Password is correct.. Authentication passed.....");
            }else{
                System.out.println("Password is incorrect..! (must contain at least one uppercase, lowercase, digit, and special character)");
            }
        }else{
            System.out.println("Password is incorrect..! (must be at least 8 characters long)");
        }
    }
}
