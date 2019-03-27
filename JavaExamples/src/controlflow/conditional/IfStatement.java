package controlflow.conditional;

// I need a tool from another library
// It must be imported so I can use it
import java.util.Random;

public class IfStatement {

	public static void main(String[] args) {
		Random rand = new Random();

		// Generate a random number between 1 and 10
		// Note: without the +1 at the end, it would have generated a number between 0 and 9
		int x = rand.nextInt(10) + 1;

		System.out.println(String.format("x is %d", x));
        /*
        If the condition is true, the code inside the scope indicated by the
        if statement will be executed
        In an if/else if/else block, one and only one of the code blocks will be executed
        The moment the code finish execute in that block, it will exit the if statements and moves on to the next line
        */
		if (x < 5) {
			System.out.println("Oof, that's low");
		} else if (x < 8) {
			System.out.println("Not bad");
			// Note you can have as many else if's as you want
		} else if (x < 10) {
			System.out.println("Hey, almost there");
		} else {
			System.out.println("You got a 10!");
		}

		// If no scope "{ }" is indicated, if will execute the statement on the next line
		if (x < 5)
			System.out.println("x is less than 5");
		else
			System.out.println("x is greater to or equal to 5");
		System.out.println("This is a second line, hence it is outside of the scope of the else");
		// However, for code readability, we would add "{ }" for 1 line statements as well
	}
}
