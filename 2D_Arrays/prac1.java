// print the number of 7's in the 2d array 


public class prac1 {
  
  public static void search(int arr[][],int key){
    int rep=0;
    for (int i=0;i<arr.length;i++){
      for (int j=0;j<arr[0].length;j++){ 
        if(key==arr[i][j]){
          rep++;
        }
      }
    }
    System.out.println("the number of times 7 was repeated is " +rep + " times");
  }


  public static void main(String[] args) {
    
    int arr[][]={{4,7,8},{8,8,7}}; 
    int key=8;

    search(arr, key);
  }
}
