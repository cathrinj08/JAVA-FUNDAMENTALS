import java.util.*;
 class duplicate{
     public static void main(String args[])
     {
         String numStr="87772441228781125484411548124871";
         StringBuilder result = new StringBuilder();
         boolean[] seen = new boolean[10];
         
         for(char digit: numStr.toCharArray() ){
             if(!seen[digit-'0'])
             {
                 seen[digit-'0'] =true;
                 result.append(digit);
                 
             }
         }
         System.out.println(result);
     }
 }