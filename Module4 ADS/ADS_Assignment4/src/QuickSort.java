public class QuickSort 
{	
	public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = quick(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private static int quick(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
	
	public static void display(int[] arr) {
		for (int num : arr) {
        	System.out.print(num +" ");
		}
		System.out.println();
	}
    public static void main(String[] args) {
        
    	int[] arr1 = {10,7,8,9,1,5};
    	int[] arr2 = {1,1,1,1};
    	
        System.out.print("Before Sorting : ");
       	display(arr1);
      	System.out.print("After Sorting : ");
      	quickSort(arr1,0,arr1.length-1);
       	display(arr1);
       	
       	System.out.print("Before Sorting : ");
       	display(arr2);
      	System.out.print("After Sorting : ");
      	quickSort(arr2,0,arr2.length-1);
       	display(arr2);
       	
       	
            
    }
}
