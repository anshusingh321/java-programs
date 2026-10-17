import java.util.*;
public class reverseNum {
    public static int reverseNum(int n){
        int rev = 0;
       
        for(int i=0;i<=n;i++){
            
            int rem = n%10;
            rev = (rev * 10) + rem;
            n = n/10;


        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int result = reverseNum(n);

        System.out.println("Reverse number is = "+ result);

    }
    
}
