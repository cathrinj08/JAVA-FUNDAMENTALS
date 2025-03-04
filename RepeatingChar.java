public class RepeatingChar {
    public static void main(String[] args) {
        String input = "bc2aa2jc6";  
        String result = expandString(input);  
        System.out.println(result);  
        
    }

    public static String expandString(String input) {
        String output = "";  
        int length = input.length(); 
        
        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);  
            if (Character.isDigit(currentChar)) {
                int repeatCount = Character.getNumericValue(currentChar); 
                char previousChar = input.charAt(i - 1);

                for (int j = 0; j < repeatCount - 1; j++) {
                    output += previousChar;  
                }
            } else {
                output += currentChar; 
                }
        }
        
        return output;  
    }
}
