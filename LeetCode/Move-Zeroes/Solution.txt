1class Solution {
2    public void moveZeroes(int[] arr) {
3   // 2 pointer appraoch where i will first my zero element and have my j point to it, i will simply iterate through the array and will give me my non-zero element which will be later used to swap the elements. ok! 
4
5   //finding my first non-zero element. 
6    int j= -1; 
7   for(int i=0;i<arr.length;i++){
8    if(arr[i]==0){
9     j=i; // i got my first zero in the array so now just break. 
10     break;    
11    }
12   }
13
14   if(j==-1){
15    //if there are no zero elements. 
16    return; 
17   }
18
19   for (int i=j+1; i<arr.length; i++){
20    if(arr[i]!=0){
21        int temp= arr[i]; 
22        arr[i]=arr[j]; 
23        arr[j]=temp; //i swapped my elements here. 
24        j++; 
25    }
26   }
27}
28}