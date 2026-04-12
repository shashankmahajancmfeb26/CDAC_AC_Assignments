import java.util.Arrays;

public class Bubble_Sort
{
    public static void main(String[] args)
    {
        int[] arr = {4, 3, 2};
        bubbleSort(arr, arr.length, 1);
    }
    static void bubbleSort(int[] arr, int n, int pass)
    {
        if(n<=1)
        {
            return;
        }

        performPass(arr, 0, n);

        System.out.println("Pass " + pass + ": " + Arrays.toString(arr));

        bubbleSort(arr, n - 1, pass + 1);
    }
    static void performPass(int[] arr, int i, int n)
    {
        if (i >= n - 1)
        {
            return;
        }
        if (arr[i] > arr[i + 1])
        {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        performPass(arr, i + 1, n);
    }
}
