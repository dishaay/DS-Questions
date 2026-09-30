class Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> triangle= new ArrayList <> (); 

        //outer loop which will take care of my rows. 

        for(int i=1;i<=numRows;i++){
            //and for every row i am going to have a new list row which will eventually add it to my triangle. 

            List <Integer> row= new ArrayList<>(); 
            row.add(1);
            int num= i-1;//this is my n in my calculation of rows. 
            int res=1; //used to store the result. 

            for(int j=0;j<i-1;j++){
                res= res * num; 
                res= res / (j+1); 
                row.add(res); 
                num--;
            }
            triangle.add(row);
        }
        return triangle;
    }
}