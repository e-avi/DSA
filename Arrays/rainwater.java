import java.util.*;

public class rainwater{

    public static int wateramount(int array[], int n){
    
        int leftmax[] = new int[n];
        leftmax[0]=array[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(array[i],leftmax[i-1]);
        }


        int rightmax[] = new int[n];
        rightmax[n-1]=array[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(array[i],rightmax[i+1]);
        }

        int waterlevel[] = new int[n];
        int water = 0;
        for(int i=0;i<n;i++){
            waterlevel[i]=Math.min(leftmax[i],rightmax[i]);
            water += waterlevel[i] - array[i];
        }
        return water;
    }

    public static void main(String args[]){
        int height[] = {4,2,0};
        int n=height.length;

        int trappedwater = wateramount(height,n);
        if(n>2){
            System.out.println("Total water trapped is: "+trappedwater);
        }
        else{
            System.out.println("No water trapped");
        }    
    }
}