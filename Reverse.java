import java.util.*;

public class Reverse
{
    public static void main(String[] args)
    {
        int[] input = {6,5,4,9,8,7};
        int n = 4;
        int[] result = reverse (input, n);
        
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] reverse (int[] arr, int n) 
    {
        int length = arr.length;
        for (int i = 0; i < length; i += n)
        {
            int start = i;
            int end = Math.min(i + n - 1, length - 1);
            while (start < end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        
        return arr;
    }
}
