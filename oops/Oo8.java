package oops;
// understanding interfaces- is the blueprint of the class. there are 2 uses of interface- a.to implement multiple inheritance b. to acheive total abstraction  
public class Oo8 {
  public static void main(String[] args) {
    Cows c1= new Cows(); 
    c1.legs();

    //achieving multiple inheritance 

    Children d1=new Children(); 
    d1.nose();
    d1.anger();
  }
}

// what are the properties of interfaces? that all the methods should be public,abstract, static and no implementation. 

//to acheive total abstraction 

interface AnimalKing{
  void legs();
}

class Cows implements AnimalKing{
  public void legs(){
    System.out.println("i have 4 legs");
  }
}

//to achieve multiple inheritance 

interface Mummy {
  void anger();
}

interface Papa {
  void nose(); 
}

class Children implements Mummy,Papa{ 
  public void anger(){
    System.out.println("i need to count till 10 to be calm about the situation");
  }

  // the methods should be public in interfaces. 

  public void nose(){
    System.out.println("i have my dads nose");
  }
}
