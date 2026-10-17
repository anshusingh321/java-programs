package meanArray;
import java.util.HashSet;
import java.util.Set;


public class Num2TwiceOrDistinct {
    public static boolean DublicateArray(int numbers[]){
        Set<Integer>set = new HashSet<>();

        for(int i = 0;i<numbers.length;i++){
   
            if(set.contains (numbers[i])){
                return true;
            }
            set.add(numbers[i]);

        }
        return false;
    }
    public static void main(String[] args){
        int numbers[] = {1,2,3,2};
        System.out.println(DublicateArray(numbers));
       }
}
