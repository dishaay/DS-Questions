class Solution {
    public String reverseWords(String s) {
        StringBuilder cur = new StringBuilder();
        Stack<String> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ' && cur.length() > 0) {
                st.push(cur.toString());
                cur.setLength(0);
            } else if (s.charAt(i) != ' ') {
                cur.append(s.charAt(i));
            }
        }

        if (cur.length() > 0) {
            st.push(cur.toString());
        }

        StringBuilder word = new StringBuilder();

        while (!st.isEmpty()) {
            if (word.length() > 0) {
                word.append(" ");
            }

            word.append(st.pop());
        }

        return word.toString();
    }
}