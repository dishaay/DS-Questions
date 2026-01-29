public class str6{
  public static void main(String[] args) {
    String st="dIsHA"; 

    System.out.println(countV(st));
  }


  public static int countV(String st){ 
    int n=st.length(); 
    int count=0; 

    for (int i=0;i<n;i++){
      char ch=st.charAt(i); 

    if (ch=='a' || ch=='e' || ch=='i' || ch== 'o' || ch=='u'){
      count++; 
    }  
  
    }
    return count; 

  }
}