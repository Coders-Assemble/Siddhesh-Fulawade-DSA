import java.util.ArrayList;
import java.util.Scanner;
class primefactorization{
    public ArrayList<Integer> primefactor (int num){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i =2;i<=num;i++){
            while(num%i==0){
                numbers.add(i);
                int num1= i * i;
                if(num%num1==0){
                    numbers.add(i);
                    num /=num1;
                }else{
                    num /= i;
                }
            }
        }
        return numbers;
    }
}
class arraylist{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num value");
        int num = sc.nextInt();
        primefactorization prfactor = new primefactorization();
        ArrayList<Integer> answer= prfactor.primefactor(num);
        System.out.println("The prime factors are"+ answer);
    }
}