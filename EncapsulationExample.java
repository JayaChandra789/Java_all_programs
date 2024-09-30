package oopsExamples;

class Student
{
	private String studentName;
	private int studentId;
	private String collegeName;
	/*----------SET METHOD----------*/
	public void setStudentName(String studentName) //Use **setMethodName()**
	{                                             //
		this.studentName=studentName;
	}
	/*----------GET METHOD----------*/
	public String getStudentName()              //use **DataType getMethodName()**
	{
		return studentName;                     // return
	}
	/*----------SET METHOD----------*/
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	/*----------GET METHOD----------*/
	public int getStudentId()
	{
		return studentId;
	}
	/*----------SET METHOD----------*/
	public void setCollegeName(String collegeName)
	{
		this.collegeName=collegeName;
	}
	/*----------GET METHOD----------*/
	public String getCollegeName()
	{
		return collegeName;
	}
}
public class EncapsulationExample 
{
	public static void main(String[] args) 
	{
		Student StObj = new Student();      /*creating Object*/
		StObj.setStudentName("Jaya");       /*calling Methods Of set*/
		StObj.setStudentId(185);            /*calling Methods Of set*/
		StObj.setCollegeName("Avanthi");    /*calling Methods Of set*/
 
		/*Using object to call GetMethods*/
		System.out.println("Student Name: "+ StObj.getStudentName()); 
		System.out.println("Student Id: "+ StObj.getStudentId());
		System.out.println("Student College Name: "+ StObj.getCollegeName());	
	}
}
