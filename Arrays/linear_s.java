public class linear_s{
    public static void main(String[] args){
        int bdays[] = {23,17,18,6,9,15,26};
        int key = 9, temp = -1;

        for(int i=0;i<bdays.length;i++){
            if(bdays[i]==key){
                System.out.println("Element found at index: "+i);
                temp = i;
            }
        }
        if(temp==-1){
            System.out.print("Element cannot be found in the array");
        }
    }
}