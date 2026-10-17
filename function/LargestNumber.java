          import java.util.*;
public class LargestNumber {
    public static int findLargest(int a,int b,int c){
        int largest = a;

        if(b>largest){
            largest = b;

        }
        if(c>largest){
            largest = c;

        }
        return largest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = findLargest(a,b,c);

        System.out.println("Largest n = " + result);

    }
}
