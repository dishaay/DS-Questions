class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s= new StringBuilder();
        //calculate the minimum length first. 
        int minLength=strs[0].length();
        for(int i=0;i<strs.length;i++){
            minLength=Math.min(strs[i].length(),minLength);
        }
        //i will traverse through the characters firs, that is first i will decide which character i am gonna compare! 

        for(int i=0;i<minLength;i++){ //characters
            for(int j=1;j<strs.length;j++){ //words
                if(strs[0].charAt(i)!=strs[j].charAt(i)){
                   return s.toString();
                    
                }
            }
             s.append(strs[0].charAt(i));


        }
            return s.toString();

    }
}