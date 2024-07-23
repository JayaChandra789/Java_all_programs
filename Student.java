package nenu;
public class Student 
{
    int studentId =  185; //Defining variables
    String name = "Jaya"; //Defining variables
    String phone = "12345" ; //Defining variables
     
    void fun()  //return type of 
    {
        System.out.println("Student is having fun");
        System.out.println("Student is in park");
    }
        public static void main(String[] args) //main method and creating new object with new keyword

        {
        Student sai = new Student() ;  //new keyword is used
        sai.fun();  //returns void by creating object only which is followed by return type void
        System.out.println(sai.name);
        System.out.println(sai.studentId);
        System.out.println(sai.phone);
        }

}