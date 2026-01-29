package recursion; 

public class Recur2{
  public static void main(String[] args) {
    int n=5;
    Fact(n);
    System.out.println(Fact(n));
    System.out.println(calcSum(n));
    System.out.println(fib(n));
    int arr[]={1,2,3,87,0,3}; 
    System.out.println(firstOccur(arr, 3, 0) );
  }

  //finding the factorial of a number 
  public static int Fact(int n){
    if (n==0){
      return 1;
    }
    int fnm1=Fact(n-1);
    int fn=n*fnm1;
    return fn;
  }
  //calculating the sum of first n numbers 
  public static int calcSum(int n){
    if(n==1){
      return 1; 
    }
    int sumnm1=calcSum(n-1);
    int sum=n+sumnm1;
    return sum;
  }

  //calculating the sum of nth fibonacii numbers 

  public static int fib(int n){

    if(n==1){
      return 1; 
    }
    else if(n==0){
      return 0;
    }
    int fnm1=fib(n-1);
    int fnm2=fib(n-2);
    int fibo=fnm1+fnm2;
    return fibo;
    }


    //check the first occurence of the element in an array 

    public static int firstOccur(int arr[],int key,int i){

      //base case- end tak pohch gayi, abhi tak mili toh kya hi milegi ab 

      if(arr[i]==arr.length-1){
        return -1; 
      }
      if (arr[i]==key){
        return i; 
      } //key mil gayi h idhar mujhe 

      //key nai mili woh index pe 

      return firstOccur(arr,key,i+1); 
      
    }
  }