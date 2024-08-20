import java.util.*;

public class binary_s{
    public static int binary_Search(int bdays[], int key){

        int start =0; 
        int end = bdays.length-1;
        int mid, temp=-1;

        while(start<=end){
            mid = (int)(start+end)/2;

            if(bdays[mid]==key){
                temp = mid;
                break;
            }
            if(bdays[mid]<key){
                start = mid+1;
            }
            if(bdays[mid]>key){
                end = mid-1;
            }
        }
        return temp;
    }
    public static void main(String[] args){
        int bdays[]={23,18,17,4,9,15,26};
        int key = 92;
        int temp=-1;

        temp = binary_Search(bdays,key);

        if(temp==-1){
            System.out.print("Element not found in the array ");
        }
        else{
            System.out.print("Element is found at position: "+temp);
        }
    }
}