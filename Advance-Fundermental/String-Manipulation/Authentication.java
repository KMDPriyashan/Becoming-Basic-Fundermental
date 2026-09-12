import java.util.Scanner;
public class Authentication {
    
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("enter Your username :");
        String username = scan.nextLine();

        System.out.println("enter your password : ");
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
                System.out.println("username is invalid.. !");
            }else{
                System.out.println("username is valid.. !");
            }
        }else{
            System.out.println("please enter the between 5-15 charcture.. !");
        }
    }

    public static void passwordcheck(String password){

    }
}
