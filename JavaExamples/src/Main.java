public class Main {

    // Watch the braces/curly brackets { }, they indicate a scope
    // e.g. all the code for the main method must reside within { }
    public static void main(String[] args) {

        // This is a single line comment

        /*
        This is a multi line comment
         */


        // Print out to the console
        System.out.println("Hello World!");

        /* Multi line comments
        Variable declaration and primitives
        */
        //
        // int declares an integer
        // Declaration
        int n;
        long l;
        boolean b;

        // Assignment
        n = 5;

        // You can combine declaration and assignment in one statement
        double d = 1.5;

        // **************************************************************************************
        // Begin conditionals
        // **************************************************************************************
        System.out.println("---------------------- Begin conditionals ----------------------");

        int x = 20;

        /*
        If the condition is true, the code inside the scope indicated by the
        if statement will be executed
        */
        if (x < 5) {

        } else if (false) {

            // Note you can have as many else if's as you want
        } else if (false) {

        } else {

        }

        // If no scope "{ }" is indicated, if will execute the statement on the next line
        if (x < 10)
            System.out.println("x is less than 10");
        else
            System.out.println("x is greater to or equal to 10");
        System.out.println("This is a second line, hence it is outside of the scope of the else");
        // However, for code readability, we would add "{ }" for 1 line statements as well

        System.out.println("---------------------- End conditionals ----------------------");
        // **************************************************************************************
        // End conditionals
        // **************************************************************************************
    }
}
