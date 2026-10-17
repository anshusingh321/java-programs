public class primeornot {
  //  public static boolean isPrime(int n){
    //    boolean isPrime = true;
      //  for(int i = 2;i<=n-1;i++){
        //    if(n%i == 0){ //complytly dividing
          //      isPrime = false;

            //}
      //  }
      //  return isPrime;
   // }
    //public static void main(String[] args){
      //  System.out.println(isPrime(12));
    //}
//}
     public static boolean isPrime(int n){
        if(n ==2){
            return true;
        }
        for(int i= 2;i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;

     }    
     public static void primesInRange(int n){
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
     }
     public static void main(String[] args){
        primesInRange(20);
     }
}

