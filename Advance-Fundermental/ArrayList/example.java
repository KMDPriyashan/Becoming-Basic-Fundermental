import java.util.ArrayList;
import java.util.Scanner;
public class example {
    static ArrayList<String> list = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    
    public static void main (String args[]){

        System.out.print("enter Student name : ");
        String name = scan.nextLine();
        list.add(name);

        for(int x=0; x<list.size(); x++){
            System.out.print("enter Student name : ");
            name = scan.nextLine();
            if(name.equals("done")){
                break;
            }else{
                list.add(name);
            }
        }
    }


    

}
