import java.util.*;
public class syntex {
    public static void printnum(){
        System.out.println("anshu singh");
        System.out.println("anshu singh");

    }
    public static int calculatesum(int a ,int b ){ //parameters or formal parameter
        int sum = a + b;
        return sum;
      
    
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a,b); // arguments or actual parameter
        System.out.println("Sum is : " +sum);
       
    }
    
}
