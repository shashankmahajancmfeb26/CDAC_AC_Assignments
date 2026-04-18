public class ArrayOfStringSort {

    public static void sort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void display(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] arr1 = {"apple", "banana", "cherry", "date"};
        
        System.out.print("Before Sorting: ");
        display(arr1);
        sort(arr1);
        System.out.print("After Sorting: ");
        display(arr1);
        
        String[] arr2 = {"dog", "cat", "elephant", "bee"};
        System.out.print("Before Sorting: ");
        display(arr2);
        System.out.print("After Sorting: ");
        
        sort(arr2);
        display(arr2);
    }
}
