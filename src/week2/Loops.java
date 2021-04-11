package week2;

public class Loops {

	public static void main(String[] args) {
//Step 5: In the main method of this class, create the following 
//Step 5: loops with any variables you feel are needed:
		//Step 5a: A while loop that prints all even numbers from 0 to 100		
		int evenNumbers = 0;
		while (evenNumbers <= 100) {
			System.out.println(evenNumbers);
			evenNumbers = evenNumbers + 2;
		}
		System.out.println("End of Step 5a");
//Step 5b: A while loop that prints every 3rd number going backwards
//Step 5b: from 100 to 0
		int thirdNumbers = 100;
		while (thirdNumbers >= 0) {
			System.out.println(thirdNumbers);
			thirdNumbers = thirdNumbers - 3;		
		}
		System.out.println("End of Step 5b");
//Step 5c: A for loop that prints every other number from 1 to 100
		for (int everyOther=1; everyOther <= 100; everyOther ++) {
			  if (everyOther % 2 == 0) {
			    System.out.println(everyOther-1);
			    //Assuming the intention is for the output to start at 1
			  }
		}
		System.out.println("End of Step 5c");
		
/*Step 5d: A for loop that prints every number from 0 to 100, 
 * but if the number is divisible by 3, it prints “Hello” instead of the number, 
 * and if the number is divisible by 5, it prints “World” instead of the number,
 * and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
 */
		for (int divNumbers = 0; divNumbers <= 100; divNumbers++) {
			if (divNumbers % 3 == 0 && divNumbers % 5 == 0) {
				System.out.println("HelloWorld");
			}
			else if (divNumbers % 5 == 0) {
				System.out.println("World");
			}
			else if(divNumbers % 3 == 0) {
				System.out.println("Hello");
			}
			else {
				System.out.println(divNumbers);
			}
			
		}
		System.out.println("End of Step 5d");
	}
}
