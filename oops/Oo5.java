package oops;
//learning constructor overloading, copy constructor and what is deep and shallow constructor 
public class Oo5 {

  public static void main(String[] args) {
    Book b1=new Book("holly jackson"); 
    b1.name="all of us are dead"; 
    b1.bid=013;
    b1.price[0]=1000; 
    b1.price[1]=2000;
   
    Book b2=new Book(b1);
    System.out.println(b2.name);
    System.out.println(b2.bid);
    // System.out.println(b2.price[0]); //shallow copy 
    System.out.println(b2.price[0]);
}
  }

class Book { 
  String name; 
  int bid;
  int price[]; 

  Book(String author){
    this.price=new int[2];

  }

  //copy constructor 
  Book(Book b1){
    this.name=b1.name; 
    this.bid=b1.bid;
    // this.price=b1.price; //shallow copy 
     b1.price[0]=102;
    price=new int [2]; 
    for(int i=0;i<b1.price.length;i++){ //deep constructor
      this.price[i]=b1.price[i]; 
    }
}

//shallow constructor- jidhar changes are visible like above. lets dive deep into deep constructors 


}
