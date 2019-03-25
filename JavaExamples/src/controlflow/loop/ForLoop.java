package controlflow.loop;

public class ForLoop {

    public static void main(String[] args) {
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
    }
}
