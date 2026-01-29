//finding the duplicates in the array 

public class array8 {
  public static void main (String args[]){
  int arr[]={1,9,2,3,4,5}; 
  findDu(arr);
  }

  public static void findDu(int arr[]){ 

    for(int i=0;i<arr.length;i++){
      int curr=i;
      for(int j=i+1;j<arr.length;j++){
        if (arr[curr]==arr[j]){ 
          System.out.println("'there is a duplicate on the array");
          break;
        }
      }
    }
        System.out.println("there is no duplicate");
  }
}
