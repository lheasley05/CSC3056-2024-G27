package utils;

public class TestUtils {
	
	public static final String TEXT_COLOR_GREEN = "\u001B[32m"; // from https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
    public static final String TEXT_COLOR_RED = "\u001B[31m"; 
    public static final String TEXT_COLOR_RESET = "\u001B[0m"; 
	
 // Method to print text in green color
    public static void TEXT_COLOR_GREEN(String text) {
    	System.out.println(TEXT_COLOR_GREEN + text +
				TEXT_COLOR_RESET);
    }

    // Method to print text in red color
    public static void TEXT_COLOR_RED(String text) {
    	System.out.println(TEXT_COLOR_RED + text +
				TEXT_COLOR_RESET);
    }
}
