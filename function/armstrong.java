import java.util.*;
public class armstrong {
    public static boolean isArmstrong(int n){
        int sum = 0;
        int Original = n;
        //int temp = n;
        //temp = n;
         while(n > 0){        // OR for(int i = n;i>0;i = i/10){ 
            int rem = n % 10;
            sum = sum + (rem*rem*rem);
            n = n / 10;
        }
        return Original == sum; 
    }
        

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        if(isArmstrong(n)){
            System.out.println(n+ " is a Armstron number ");

        }
        else{
            System.out.println(n+ " is not Armstrong number ");
        }
    }
    
}
