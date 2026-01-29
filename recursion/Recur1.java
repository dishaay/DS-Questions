package recursion;
 //printing numbers in decreasing order 
 // 10 9 8 7 6 5 4 3 2 1 
public class Recur1 {
  public static void main(String[] args) {
    int n=10; 
    printDec(n); 
    printInc(n);
  }

  public static void printInc(int n){ 
    if(n==1){
      System.out.print(1);
      return; 
    }
    printInc(n-1);
    System.out.print(n);
  }
  public static void printDec(int n){ 
    //basic logic 
    if(n==1){
      System.out.println(1);  //base case is written here. 
      return;
    }
    System.out.print(n + " ");
    printDec(n-1); // toh jab hum koi base case nahi likhte toh kya hota hai it doesn't know where to stop. base case tells us where to stop exactly 
    
  }
}
