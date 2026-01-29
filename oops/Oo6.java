package oops;
 //understanding inheritance
public class Oo6 {
  public static void main(String[] args) {
    Dogs d1=new Dogs(); 
    d1.eat();
    d1.identity();
  }
}

  //single level inheritance 

  class Animal{ 
    void eat(){
      System.out.println("eating");
    }
  }

  class Dogs extends Animal{
    void identity(){
    System.out.println("hi i am even an animal now");
    }
  } //single level inheritance ends here 


  //multiple inheritance 

  class Puppies extends Dogs{ 
    void squeal(){
      System.out.println("whoa i can squeal too");
    }
  }
  //animals -> Dogs -> Puppies. multiple inheritance ends here 

  //hierarchial inheritance 
  class Puppies2 extends Dogs{
    void squealing(){
      System.out.println("ugh my sibling is fighting with me ");
    }
  }
  //animals-> Dogs -> Puppies1 and Puppies2. hierarchial inheritance ends here 

  //multiple inheritance 

  // the flow of the inheritance, Animal->Dogs ->Puppies1, Puppies2->EndOf, anEra 

  class EndOf extends Puppies{
    void isItEnding(){
      System.out.println("hi,my uncle is Puppies2");
    }
  }

  class AnEra extends Puppies2{ 
    void itsDefEnding(){
      System.out.println("hi my uncle is Puppies");
    }
  }

  //we covered a. single inheritance b. multiple inheritance c. hierarchial inheritance d. hybrid inheritance 

  //we dont have multiple inheritance in java, but we can implement it using interfaces . 