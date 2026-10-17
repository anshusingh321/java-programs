public class ReverseArray {
    public static void Reverse(int numbers[]){
        int frist = 0; int last = numbers.length - 1;

        while(frist < last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[frist];
            numbers[frist] = temp;

            frist++;
            last--;
        }

    }
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10};
        Reverse(numbers);

        for(int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");

        }
        System.out.println();
        

    }

     
}
