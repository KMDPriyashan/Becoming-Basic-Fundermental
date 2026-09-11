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

        displayList();
        searchStudent();
        removeStudent();
        displayList();
    }

    public static void displayList(){
        for(String name : list){
            System.out.println("Student name : "+name);
        }
        System.out.println("Total Student count :"+list.size());
    }

    public static void searchStudent(){
        System.out.println("Enter the user search name : ");
        String name = scan.nextLine();
        for(int x=0; x<list.size(); x++){
            if(name.equals(list.get(x))){
                System.out.println(name+" are present..!");
            }
        }
    }

    public static void removeStudent(){
        System.out.println("enter the user remove name : ");
        String name = scan.nextLine();
        for(int x=0; x<list.size(); x++){
            if(name.equals(list.get(x))){
                list.remove(x);
                System.out.println(name+" are removed..!");
            }
        }
        System.out.println(name+" are not present..!");

    }


    

}
