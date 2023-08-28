import java.util.Scanner;
import java.util.Arrays;

class left_rotatebyd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting is ");
        for(int array : arr){
            System.out.print(array+" ");
        }
        Arrays.sort(arr);
        System.out.println("\nArray after sorting is ");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println("\nEnter the number of shifts to left");
        int shift = sc.nextInt();
        int [] temp = new int [shift];
        for (int i = 0; i<shift%arr.length;i++){
            temp [i] = arr[i];
        }
        for (int i = shift%arr.length; i<arr.length;i++){
            arr[i-shift%arr.length] = arr[i];
        }
        for (int i = arr.length-shift%arr.length;i<arr.length; i++){
            arr [i] = temp[shift%arr.length-(arr.length-i)];
        }
        System.out.println("Array after shifting is ");
        for(int values : arr){
            System.out.print(values+" ");
        }
    }
}
