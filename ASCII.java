//to find the digit of a given no. is
import java.util.Scanner;
class ASCII{//class name kuchh bhi le sakte hai
   public static  void main(String[] args){
     int a,digit,count=0;
     
      System.out.print("  enter any no.   : ");
      Scanner sc=new  Scanner (System.in);
    
      a=sc.nextInt();
      
      while(a>0){
        a=a/10;// {234/23/10 =23,,,,23/10 =2,,,,2/10= 0}
        count++;
      }
      System.out.print("  digit of given no. is  : "+count
      );

    }
   }            









    
    


   


 



    



 



    



