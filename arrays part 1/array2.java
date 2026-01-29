//to find the largest number in the array 
public class array2 {
  
  public static int search(int arr[]){
    int largest=Integer.MIN_VALUE;
    
    for(int i=0;i<arr.length;i++){
     if(arr[i]>largest){
      largest=arr[i]; 
     }
    }
    return largest;
  }

  public static void main(String args[]){
    int numbers[]={10,1000,25,25}; 

    System.out.println("the largest number in the array is "+ search(numbers)); 
  }
}
