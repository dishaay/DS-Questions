class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> ans= new ArrayList<>(); //this is my answer list. 

        int top= 0 ; 
        int right= matrix[0].length-1; //going through columns 
        int bottom= matrix.length-1; //it is sitting at my last row. 
        int left= 0; //first column boundary. 

        while(top<=bottom && left<=right){
            //top. 

            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            //right. 

            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;

            //bottom. 
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //left. 

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}