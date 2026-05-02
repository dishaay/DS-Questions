1class Solution {
2    public void moveZeroes(int[] arr) {
3    // 2 pointer approach where my j will be pointing to a zero element and i will be pointing to a non-zero element. 
4
5    //finding the non-zero element for j 
6    int j=0; 
7    int temp;
8    for(int i=0;i<arr.length;i++){
9        if(arr[i]==0){
10            j=i;
11            break;
12        }
13    }
14
15    for(int i=j+1;i<arr.length;i++){
16        if(arr[i]!=0 && arr[j]==0){
17            temp=arr[i]; 
18            arr[i]=arr[j];
19            arr[j]=temp;
20            j++;
21        }
22    }
23}
24}