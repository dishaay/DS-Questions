package oops;
//understanding abstract classes 

public class Oo7 {
  public static void main(String args[]){ 
  Cats nana= new Cats(); 
  nana.meow();
  }
}

abstract class Animal{
  
  Animal(){ 
      System.out.print("hi i am getting implemented");
  }

  void eat(){ //non-abstract method 
    System.out.println("hello, i am eating ");
  }

  //abstract method
   abstract void walk(); //i have only given the idea here and the implementation will be done in the further sub-classes. 
}

class Cats extends Animal{
  void walk(){
    System.out.println("hi i am walking on 2 legs");
  }

  void meow(){
    System.out.println("my owner loves my meow ");
  }
}



