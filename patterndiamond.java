import java.util.*;
public class patterndiamond{
    public static void main(String[] args){
        int n=5;
       for(int i=1;i<=n;i++)
       {
           for(int j=n-i;j>=1;j--){
               System.out.print(" ");
           } for(int k=1;k<=i;k++)
           {
               System.out.print("1 " );
           }
           System.out.println();
       }
       
        for(int i=n-1;i>=1;i--)
       {
           for(int j=n-i;j>=1;j--){
               System.out.print(" ");
           } for(int k=1;k<=i;k++)
           {
               System.out.print("1 " );
           }
           System.out.println();
       }
    }
    
}

    