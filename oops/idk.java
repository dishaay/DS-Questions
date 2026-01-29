package oops;
//abstract classs
public class idk {
  public static void main(String[] args) {
    dwm h1=new dwm(); 
    h1.bunk();
    h1.changeTheRule();

  }
}

abstract class aiml{
  String rule;
  void bunk(){
    System.out.println("we bunked a lab ");
  }

  aiml(){ //constructor 
    System.out.println("you have reached the 4th floor");
    String rule= "dont mass bunk"; 

  }

  abstract void hod(); //the idea has been planted here. 

}

class dwm extends aiml{
  void hod(){
    System.out.println("you have been called to the office ");
  }

  void changeTheRule(){ 
    rule="bunk the lecture"; 
  }
  }

class bce{
  void hod(){
    System.out.println("I really dont care ");
  }
}


