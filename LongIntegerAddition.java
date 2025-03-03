public class LongIntegerAddition {

    public static void main(String[] args) {
        String num1 = "123456789016789";  
        String num2 = "987654";

        String result = addLargeNumbers(num1, num2);
        System.out.println("Sum: " + result);
    }

    public static String addLargeNumbers(String num1, String num2) {
        StringBuilder sum = new StringBuilder();
        
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;  
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0; 

            int sumDigits = digit1 + digit2 + carry;  
            carry = sumDigits / 10;  
            sum.append(sumDigits % 10);  

            i--;  
            j--;  
        }

        return sum.reverse().toString();
    }
}
