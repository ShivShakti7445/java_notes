// ADDITION OF TWO  matrix printing in 2D

import java.util.Scanner;
class A{
    public static void main( String [] args){
        int 
        i,j;
        int a[][]=new int[2][2];
        //int b[][]=new int[2][2];
        //int c[][]=new int[2][2];
        System.out.print(" enter the element of matrix: a ");
        Scanner sc=new Scanner(System.in);
      
    for(  i=0;i<=1;i++){
       
        for(  j=0;j<=1;j++){
            a[i][j]=sc.nextInt();

        }
        
      
    }
    System.out.print("  element of matrix: a");
    //Scanner sc=new Scanner(System.in);
  
for(  i=0;i<=1;i++){
   
    for(  j=0;j<=1;j++){
     System.out.print(   a[i][j]);

    }
    System.out.print("  \n");
  
}
System.out.print("  transpose of  matrix a is \n");
   
   for(  i=0;i<=1;i++){
   
    for(  j=0;j<=1;j++){
        
        System.out.print(a[j][i]);

    }
    System.out.print("  \n");
  
}

}}