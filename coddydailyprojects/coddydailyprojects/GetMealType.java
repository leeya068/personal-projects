package coddydailyprojects;

/* Meal Type Classifier Using Switch Expressions

In this challenge, you will apply your knowledge of switch expressions to determine a meal type based on the time of day.

Create a method named getMealType that takes two arguments:

An integer (hour) representing the time of day in 24-hour format (0-23).
A boolean (abbreviated) that determines if the return value should be abbreviated.
The method should use a switch expression to return:

For hours 5-10: return "BREAKFAST" if not abbreviated, or "BKT" if abbreviated.
For hours 11-15: return "LUNCH" if not abbreviated, or "LCH" if abbreviated.
For hours 16-21: return "DINNER" if not abbreviated, or "DNR" if abbreviated.
For any other hour: return "SNACK" if not abbreviated, or "SNK" if abbreviated.


*/

import java.util.Scanner;

public class GetMealType {
    public static String getMealType(int hour, boolean abbreviated) {
        return switch(hour) {
            case 5, 6, 7, 8, 9, 10 -> abbreviated ? "BKT" : "BREAKFAST";
            case 11, 12, 13, 14, 15 -> abbreviated ? "LCH" : "LUNCH";
            case 16, 17, 18, 19, 20, 21 -> abbreviated ? "DNR" : "DINNER";
            default -> abbreviated ? "SNK" : "SNACK";
        };
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        boolean abbreviated = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println(getMealType(hour, abbreviated));
    }
}
