package controlflow.loop;

public class WhileLoop {

    public static void main(String[] args) {
        branchingStatementExample();
    }

    private static void branchingStatementExample() {
        int i = 0;

        System.out.println("Before for loop");

        while (i < 10) {
            if (i < 5) {
                System.out.println(i);
                i = i + 2;
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
