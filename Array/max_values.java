import java.util.Scanner;
class max_values{
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enther the values for array");
        int [] arr = new int[5];
        int max_arrvalue = arr[0];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter value " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            if(max_arrvalue<arr[i]){
                max_arrvalue = arr [i];
            }
        }
        System.out.println("The max array value is "+max_arrvalue);
    }
}
