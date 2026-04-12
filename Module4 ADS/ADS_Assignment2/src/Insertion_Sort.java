import java.util.Arrays;

public class Insertion_Sort
{
	static int[] insert(int arr[], int position)
    {
        int n = arr.length;
        int newArr[] = new int[n + 1];
        int i = n - 1;

        while(i>=0 && arr[i]>position) {
            newArr[i+1] = arr[i];
            i--;
        }
        newArr[i+1] = position;

        while(i>=0) {
            newArr[i] = arr[i];
            i--;
        }
        return newArr;
    }
    public static void main(String args[])
    {
        int arr[] = {1, 3, 5, 7};
        int ins = 4;
        
        int result[] = insert(arr, ins);
        System.out.println("Sorted  Array: " +Arrays.toString(result));
    }
}
