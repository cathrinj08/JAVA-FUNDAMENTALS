public class WordReversewithSpace {
    public static void main(String[] args) {
        String input = "    I love   Java";
        
        String result = "";
        String word = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            
            if (ch != ' ') {
                word = ch + word;

            }
            else if (word.length() > 0) {
                result = result + word + " ";
                word = "";
                
                
                
                
                
            }
        }
        
        if (word.length() > 0) {
            result = result + word;
        }
        
        System.out.println(result);
    }
}
