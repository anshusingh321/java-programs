import java.util.*;
public class multiply {
     public static int multiply(int a , int b){
        int product = a*b;
        return product;
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // or int a = 5
        int b = sc.nextInt(); // or int b = 3
        int product = multiply(a,b);
        System.out.println("a * b = "+product);

        product = multiply(10,20);
        System.out.println("a*b = " +product);
    }
    
    

}
