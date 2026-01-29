package oops;
//demonstrating how to use constructors. 

public class Oo4 {
  
public static void main (String args[]){
  Student s1=new Student("dishaa"); 
  System.out.println(s1.name);
}

}

class Student{ 
  String name; 
  int roll; 

  Student(String name ){ //created a constructor here. 
//now this will be called automatically at the time of object creation. 
 //let us check if my constructor is being called 

 System.out.println("the constructor is being called here");

 //let us use this constructor and assign some values to it 

 this.name=name; 
  }
}
