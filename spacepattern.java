/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*****************************************************************************/
import java.util.*;
public class spacepattern{
    public static void main(String[] args){
        int n=5;
       for(int i=1;i<=n;i++)
       {
           for(int j=n-i;j>=1;j--){
               System.out.print(" ");
           } for(int k=1;k<=i;k++)
           {
               System.out.print("1" );
           }
           System.out.println();
       }
    }
    
}
        