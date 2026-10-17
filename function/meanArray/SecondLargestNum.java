package meanArray;

public class SecondLargestNum {
    public static int secondLargest(int numbers[] ){
        int max1 = 0,max2 = 0;
        if(numbers[0]>numbers[1]){
            max1 = numbers[0];
            max2 = numbers[1];
        }
        else{
            max1 = numbers[1];
            max2 = numbers[0];
        }
        for(int i = 2;i<numbers.length;i++){
            if(numbers[i]>max1){
                max2 = max1;
                max1 = numbers[i];
               
            }
            else if(numbers[i]>max2){
                max2 = numbers[i];

            }
        }
        return max2; 
    }
    public static void main(String[] args){
        int numbers[] = {20,42,6,25,30,88};
        System.out.println(secondLargest(numbers));
    }
}
