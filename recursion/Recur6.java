package recursion;

//find all the occurences of the key. 

public class Recur6 {
  public static void main(String[] args) {
    int arr[] ={2,1,2,2,2,2}; 
    int key= 9; 
    findOcc(arr , key, 0);
  }


public static void findOcc(int arr[],int key,int i){
  //where arr is the array , key is the element which we want to find and i is the starting position 

  //base case: 

  if(i==arr.length){
    return; 
  }


  if(arr[i]==key){
    System.out.println(i+ " ");
  }


  findOcc(arr, key, i+1);
}
} 
