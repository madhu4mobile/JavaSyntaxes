package syntaxes;
/*
 * For-each loop in Java
	Prerequisite: Decision making in Java
	For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5.
	It starts with the keyword for like a normal for-loop.
	Instead of declaring and initializing a loop counter variable, you declare a variable that is the same type as the base type of the array, followed by a colon, which is then followed by the array name. 
	In the loop body, you can use the loop variable you created rather than using an indexed array element. 
	It’s commonly used to iterate over an array or a Collections class (eg, ArrayList)
	Syntax: 
	for (type var : array) 
	{ 
	    statements using var;
	}
	is equivalent to:
	for (int i=0; i<arr.length; i++) 
	{ 
	    type var = arr[i];
	    statements using var;
	}
	// Java program to illustrate 
	// for-each loop
 * 
class ForEachLoop{
	public static void main(String[] args) 
	{
		{
			int[] marks = {125, 132, 95, 116, 110};
			int highest_marks = maximum(marks);
			System.out.println("The highest score is "+ highest_marks);
		}
	}
	
	public static int maximum(int[] numbers)
	{
		int maxSoFar = numbers[0];

		// for each loop starts here
		for (int num : numbers)
		{
			if (num > maxSoFar)
			{
				maxSoFar = num;
				
			}
		}
		return maxSoFar;
	}
}*/

public class ForEachLoop {
	   public static void main(String[] args) {
	      int[] intary = { 1,2,3,4};
	      forDisplay(intary);
	      foreachDisplay(intary);
	   }
	   public static void forDisplay(int[] a) {  
	      System.out.println("Display an array using for loop");
	      for (int i = 0; i < a.length; i++) {
	         System.out.print(a[i] + " ");
	      }
	      System.out.println();
	   }
	   public static void foreachDisplay(int[] data) {
	      System.out.println("Display an array using for each loop");
	      for (int a  : data) {
	         System.out.print(a+ " ");
	      }
	   }
	}



   