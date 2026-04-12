import java.util.Arrays;

public class Optimized_BubbleSort
{
	public static void optimized(int[] arr)
	{
       int n = arr.length;
       boolean swapped;

        for(int i = 0; i < n - 1; i++)
        {
           swapped = false;

            for(int j = 0; j < n - i - 1; j++)
            {
               if(arr[j] > arr[j + 1]) 
                {
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
                    
                   swapped = true;
                }
            }
            if (!swapped)
            {
               break;
            }
        }
    }
	
    public static void main(String[] args)
    {
       int[] arr = {1, 3, 2, 5, 4};
       optimized(arr);
       System.out.println("Sorted  Array: " + Arrays.toString(arr));
    }

    
}
