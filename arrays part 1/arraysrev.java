import java.util.*;

public class arraysrev {

    // int marks[]= new int[3]; 
    // Scanner sc= new Scanner(System.in);

    // marks[0]=sc.nextInt();
    // System.out.println(marks[0]);

    // LINEAR SEARCH FOR A MENU 

    public static String findIt(String menu[], String order){
      for(int i=0;i<menu.length;i++){
        if (menu[i]==order){
          return "order it bro";
        }
      }
      return "go home";
  }

  public static void main(String[] args) {
    String menu[]={"dosa", "samosa", "blueberry cake"}; 
    String key="chaas";
    System.out.println(findIt(menu, key));
  }
}
