import java.util.Scanner;
class Palindrome{
    public static void main (String[] args) {
        
        String str = new String();
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        str = in.nextLine();
        StringBuilder strb = new StringBuilder(str);
        StringBuilder rev = strb.reverse();
        if(str.equals(rev.toString()))
        {
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not a Pallindrome");
        }
        
        
        
        
    }
}