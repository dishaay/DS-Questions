package recursion;

//checking the first occurence in the array 
public class Recur5 {
  public static void main(String[] args) {
    int arr[]={1,2,3,2,5};
    System.out.println(firstOccur(arr, 2, 0));
  }


  public static int firstOccur(int arr[],int key,int i){
    if(arr[i]==arr.length-1){  //base case 
      return -1;
    }
    if(arr[i]==key){
      return i;
    }
    return firstOccur(arr, key, i+1);

  }
  //to find last occurence in the array 
  public static int lastOccur(int arr[],int key,int i ){ 
    if (arr[i]==arr.length-1){
      return -1; 
    }

    //last occurence find karne ke liye, first i should traverse the array and then if i dont find the key i return false but if there is only one occurence then??? 

    if(arr[i]==key){   //basic logic 
      return i; 
    }

    lastOccur(arr, key, i+1); 
  }
}





