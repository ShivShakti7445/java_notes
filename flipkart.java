
import java.util.*;
import java.lang.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)// throws java.lang.Exception
	{
             Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            //int l,d;
         
    
          while(t-->0)  {
             int l=0,d=0;
                int n = sc.nextInt();
                for(int i=1;i<=n;i++){
                    String s= sc.nextLine();
                    if(s.equals("START38")){
                        d++ ;
                    }
                
                else{
                    l++ ;
                }
             
            }
	    System.out.print(d+" "+l);
	}
     
	    System.out.print(" end");
}

}
