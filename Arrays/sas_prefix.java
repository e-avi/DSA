import java.util.*;

public class sas_prefix{
    public static void main(String[] args){
        int bdays[]={23,-17,18,-9,4,-26,15};
        int temp=0, sum=0;
        int largest = Integer.MIN_VALUE;
        int prefix[] = new int[bdays.length];

        for(int i=0;i<bdays.length;i++){
            temp += bdays[i];
            prefix[i] = temp;
        }

        for(int j=0;j<prefix.length;j++){
            System.out.print(prefix[j]+" ");
        }
        System.out.println();

        for(int k=0;k<prefix.length;k++){
            for(int l=k;l<prefix.length;l++){
                sum = k==0 ? prefix[l] : prefix[l]-prefix[k-1];

                if(sum>largest){
                    largest = sum;
                }
            }
        }
        System.out.println("The largest subarray sum is: "+largest);
    }
}