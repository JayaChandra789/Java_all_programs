package oopsExamples;

class VoulmeCalculator
{
	public void calculateVolume(int length)   /*Same method name with diff sign(parameters) 
	within same class is called polymorphism*/
	{/* 3.Types:-->changing data_type of same parameters,2.changing no of parameters,3.change (SWAP) order of parameter*/
	   int volume = length * length * length;   
	   System.out.println("The volume of cube is: "+ volume);
	}
	public void calculateVolume(float width,int len ,float height) 
	{
		
		float volume = len * width * height;
		System.out.println("The volume of cuboid is: " +volume );
	}	
}
public class PolymorphismEx 
{
	public static void main(String[] args) 
	{
		VoulmeCalculator vcobj = new VoulmeCalculator();
		vcobj.calculateVolume(3);
		vcobj.calculateVolume(3.0f,4,5.5f);
	}
}