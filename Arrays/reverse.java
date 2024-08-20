import java.util.*;

public class reverse{
    public static int reversing(int bdays[]){
        int first=0;
        int last=bdays.length-1;
        int temp=0;

        while(first<last){
            temp=bdays[first];
            bdays[first]=bdays[last];
            bdays[last]=temp;

            first++;
            last--;
        }
        return temp;
    }
    public static void main(String[] args){
        int bdays[] = {23,17,18,9,6,26,15};
        
        reversing(bdays);

        for(int i=0;i<bdays.length;i++){
            System.out.print(bdays[i]+" ");
        }
        System.out.println();

    }
}