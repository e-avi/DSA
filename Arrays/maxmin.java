import java.util.*;

public class maxmin{
    public static void main(String[] args){
        int bdays[] = {23,17,18,9,4,15,26};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<bdays.length;i++){
            if(bdays[i]>max){
                max=bdays[i];
            }
            if(bdays[i]<min){
                min=bdays[i];
            }
        }
        System.out.println("Smallest: "+min+" Largest: "+max);
    }
}