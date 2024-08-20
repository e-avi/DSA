import java.util.*;

public class pairs{
    public static void main(String[] args){
        int bdays[]={23,17,18,9,4,26,15};
        
        for(int i=0;i<bdays.length;i++){
            for(int j=i+1;j<bdays.length;j++){
                System.out.print("("+bdays[i]+","+bdays[j]+")");
            }
            System.out.println();
        }
    }
}