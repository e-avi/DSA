import java.util.*;

public class subarrays{

    public static void main(String[] args){
        int bdays[]={23,17,18,9,4,26,15};

        for(int i=0;i<bdays.length;i++){
            System.out.println("("+bdays[i]);
            
            for(int j=i;j<bdays.length;j++){
                if(j==i){
                    break;
                }
                else{
                    System.out.print(","+bdays[j]);
                }
            }
            System.out.println(")");
        }

    }
}