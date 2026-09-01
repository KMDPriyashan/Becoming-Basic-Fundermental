package loops;
public class loopOperation {
    public static void main (String args[]){

        //for loop
        for(int x=0;x<10;x++){
            if(x==5){
                break;
            }
            System.out.println("Value of x: " + x);
        }

        //while loop
        int x=10;
        while(x>0){
            if(x==5){
                break;
            }
            x--;
            System.out.println("value of while loop:"+x);
        }
    }
}