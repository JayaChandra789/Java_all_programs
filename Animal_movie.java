package nenu;

public class Animal_movie 
{
  int characters = 15;  //declaring variables
  String Heroname = "Ranveer singh";
  String Heroene_name = "Rashmika ";
  String Villain_name = "Bobby doel";
  
  
	  void enjoy()
  {  
	  System.out.println("The animal movie was super must watch");
  }
    
  public static void main(String []args) 
  {
    Animal_movie fun = new Animal_movie();  //object from class by new keyword
    fun.enjoy(); //using object with return type enjoy
    System.out.println("In movie there are: " + fun.characters +" characters");
    System.out.println("The hero name is: "+ fun.Heroname);
    System.out.println("The Heroene name is: "+ fun.Heroene_name);
    System.out.println("The villian name is: " + fun.Villain_name);  
  }
}
