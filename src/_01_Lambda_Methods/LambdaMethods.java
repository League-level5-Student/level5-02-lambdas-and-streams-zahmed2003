package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s) ->
		{
			for(int i = s.length() - 1; i >= 0; i--) {System.out.print(s.charAt(i));}
			System.out.println();
		}
				, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) ->
		{
			boolean upper = true;
			for(int i = s.length() - 1; i >= 0; i--) 
			{
				if(upper) {System.out.print(s.substring(i, i+1).toUpperCase());}
				else {System.out.print(s.substring(i, i+1).toLowerCase());}
				upper = !upper;
			}
			System.out.println("");
		}
				, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s) ->
		{
			for(int i = s.length() - 1; i >= 0; i--) {System.out.print(s.charAt(i) + ".");}
			System.out.println();
		}
				, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s) ->
		{
			for(int i = s.length() - 1; i >= 0; i--) 
			{
				char c = s.charAt(i);
				if(!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {System.out.print(c);}
			}
			System.out.println();
		}
				, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
