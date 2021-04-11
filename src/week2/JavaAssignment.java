package week2;

public class JavaAssignment {

	public static void main(String[] args) {
		
//Step 1: What do each of the following Boolean expressions evaluate to?
		System.out.println( true && false);
		System.out.println( true || false);
		System.out.println( false && false);
		System.out.println( true && (false || true));
		System.out.println( false || (true && false));
		System.out.println( false || 1 < 5);
		System.out.println( 5 >= 4 && 1 > 3);
		System.out.println( 10 < 4 || 1 > 4);
		System.out.println( 12 >= 2 && 1 < 24);
		System.out.println( "Hello".charAt(0)=='h');
		
//Step 2: create three boolean variables with values.
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = true;

//Step 3: create variables "costOfMilk" "moneyInWallet" "thirstLevel"
//Step 3: choose the best data type for each.
		double costOfMilk = 3.99;
		double moneyInWallet = 25.00;
		int thirstLevel = 6;
//Step 4: using variables and Boolean operators, create variables for:
//Step 4a: shouldBuyIceCream
		//redo to be more engaging, should be able to adjust is hot, etc.
		boolean shouldBuyIceCream = (isHotOutside && hasMoneyInPocket);
		System.out.println("Should I buy icecream? " + shouldBuyIceCream);
				
//Step 4: using variables and Boolean operators, create variables for:
//Step 4b: willGoSwimming
		boolean willGoSwimming = (isHotOutside && !isWeekday);
		System.out.println("Will I go swimming? " + willGoSwimming);
				
//Step 4: using variables and Boolean operators, create variables for:
//Step 4c: isAGoodDay
		boolean isAGoodDay = (isHotOutside && hasMoneyInPocket && !isWeekday);
		System.out.println("Is it a good day? " + isAGoodDay);
		
//Step 4: using variables and Boolean operators, create variables for:
//Step 4d: willBuyMilk
		boolean willBuyMilk = (isHotOutside && (thirstLevel > 3) && moneyInWallet > (2*costOfMilk));
		System.out.println("Will I buy milk? " + willBuyMilk);
	}

}
