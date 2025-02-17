/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Max
{
    public static void main (String args[])
    {
        int arr[]={1,2,3,4,5};
        int max=arr[0];
        int secmax= Integer.MIN_VALUE;
        int thirdmax= Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
            
        }System.out.println(max);
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>secmax && arr[i]<max)
            secmax=arr[i];
            
        }System.out.println(secmax);
        
         for(int i=2;i<arr.length;i++)
        {
            if(secmax >thirdmax && arr[i]<secmax)
            thirdmax=arr[i];
            
        }System.out.println(thirdmax);
    }
}