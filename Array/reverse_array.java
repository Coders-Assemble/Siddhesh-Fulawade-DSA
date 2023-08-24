import java.io.*;

class Swapper {
    public void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

class reverse_array {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the values for array");
        int arr[] = new int[5];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int start = 0;
        int end = arr.length - 1;
        Swapper sw = new Swapper(); 
        
        while (start < end) {
            sw.swap(arr, start, end);
            start++;
            end--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
