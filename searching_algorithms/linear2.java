
public class linear2 {
  
  public static int search(String menu[],String key){

  for(int i=0;i<menu.length;i++){
    if (menu[i]==key){
      return i;
    }
  }
    return -1;
}



  public static void main (String args[]){ 
    String menu[]={"dosa","idli","sambhar","chutney"}; 
    String fav="samaosa";

    int foundya=search(menu,fav);

    if(foundya==-1){ 
      System.out.println("dish is not found");
    }

    else { 
      System.out.println("your fav dish is at the "+foundya+"th position");
    }
    
  }
}
