//to print the largest and the smallest element in the matrix 
import java.util.*;

public class twoda1 {

  //taking the elements in the matrix
  public static void inArr(int arr[][]){
    Scanner sc=new Scanner(System.in); 
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        arr[i][j]=sc.nextInt();
      }
    }
  }

  //output

  public static void printArr(int arr[][]){ 
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){ 
        System.out.print(arr[i][j]);
      }
    }
    System.out.println();
  }
  
  public static void largest(int arr[][]){
    int largest=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){ 
      for(int j=0;j<arr[0].length;j++){
        if(arr[i][j]>largest){
          largest=arr[i][j];
          }

      }
    }
        System.out.println("the largest element is "+largest);
  }

  public static void main(String[] args) {
    int arr[][]=new int[3][3]; 

    inArr(arr);
    printArr(arr);
    largest(arr);
  }
}
