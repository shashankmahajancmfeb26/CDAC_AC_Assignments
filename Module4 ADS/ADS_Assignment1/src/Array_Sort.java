public class Array_Sort
{
	static boolean isSorted(int[] arr, int index)
    {
       if (arr == null || index >= arr.length - 1)
       {
           return true;           
       }
       if (arr[index] > arr[index + 1])
       {
           return false;
       }
       return isSorted(arr, index + 1);
    }
	
    public static void main(String args[])
    {
        int[] arr1 = {2, 4, 6, 8};
        int[] arr2 = {3, 5, 2, 9};

        System.out.println("Array 1: " + isSorted(arr1, 0));
        System.out.println("Array 2: " + isSorted(arr2, 0));
    }

    
}
