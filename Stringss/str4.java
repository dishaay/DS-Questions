//find the shortest path 
package Stringss;
import java.util.*;
public class str4 {

  public static int findPath(String path){ 
    double x=0,y=0;
    char N,S,W,E;
    for(int i=0;i<path.length();i++){
      if (path.charAt(i)=='N'){
        y++;
      }
      if(path.charAt(i)=='S'){
        y--;
      }
      if(path.charAt(i)=='W'){
        x--;
      }
      if(path.charAt(i)=='E'){
        x++;
      }
    }
    double X=x*x;
    double Y=y*y;

    return (int)Math.sqrt(X+Y);
  }
  public static void main(String[] args) {
    String path="NS"; 
    System.out.println(findPath(path));
  }
}
