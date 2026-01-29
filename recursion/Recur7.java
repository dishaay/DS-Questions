package recursion;
// fibo of a number 
public class Recur7 {
  public static void main(String[] args) {
    int n=5; 
    System.out.println(fibo(n));
    System.out.println(power(2,3));
  }

  public static int fibo(int n){ 
    //base case 
    if (n==1 || n==0 ){
      return n; 
    }

    return fibo(n-1)+fibo(n-2); 
  }
  public static int power(int base,int power)
  {
    //base condn
    if(power == 0)
      return 1;
    return base * power(base,power-1);
  }
}
