public class InsertionSort 
{	
	public static void insertionSort(int[] arr) 
	{
        int n = arr.length;
        
        for (int i = 1; i < n; ++i) 
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
	}
	public static void display(int[] arr) {
		for (int num : arr) {
        	System.out.print(num +" ");
		}
		System.out.println();
	}
    public static void main(String[] args) {
        
    	int[] arr1 = {12,11,13,5,6};
    	int[] arr2 = {4,3,2,10,12};
    	
        System.out.print("Before Sorting : ");
       	display(arr1);
      	System.out.print("After Sorting : ");
       	insertionSort(arr1);
       	display(arr1);
       	
       	System.out.print("Before Sorting : ");
       	display(arr2);
      	System.out.print("After Sorting : ");
       	insertionSort(arr2);
       	display(arr2);
       	
       	
            
    }
}
