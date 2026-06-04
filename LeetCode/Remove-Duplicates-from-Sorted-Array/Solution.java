1class Solution {
2    public static int removeDuplicates(int[] arr) {
3        int i=0; //my first unique element. 
4        for(int j=1; j<arr.length;j++){
5            if(arr[i]!=arr[j]){
6                arr[i+1]=arr[j];
7                i++;
8            }
9        }
10
11        return i+1;
12}
13}
14