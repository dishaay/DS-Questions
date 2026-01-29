//if the string is Palindrome or not

package Stringss;

public class str3 {

  public static boolean checkP(String str){
    for(int i=0;i<str.length()/2;i++){
      int n=str.length();
      if(str.charAt(i)!=str.charAt(n-1-i)){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    String str="madam"; 
    System.out.println(checkP(str));
  }
}
