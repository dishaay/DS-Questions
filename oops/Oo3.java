//demonstrate encapsulation 
package oops;

public class Oo3 {

  public static void main(String[] args) {
    Password pw1=new Password();
    pw1.setPass("abcdfghie");
    System.out.println(pw1.getPass());
  }
}

 class Password{
  private String pw; 

  public void setPass(String pw){
    if(pw.length()>=8){
      this.pw=pw;
      System.out.println("password is set"); //using pw=pw is not correct because we are lowkey referring to the same variable and then nothing is set , using this.pw it is referinfg to the class field and the pw is the method parameter which ensures that we are on the right path. also for access parts we all know that we cant access a private variable outside a class but we can change and alter it by methods inside the class. thats that
    }

    else{
      System.out.println("can't set the password");
    }

  }

  public String getPass(){
    return this.pw;
  }
}


/*how is encapsulation being demonstrated here? 
 * because we have used a private variable and then we are accessing that private variable through a method which proves the controlled access part. 

 */