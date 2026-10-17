import java.util.*;
public class evenOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        if(isEven(num)){
            System.out.println("number is even");

        }
        else{
            System.out.println("Number is odd");
        }

    }
    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    
}
