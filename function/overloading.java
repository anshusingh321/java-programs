import java.util.*;
public class overloading {
    //function to calc sum of 2 nums
    public static int sum(int a , int b){
        return(a+b);
    
    }
    
    //function to calc sum of 3 nums
    public static int sum(int a,int b, int c){
        return(a+b+c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
        
    }

}
