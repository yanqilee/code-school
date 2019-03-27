package controlflow.loop;

public class WhileLoop {

    public static void main(String[] args) {
        simpleWhileLoop();
        branchingStatement();
    }

    private static void simpleWhileLoop() {
        int i = 0;

        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    private static void branchingStatement() {
        int i = 0;

        System.out.println("Before for loop");

        while (i < 10) {
            if (i < 5) {
                System.out.println(i);
                i = i + 2;
                // continue keyword stops the current iteration of loop and moves on to the next iteration
                continue;
            } else if (i < 8) {
                System.out.println(i);
            } else {
                // break keyword exits the loop
                break;
            }

            i++;
        }

        System.out.println("After for loop");
    }
}
