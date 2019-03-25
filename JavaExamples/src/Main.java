import controlflow.loop.ForLoop;
import controlflow.loop.WhileLoop;

public class Main {

    // Watch the braces/curly brackets { }, they indicate a scope
    // e.g. all the code for the main method must reside within { }

    /*
    All your code will run through the main method
    Any methods not called within the main method will not be executed
     */
    public static void main(String[] args) {
        // This is a single line comment

        /*
        This is a multi line comment
         */

        // Print out to the console
        System.out.println("Hello World!");

        // Declaration

        // Reading using input

        // **************************************************************************************
        // Begin conditionals
        // **************************************************************************************
        startSection("Conditionals");

        endSection("Conditionals");
        // **************************************************************************************
        // End conditionals
        // **************************************************************************************

        // **************************************************************************************
        // Begin loops
        // **************************************************************************************
        startSection("Loops");
        ForLoop.main(null);
        WhileLoop.main(null);
        endSection("Loops");
        // **************************************************************************************
        // End loops
        // **************************************************************************************
    }

    private static void startSection(String sectionName) {
        System.out.println(String.format("---------------------- Begin %s ----------------------", sectionName));
    }

    private static void endSection(String sectionName) {
        System.out.println(String.format("---------------------- End %s ----------------------", sectionName));
    }
}
