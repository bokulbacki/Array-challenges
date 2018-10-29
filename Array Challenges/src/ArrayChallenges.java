
public class ArrayChallenges
	{

		public static void main(String[] args)
			{
				printThird();
				printLastInt();

			}

		public static void printThird()
		{
			String [ ] elements = new String [4];
			elements [0] = "earth";
			elements [1] = "wind";
			elements [2] = "water";
			elements [3] = "fire";
			
			System.out.println(elements[2]);
		}
		
		public static void printLastInt()
		{
			int [] numbers = new int [4];
			numbers [0] = 1;
			numbers [1] = 3;
			numbers [2] = 9;
			numbers [3] = 8;
			
			System.out.println(numbers[numbers.length-1]);
			System.out.println();
			double sum =0;
			for (int i =0; i<numbers.length; i++)
				{
					System.out.println(numbers[i]);
					sum = sum + numbers[i];
				}
			
			double average = sum/4;
			System.out.println("The average of these numbers is " + average);
			
			
		}
		
		
			
		
	}
