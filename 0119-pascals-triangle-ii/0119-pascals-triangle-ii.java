class Solution {
    public List<Integer> getRow(int rowIndex) {
        List <Integer> ans= new ArrayList<>();
        ans.add(1);
        for(int i=0;i<rowIndex;i++){
            ans.add(tri(rowIndex,i+1));
        }

        return ans;
    }


    public int tri(int n , int r){
        long ans=1; 
        for(int i=0;i<r;i++){
            ans= ans * (n-i); 
            ans= ans / (i + 1 ); 
        }
        return (int)ans; 
    }
}