import java.util.Scanner;

public class MyCalculator
	{
	static Scanner userStringInput = new Scanner(System.in);
	static Scanner userIntInput = new Scanner (System.in);
	static String choice;
	static boolean calculating = true;
	static double num1; 
	static double num2;
	public static void main(String[] args)
		{
		System.out.println("Heyo welcome to Tony Hawk's Patented Calcuator...");
		while(calculating)
			{
			introduction();
			chooseNumbers();
			if (choice.equals("A"))
				{
				add(num1, num2);
				System.out.println(add(num1,num2));
				}
			else if (choice.equals("S"))
				{
				subtract(num1, num2);
				System.out.println(subtract(num1,num2));	
				}
			else if (choice.equals("M"))
				{
				multiply(num1, num2);
				System.out.println(multiply(num1,num2));	
				}
			else if (choice.equals("D"))
				{
				divide(num1, num2);
				System.out.println(divide(num1,num2));	
				}
			else if (choice.equals("E"))
				{
				exponent(num1, num2);
				System.out.println(exponent(num1,num2));	
				}
			continueCalculations();
			}
		}
	public static void introduction()
		{
	
		System.out.println("What type of function whould you like to use?");
		System.out.println("(Type 'A' for Addition, 'S' for Subtraction, 'M' for Multiplication, 'D' for Division, or 'E' for exponents)");
		choice = userStringInput.nextLine();
		}
	public static void chooseNumbers()
		{
		System.out.println("What is the first number you would like to use?");
		num1 = userIntInput.nextDouble();
		System.out.println("And what do you want your second number to be?");
		num2 = userIntInput.nextDouble();
		System.out.println("Put em together for a total of...");
		}
	public static double add(double x, double y)
		{
		return(x+y);
		}
	public static double subtract(double x, double y)
		{
		return(x-y);
		}
	public static double multiply(double x, double y)
		{
		return(x*y);
		}
	public static double divide(double x, double y)
		{
		return(x/y);
		}
	public static double exponent(double x, double y)
		{
		return(Math.pow(x, y));
		}
	public static void continueCalculations()
	{
	System.out.println("Yes or No, would you like to continue calculating?");
	String play = userStringInput.nextLine();
	play = play.toLowerCase();
	if(play.equals("yes"))
		{
		System.out.println(" ");	
		}
	else if (play.equals("no"))
		{
		System.out.println("Calculate you later!");
		calculating = false;
		}
	}
}

