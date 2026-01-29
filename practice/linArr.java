import java.util.*;

public class linArr{
  public static void main(String args[]){ 

   Scanner sc= new Scanner(System.in); 
  System.out.println("enter your college's menu"); 
  String arr[]= new String[5];
  for (int i=0;i<arr.length;i++){
    arr[i]=sc.nextLine();
  }
  System.out.println("enter the item which u want to order");
  String key= sc.nextLine();

  System.out.println(Menu(key, arr));
}

public static int Menu(String key, String arr[]){

  for(int i=0;i<arr.length;i++){ 
    if(key==arr[i]){
      return i;
    }
    else{ 
      continue;
    }
  }
  return -1;
}
}
