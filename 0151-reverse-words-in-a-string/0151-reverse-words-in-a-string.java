class Solution {
    public String reverseWords(String s) {
        StringBuilder curr= new StringBuilder();
        StringBuilder ans= new StringBuilder();
        Stack <String> st= new Stack <>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && curr.length()>0){
                //space is encountered and my string has something in it. 
                st.push(curr.toString());
                curr.setLength(0);
            }

            else if(s.charAt(i)==' '){
                continue;
            }

            else{
                curr.append(s.charAt(i));
            }
        }
        st.push(curr.toString());
        while(!st.isEmpty()){
            if(ans.length()>0){
             ans.append(" ");

            }
            ans.append(st.pop());
        }

        return ans.toString(); 
    }
}