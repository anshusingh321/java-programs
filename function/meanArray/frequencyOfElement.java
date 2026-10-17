package meanArray;
public class frequencyOfElement {
    public static void frequency(int numbers[]){
        int freq = 1;
        int i = 1;
        while(i<numbers.length)
            {
        
            while(i<numbers.length && numbers[i] == numbers[i-1])
            {
                freq++;
                i++;
            }
        
            System.out.println(numbers[i-1] + " " + freq);
            freq = 1;
            i++;
        }  
    }
    public static void main(String[] args){
        int numbers[] = {20,20,30,30,30,30,40};
        frequency(numbers);
             
    }

    

}

