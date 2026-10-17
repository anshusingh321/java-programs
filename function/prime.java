import java.util.*;
public class prime {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=n-1;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println(n + " is a prime number ");
    
        }
        else{
            System.out.println(n + " is not prime number");
        }

        

    }
    
}
