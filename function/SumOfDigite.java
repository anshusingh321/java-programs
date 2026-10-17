import java.util.*;
public class SumOfDigite {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer : ");
        int digits = sc.nextInt();
        System.out.println("The sum is " + sumDigits(digits));

    }
    public static int sumDigits(int n){
        int sumOfDigits = 0;

        while(n>0){
            int lastDigits = n % 10;
            sumOfDigits += lastDigits ;
            n /= 10; 

        }
        return sumOfDigits;
    }
    
}
