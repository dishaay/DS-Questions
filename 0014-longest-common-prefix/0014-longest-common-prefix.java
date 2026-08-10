class Solution {    
    public String longestCommonPrefix(String[] str) {
        //your code goes here

        int minLength= str[0].length();
        for(int i=1;i<str.length;i++){
             minLength=Math.min(minLength,str[i].length());
        } //to calculate the shortest string among all the strings. 

        for(int i=0;i<minLength;i++){ //it is traversing through the characters 
            for(int j=1;j<str.length;j++){ //it is traversing through the actual string. 
                if(str[j].charAt(i)!=str[0].charAt(i)){
                    return str[0].substring(0,i);
                }
            }
        }

return str[0].substring(0, minLength);    }
}