package nenu;

class ArrayRev
{
    void arrayRev()
    {
        int[] myList = new int[5];
        for(int index = 0;index < myList.length ; index++)
        {
            myList[index] = myList.length - index; /*5 - 0, 5 - 1, 5 -2 , 5 - 3 upto 5 - 4*/
        }
        
        for(int num : myList)
        {
            System.out.println(num);
        }
    }
}
class ArrayPractise
{
    public static void main(String[] args) 
    {
        ArrayRev obj1 = new ArrayRev();
        obj1.arrayRev();
        System.out.println("Try programiz.pro");
    }
}
