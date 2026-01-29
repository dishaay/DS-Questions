package recursion;
//sum of n natural numbers. 

public class Recur4 {
  public static void main(String[] args) {
    System.out.println(sumN(5));
  }



  public static int sumN(int n){
    if(n==1){     //base case 
      return 1; 
    }
    int sumnm1=sumN(n-1); 
    int fsum=n+sumnm1;
    return fsum;
  }
}
