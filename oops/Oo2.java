package oops; 
//understanding getters and setters. 

class Oo2{

  public static void main(String args[]){
  Car c1=new Car(); 
  c1.setName("tesla");
  System.out.println(c1.getName());

  c1.setName("idk");
  System.out.println( c1.getName());
  }
}

class Car { 
  private String name; 
  private int roll;

  String getName(){
    return this.name;
    }

    //usually the setters in the oops are used to set the value hence void as a return type but its fine if u have a return type to it.

  String setName(String name){
    this.name=name;

    return this.name;
  }
}