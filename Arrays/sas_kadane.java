import java.util.*;

public class sas_kadane{
    public static void main(String args[]){
        int bdays[] = {- 23,17,-18,9,-4,26,-15};
        int sum=0;
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<bdays.length;i++){
            sum+=bdays[i];
            if(sum<0){
                sum = 0;
            }
            largest = Math.max(sum,largest);
        }
        System.out.print("The largest sum of subarray is: "+largest);
    }
}