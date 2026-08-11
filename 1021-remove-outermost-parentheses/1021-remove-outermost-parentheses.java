class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder st= new StringBuilder(); 
        int depth=0; 
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++; 
                if(depth==1){
                    continue;
                }
                else{
                    st.append(s.charAt(i));
                }
            }
            else{
                depth--;
                if(depth==0){
                    continue;
                }
                else{
                st.append(s.charAt(i));

                }
            }
        }

        return st.toString();
    }
}