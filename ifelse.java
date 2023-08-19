//cake ki price agar 500 ke under hogi to le lenge.

import java.util.*;

class ifelse{
    public static void main(String[] args){
         
         Scanner sc= new Scanner(System.in);
         System.out.println("kitne kilo ka cake chahiye");
         float cake =sc.nextFloat();//in kgs
         if(cake < 1){
            System.out.println("300 ka hai ");
         }else{
            System.out.println("500 ka hai");
         }


         
    }
}