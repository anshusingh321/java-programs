import java.util.*;
public class averageThreeNumber {
     

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Input the firt number : ");
            double x = sc.nextDouble();
            System.out.print("Input the second : ");
            double y = sc.nextDouble();
            System.out.print("Input the third number : ");
            double z = sc.nextDouble();
            System.out.print("The average value is "+ average(x,y,z)+"\n");
          
    }
    public static double average(double x, double y, double z){
        return (x+y+z)/3;
    }
     
   
}
