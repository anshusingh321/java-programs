package meanArray;

public class SortedArray {
    public static boolean isSorted(int numbers[]){
        //int[] arr = {1,2,3,4,5};
        for(int i = 0;i<numbers.length-1;i++){
            if(numbers[i] >numbers[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5};
        boolean answer = isSorted(numbers);
        if(answer){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
