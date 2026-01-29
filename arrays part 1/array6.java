public class array6 {
  public static void printSub(int arr[]){ 
    int sum=0;
    for(int i=0;i<arr.length;i++){ 
      int start=i; 

      for (int j=i;j<arr.length;j++){ 
        int end=j; 
      
      for (int k=start;k<=end;k++){
        sum=sum+arr[k];
        System.out.print(arr[k]+" ");
      }
      System.out.println();
      System.out.println("the sum is "+sum);
      sum=0;
    }
    System.out.println();
    }

  }

  public static void main (String args[]){ 
    int arr[]={2,4,6,8,10}; 
    printSub(arr); 
  }
}
