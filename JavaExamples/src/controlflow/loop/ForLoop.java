package controlflow.loop;

public class ForLoop {

    public static void main(String[] args) {
        simpleForLoop();
        arrayForLoop();
    }

    private static void simpleForLoop() {
        System.out.println("Begin simple for loop example");

        // for loop has the syntax of
        // (initial condition, loop condition, loop end command)
        // Initial condition is usually a declaration or an assignment
        // The loop will continue to run while the loop condition is true
        // Loop end command runs at the end of each loop iteration, usually increment/decrement loop variable
        for (int i = 0; i < 10; i++) {
            // Your code block to be executed in the loop
            System.out.println(i);

            // End of loop, i++ runs here
        }

        System.out.println("End simple for loop example");
    }

    private static void arrayForLoop() {
        System.out.println("Begin array for loop example");

        int[] numbers = {1, 2, 3, 4, 5 };

        for (int number: numbers) {
            System.out.println(number);
        }

        System.out.println("Begin array for loop example");
    }
}
