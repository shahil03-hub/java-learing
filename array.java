import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Array elements using for loop : ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("\n"); 
        System.out.println("array elements using indexed access : ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println("\n");

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println(Arrays.binarySearch(arr, 3));  
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,2,4,8);
        System.out.println(Arrays.toString(arr));   
        int arr2[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr2));
        arr2[2] = 10;
        System.out.println(arr2[2]);
      }

}