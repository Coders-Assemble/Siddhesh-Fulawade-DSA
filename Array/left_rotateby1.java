import java.io.*;
class left_rotateby1{
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int [] arr = new int[num];
        for (int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int temp =  arr[0];
        for (int i =1; i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = temp;
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}