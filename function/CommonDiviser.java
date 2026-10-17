import java.util.*;
public class CommonDiviser {
    public static int findGCD(int a,int b){
        while(b != 0){
            int remainder = (a % b);
            a = b;
            b = remainder;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter frist number ");
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();

        int result = findGCD(a,b);

        System.out.println("GCD = " + result);

      
    }
    
}
