import java.util.Scanner;

//display all factorial up to n
//factorial = the product of a number and all the numbers before it
public class Fac {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What number do you want the factorial of?");
		int factorial = in.nextInt();

		System.out.println("Recursive factorial = " + recursiveFactorail(factorial));
		System.out.println("Looped factorial = " + loopedFactorial(factorial));
		System.out.println("Reverse Looped factorial = " + reverseLoopedFactorial(factorial));
		in.close();
	}

	private static int reverseLoopedFactorial(int factorial) {
		int returnValue = 1;

		for(int i = factorial; i >= 1; i--) {
			returnValue = returnValue*i;
		}
		return returnValue;
	}

	private static int loopedFactorial(int factorial) {
		int returnValue = 1;

		for(int i = 1; i <= factorial; i++) {
			returnValue = returnValue*i;
		}
		return returnValue;
	}

	private static int recursiveFactorail(int factorial) {
		if(factorial == 1) {
			return 1;
		}
		return factorial*recursiveFactorail(factorial-1);
	}
}
