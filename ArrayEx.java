package nenu;

public class ArrayEx {

	public static void main(String[] args) 
	{
		int numbers [];
		numbers = new int[10];
		numbers [0] = 45;
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
