class Solution {
    public void nextPermutation(int[] arr) {
        // step 1 is to find the breakpoint.

    int breakpoint = -1;

    for (int i = arr.length - 2; i >= 0; i--) {
      if (arr[i] < arr[i + 1]) {
        breakpoint = i;
        break;
      }
    }

    if (breakpoint == -1) {
      revA(arr, 0, arr.length - 1);
    }

    //step 2 is to swap  the breakpoint and the smallest biggest element. 
    else{
    for(int j=arr.length-1;j>breakpoint;j--){
        if(arr[j]>arr[breakpoint]){
            int temp= arr[j]; 
            arr[j]=arr[breakpoint];
            arr[breakpoint]=temp; 
            break;
        }
    } 

    //step 3: to arrange the elements after the breakpoint in the ascending order.  

     revA(arr,breakpoint+1,arr.length-1);
     }
  }

  public void revA(int[] arr, int start, int end) {

    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    }
}