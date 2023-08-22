// import java.util.Scanner;
// class pattern {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a numbe to get the same height of pyramid");
//         int num = sc.nextInt();
//         int i = 1;
//         while (num >= i) {
//             int j = 1;
//             while (j <= (num - i)) {
//                 System.out.print(" ");
//                 j++;
//             }
//             int k = 1;
//             while (k <= (2 * i) - 1) {
//                 System.out.print("*");
//                 k++;
//             }
//             System.out.println("");

//             i++;
//         }
//     }
// }

// import java.io.*;
// class pattern{
//     public static void main (String args []) throws IOException{
//         BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//         System.out.println("Enter the height of pattern");
//         int num = Integer.parseInt(br.readLine());
//         for (int i =1; i<=num; i++){
//             for (int j =1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// import java.util.Scanner;
// class pattern{
//     public static void main (String args[]){
//         Scanner sc =new Scanner (System.in);
//         System.out.println("Enter the height for the pattern ");
//         int num = sc.nextInt();
//         for (int i =1; i <= num; i++){
//             for (int j = 1; j <=num; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     } 
// }

// class star2{
//     public void pattern2 (int num){
//         for (int x =1; x <= num; x++){
//             for (int y = 1; y<=num; y++){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//     }
// }

// class pattern {
//     public static void main(String args[]) throws IOException {
//         BufferedReader br =new BufferedReader (new InputStreamReader (System.in));
//         System.out.println("Enter the height for your patterns ");
//         int num = Integer.parseInt(br.readLine());
//         star1 pat1 = new star1();
//         pat1.pattern1(num);
//         System.out.println("");
//         star2 pat2 = new star2();
//         pat2.pattern2(num);
//     }
// }

// import java.util.Scanner;
// class pattern{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the height of the pattern");
//         int num = sc.nextInt();
//         for (int i =1; i<=num; i++){
//             for (int j = 1; j<=num-i+1; j++){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//     }
// }

// import java.io.*;
// class pattern{
//     public static void main (String args[]) throws IOException{
//         BufferedReader br =new BufferedReader (new InputStreamReader (System.in));
//         System.out.println("Enter the height the of pattern");
//         int num = Integer.parseInt(br.readLine());
//         for (int i =1; i<= num; i++){
//             for (int j =1; j <= +i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println("");
//         }
//     }
// }

// import java.util.Scanner;
// class pattern{
//     public static void main (String args[]){
//         Scanner sc =new Scanner (System.in);
//         System.out.println("Enter the height of the pattern");
//         int num = sc.nextInt();
//         for (int i =1; i <= num; i++){
//             for (int j = 1; j<= i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//         for (int k = 1; k<=num-1; k++){
//             for (int l = 1; l<= num-k; l++){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//     }
// }

// import java.io.*;
// class pattern{
//     public static void main (String args[]) throws IOException{
//         BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
//         System.out.println("Enter the height of the pattern ");
//         int num = Integer.parseInt(br.readLine());
//         for (int i =1; i<=2*num-1; i++){
//             int spaces = i>num? 2*num-i:i;
//             for (int j =spaces; j<=num;j++){
//                 System.out.print("  ");
//             } 
//             int stars = i>num? 2*num-i:i;
//             for (int k = stars; k>=1; k--){
//                 System.out.print(k+" ");
//             }
//             for (int l = 2; l<=stars;l++){
//                 System.out.print(l+" ");
//             }
//             System.out.println("");
//         }
//     }
// }

// import java.util.Scanner;
// class pattern{
//     public static void main (String args[]){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the height for the pattern ");
//         int num = sc.nextInt();
//         for (int i=1; i<=2*num-1; i++){
//             int spaces = i>num? i-num: num-i;
//             for(int j=1; j<=spaces; j++){
//                 System.out.print("  ");
//             }
//             int stars = i>num? 2*num-i:i;
//             for(int k = stars; k>=1; k--){
//                 System.out.print(k+ " ");
//             }
//             for(int l=2; l<=stars;l++){
//                 System.out.print(l+" ");
//             }
//             System.out.println("");
//         }
//     }
// }

// import java.io.*;
// class pattern{
//     public static void main (String args[]) throws IOException{
//         BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//         System.out.println("Enter the height for the pattern ");
//         int num = Integer.parseInt(br.readLine());
//         int N= 2*num;
//         int originalN = num;
//         for (int i =0; i<=N; i++){
//             for (int j =0; j<=N; j++){
//                 int min_value = originalN - Math.min(Math.min(i, N-i), Math.min(j, N-j));
//                 System.out.print(min_value+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }