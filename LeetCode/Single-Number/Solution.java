1class Solution {
2    public static int singleNumber(int[] arr) {
3        int xor=0; 
4        for(int i=0;i<arr.length;i++){
5            xor= xor ^ arr[i];
6        }
7        return xor;
8    }
9}