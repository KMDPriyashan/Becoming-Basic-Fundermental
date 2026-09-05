import java.util.Scanner;
public class sample {
    static int[] arr = new int[10];
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);

        //values ganna eka 
        for (int x=0; x<10; x++){

            System.out.println("enter your "+(x+1)+"values :");
            int value = scan.nextInt();
            if(value > 100 || value < 0){
                System.out.println("Invalid number..!");
                x--;
            }else{
                arr[x] = value;
            }
        }

        highestValue();
        lowestValue();
        everageValue();

    };

    public static void highestValue(){
        int maxvalue = arr[0];
        for(int x=0; x<10; x++){
            if(maxvalue < arr[x]){
                maxvalue = arr[x];
            }
        }
        System.out.println("Max value is :"+maxvalue);
    }

    public static void lowestValue(){
        int minvalue = arr[0];
        for(int x=0; x<10; x++){
            if(minvalue > arr[x]){
                minvalue = arr[x];
            }
        }
        System.out.println("min value is :"+minvalue);
    }

    public static void everageValue(){
        int total = 0;
        for(int x=0; x<10; x++){
            total = total + arr[x];
        }
        double everage = total/arr.length;
        System.out.println("Evarage value is : "+ everage);
    }
}
