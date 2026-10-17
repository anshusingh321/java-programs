package meanArray;

public class MoveZeroToEnd {
    public static void moveZeros(int numbers[]){
        int size = numbers.length;
        if(size == 0 || size == 1 ){
            return;
        }
        int nz = 0;
        int z = 0;
        while(nz < size){
            if(numbers[nz] != 0){
                int temp = numbers[nz];
                numbers[nz] = numbers[z];
                numbers[z] = temp;
                nz++;
                z++; 
            }
            else{
                nz++;  
            }
        }
    }
    public static void main(String[] args){
        int numbers[] = {10,0,8,0,22,8,0,5,6};
        moveZeros(numbers);
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

    }
}
