package nenu;

public class Varaible 
{
  int a ;
  static int b = 22;

 void pen() 
 {
	 int c = 0;
	 System.out.println(a);
	 System.out.println(b);
	 System.out.println(c);
 }
 void ink()
 {
	 System.out.println(b); 
	  
 }
 public static void main(String []args)
 {
	 Varaible mind = new Varaible();
	 mind.pen();
	 mind.ink();
	 System.out.println(mind.a);
 }
}