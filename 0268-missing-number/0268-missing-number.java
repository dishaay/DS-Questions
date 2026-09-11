class Solution {
    public int missingNumber(int[] arr) {
        for(int i=0;i<=arr.length;i++){
            boolean found= false;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    found=true;
                    break;
                }
            }
            if(found==false){
                return i;
            }
        }
        return -1;
    }
    
}