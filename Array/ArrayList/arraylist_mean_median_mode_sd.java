import java.util.*;

class arraylist_mean_median_mode_sd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter the values for mean, median, mode and standard deviation");
        while(true){
            String value = sc.nextLine();
            if (value.isEmpty()){
                break;
            }
            int num = Integer.parseInt(value);
            arr.add(num);
        }
        System.out.println("ArrayList size is "+arr.size());
        double favluu = 0;
        int n =arr.size();
        double mean  = 0;
        double standard_deviation =0;
        int sum = 0;
        for(int i =0;i<arr.size();i++){
            sum += arr.get(i);
            mean  = sum/arr.size();
        }
        for(int i=0;i<arr.size();i++){
            favluu += Math.pow((arr.get(i)-mean),2); 
            standard_deviation = Math.sqrt(favluu/arr.size());
        }
        double median = 0;
        if (n%2!=0){
            median = arr.get(n/2);
        }
        else{
            int nth = arr.get((n/2)-1);
            int nthplus1 = arr.get(n/2);
            median = (nth+nthplus1)/2;
        }
        int count = 0;
        int max_count = 0;
        int mode = 0;
        for(int i =0;i<n;i++){
            count = 0;
            for(int j = i+1;j<n;j++){
                if(arr.get(i)==arr.get(j)){
                    count = count+1;
                    
                }
                if(count>max_count){
                    max_count = count;
                    mode = arr.get(i);
                }
            }
        }
        System.out.println("Mean is: "+mean);
        System.out.println("Median is: "+median);
        System.out.println("Mode is: "+mode);
        System.out.println("Standard Deviation is: "+standard_deviation);

    }
}