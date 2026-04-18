public class BubbleSort 
{	
	public static void bubbleSort(int[] arr) 
	{
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) 
        {
           for (int j = 0; j < n - i - 1; j++)
           {
                if (arr[j] > arr[j + 1]) 
                {
                	int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
	}
	public static void display(int[] arr) {
		for (int num : arr) {
        	System.out.print(num +" ");
		}
		System.out.println();
	}
    public static void main(String[] args) {
        
    	int[] arr1 = {5, 2, 9, 1, 5, 6};
    	int[] arr2 = {3,2,1};
    	int[] arr3 = {1,2,3};
    	
        System.out.print("Before Sorting : ");
       	display(arr1);
      	System.out.print("After Sorting : ");
       	bubbleSort(arr1);
       	display(arr1);
       	
       	System.out.print("Before Sorting : ");
       	display(arr2);
      	System.out.print("After Sorting : ");
       	bubbleSort(arr2);
       	display(arr2);
       	
       	System.out.print("Before Sorting : ");
       	display(arr3);
      	System.out.print("After Sorting : ");
       	bubbleSort(arr3);
       	display(arr3);
            
    }
}
