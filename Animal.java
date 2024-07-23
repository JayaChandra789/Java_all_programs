package nenu;

public class Animal 
{
  String catbreed = "1.siberain";
  String catName = "2.Tommy";
  String catcolor = "3.White";
  int cat_count = 2;
  
  void cat() 
  {
	  System.out.println("I want to by a cat with above mentioned qualities");
	  System.out.println("I only accept if above qualities are met");
	  System.out.println("The qualities are: ");
  }
  public static void main(String []args)
  {
	  Animal billy = new Animal();
	  billy.cat();
	  System.out.println(billy.catbreed);
	  System.out.println(billy.catName);
	  System.out.println(billy.catcolor);
	  System.out.println(billy.cat_count);	  
  }
}

