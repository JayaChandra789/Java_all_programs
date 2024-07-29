package nenu;

public class ArrayEx 
{
	public static void main(String[] args) 
	{                            /* syntax = Data_Type variable_name []; --> [] it indicates array symbol */
		int numbers [];
		numbers = new int[10];   /* varaible_name = new data_Type ['length of array']; */ 
		numbers [0] = 45;       /* without for loop its long process--->
		                        	int numbers [];
		                            numbers = new int[3];   		
		                            numbers [0] = 45;
		                            numbers [1] = 78;
		                            numbers [2] = 93;		
		                            System.out.print(numbers [0]);  */
		numbers [1] = 78;
		numbers [2] = 93;
		numbers [3] = 82;
		numbers [4] = 95;
		numbers [5] = 16;
		numbers [6] = 74;
		numbers [7] = 83;
		numbers [8] = 121;
		numbers [9] = 173;
		
		System.out.print("numbers: ");
		for (int index=0; index < numbers.length; index++) 
		{
			System.out.print(numbers[index] + ",");
		}
	}

}
