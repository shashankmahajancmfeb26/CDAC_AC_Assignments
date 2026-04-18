public class MergeSort 
{	
	public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);      
            mergeSort(arr, mid + 1, right);  
            merge(arr, left, mid, right);    
        }
	}
	
	static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;      
        int j = mid + 1;   
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) { 
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }
	
	public static void display(int[] arr) {
		for (int num : arr) {
        	System.out.print(num +" ");
		}
		System.out.println();
	}
    public static void main(String[] args) {
        
    	int[] arr1 = {38,27,43,3,9,82,10};
    	int[] arr2 = {5,4,3,2,1};
    	
        System.out.print("Before Sorting : ");
       	display(arr1);
      	System.out.print("After Sorting : ");
      	mergeSort(arr1,0,6);
       	display(arr1);
       	
       	System.out.print("Before Sorting : ");
       	display(arr2);
      	System.out.print("After Sorting : ");
      	mergeSort(arr2,0,4);
       	display(arr2);
       	
       	
            
    }
}
