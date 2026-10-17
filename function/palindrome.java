import java.util.*;
public class palindrome {
    public static boolean isPalindrome(int n){
        int rev = 0;
        int original = n;
        while(n != 0){
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return original == rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();

        if(isPalindrome(n)){
            System.out.println(n + " is palindrome number");
        }
        else{
            System.out.println(n + " is not palindrome number");
        }
    }    
}
