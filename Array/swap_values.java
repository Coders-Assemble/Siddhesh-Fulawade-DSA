import java.io.*;
import java.util.Arrays;

class Swapper{
    public void swap(int []arr, int index1, int index2){
        int temp = arr [index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
class swap_values{
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter values for array");
        int [] arr= new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Before: ");
        System.out.println(Arrays.toString(arr));
        Swapper sw =new Swapper();
        sw.swap(arr, 1,3);
        System.out.println("After: ");
        System.out.println(Arrays.toString(arr));
    }
}