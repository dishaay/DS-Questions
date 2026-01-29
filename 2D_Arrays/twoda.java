//learning how to create a 2d array 
import java.util.*;

public class twoda {
 static int arr[][]= new int[3][3]; 
  static int n=arr.length; 
  static int m=arr[0].length;

  static Scanner sc=new Scanner(System.in); 
  public static void main(String[] args) {
    inputArr(arr);
    printArr(arr);
        int key= sc.nextInt(); 
    search(arr, key);
  }
  public static void inputArr(int arr[][]){
 for(int i=0;i<n;i++){
    for (int j=0;j<m;j++){
      arr[i][j]=sc.nextInt();
    }
  }
  }

  //output
  public static void printArr(int arr[][]){
  for(int i=0;i<n;i++){
    for (int j=0;j<m;j++){
      System.out.print(arr[i][j] +" ");
    }
    System.out.println();
  }
}
//searching the element.
public static boolean search(int arr[][],int key){ 
   for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){ 
      if (key==arr[i][j]){
        System.out.print("found at cell"+ i + ""+j);
        return true; 

      }
    }
    }
    System.out.print("key not found");
    return false; 
  }
}
