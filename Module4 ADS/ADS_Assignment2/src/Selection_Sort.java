import java.util.Arrays;

public class Selection_Sort
{
	static void selectionSort(int[] arr)
	{
        int n = arr.length;

        for(int i = 0; i < n - 1; i++)
        {
           int max = i;
            
           for(int j = i + 1; j < n; j++)
           {
               if(arr[j] > arr[max])
               {
            	   max = j;
               }
           }

           int temp = arr[max];
           arr[max] = arr[i];
           arr[i] = temp;
        }
    }
    public static void main(String args[])
    {
        int arr[] = {3, 5, 1, 2};
        selectionSort(arr);
        System.out.println("Sorted  Array: " +Arrays.toString(arr));
    }

    
}
