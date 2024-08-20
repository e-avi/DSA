import java.util.*;

public class subarraysum{

    public static void main(String[] args){
        int bdays[]={23,-17,18,9,4,-26,15};
        int sum = 0;
        int largest = Integer.MIN_VALUE;

        // for(int i=0;i<bdays.length;i++){
        //     for(int j=i+1;j<bdays.length;j++){
        //         sum = 0;
        //         for(int k=i;k<=j;k++){
        //             sum += bdays[k];

        //             if(sum>largest){
        //                 largest = sum;
        //             }
        //         }
        //     }
        // }
        // System.out.print("The largest subarray sum is: "+largest); 

        for(int i=0;i<bdays.length;i++){
            for(int j=i;j<bdays.length;j++){
                if(j==i){
                    sum = bdays[i];
                }
                else{
                    sum=sum+bdays[j];
                }
                if(sum>largest){
                    largest=sum;
                }
            }
            sum=0;
        }
        System.out.print("The largest subarray sum is: "+largest); 

    }
}