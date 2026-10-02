class Solution {
    public void setZeroes(int[][] matrix) {
        int m= matrix.length; 
        int n= matrix[0].length; 
        int col0=1;

        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                col0=0; 
            }

            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0; //marking my first element of row as 0. 
                    matrix[0][j]=0; //marking my first element of col as 0 
                }
            }
        }

            //second pass, is to mark the elements as zero as per their markers. 

            for(int i=1;i<m;i++){
                for(int j=1;j<n;j++){
                    if(matrix[i][0]==0 || matrix[0][j]==0){
                        matrix[i][j]=0;
                        }
                }
            }

            //now checking for my first row and column as zero. 

            if(matrix[0][0]==0){//make my first row as zero. 
                for(int col=0;col<n;col++){
                    matrix[0][col]=0;
                }
            }

            if(col0==0){
                for(int row=0;row<m;row++){
                    matrix[row][0]=0;
                }
            }

        }
    }
