package recursion; 

//find the nth power of an element. 

public class Recur3{
  public static void main(String[] args) {
    int n=5; 
    int x=5;
    System.out.println(checkPow(x, n));
  }

public static int checkPow(int x, int n){
  if(n==0){
    return 1;
  }
  int pnm1= checkPow(x,n-1);
  int pn= x * pnm1; 
  return pn; 
}
}

