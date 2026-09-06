//me arraylist valata api samanya array ekak denava vage [5] kiyala vage denna avashya na eya eka ajest karagannva. apita kamathi velavaka kamathi values add karagnna puluvan. 
//meke lakshana thama apita akamathi velavaka values add karaganna puluvan
//null value, duplicate values, vage thiyaganna puluvan
//api add karana piulivelatamai store venne, saha index eken access karanna puluvan. 

// add(value)	අලුත් අගයක් එකතු කරනවා
// get(index)	දෙන ලද ඉන්ඩෙක්ස් එකේ තියෙන අගය ගන්නවා
// remove(index)	දෙන ලද ඉන්ඩෙක්ස් එකේ තියෙන අගය මකනවා
// size()	ArrayList එකේ තියෙන ගාණු ගණන දෙනවා
// contains(value)	දෙන ලද අගය තියෙනවද කියලා බලනවා
// clear()	හැම අගයක්ම මකනවා
// isEmpty()	හිස්ද කියලා බලනවා


import java.util.ArrayList;

public class Test {
    public static void main (String atgs[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(110);//mehema thama value add karanne 
        list.add(30);
        list.add(20);
        list.add(60);
        list.add(40);
        list.add(10);
        list.add(340);
        list.add(660);

        list.remove(3); //mehema thama value remove karanne
        list.remove(2);

        list.get(2);//meke thama e index ekata adala value eka print karanne. 

        list.size();//meke thama arraylist eke size eka print karanne.

        System.out.println("Contains 2 : "+list.contains(2)); //meke thama arraylist eke 20 value eka thiyenava kiyala print karanne.

       
        System.out.println("ArrayList : "+list); //mehema thama arralist eka print laranne ekaparatama " [10, 30, 20, 60] "
        System.out.println("Size of ArrayList : "+list.size()); //Arraylist eke size eka print karanne mehema thama "4" kiyala
        System.out.println("Index of 2 : "+list.indexOf(2)); //Arraylist eke index eka print karanne mehema thama "2" kiyala
        System.out.println("Is ArrayList empty : "+list.isEmpty()); //Arraylist eka empty kiyala

         list.clear();//meke thama arraylist eke thiyena values hama ekama mkanne.


    }
}
