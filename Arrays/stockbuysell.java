import java.util.*;

public class stockbuysell{
    public static int stock(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit,profit);
            }
            else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args){
        int prices[] = {23,17,18,9,4,26,15};
        int sum = stock(prices);
        System.out.println("The maximum profit is: "+sum);
    }
}