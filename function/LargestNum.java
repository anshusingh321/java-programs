import java.util.*;
public class LargestNum {
    public static int getLargest(int numbers[] ){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
                  
            }
        }
        System.out.println("smallest number is : "+smallest);
        return largest ;
    }
    public static void main(String[] args){
        int numbers[] = {2,6,3,7,1,5};
        System.out.println("Largest number is : "+ getLargest(numbers));
    }

    
}
