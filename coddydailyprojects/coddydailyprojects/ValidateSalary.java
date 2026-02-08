package coddydailyprojects;

/* Salary Validation Using Java Exceptions

In this challenge, you will apply your knowledge of throwing exceptions to validate a salary based on certain rules.

Create a method named validateSalary that takes two arguments:
1. An integer (salary) representing a person's salary
2. A boolean (strict) that determines additional validation rules

The method should throw exceptions based on these rules:
1. If salary is negative, throw an IllegalArgumentException with the message:
Salary cannot be negative
2. If salary is above 1,000,000, throw an IllegalArgumentException with the message:
Salary cannot be greater than 1000000
3. If strict is true and salary is 0, throw an IllegalArgumentException with the message:
Salary cannot be zero in strict mode
4. If no exception is thrown, return the salary as a string.

*/

import java.util.Scanner;

public class ValidateSalary {
    public static String validateSalary(int salary, boolean strict) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        if (salary > 1000000) {
            throw new IllegalArgumentException("Salary cannot be greater than 1000000");
        }
        if (strict && salary == 0) {
            throw new IllegalArgumentException("Salary cannot be zero in strict mode");
        }
        return String.valueOf(salary);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary = Integer.parseInt(scanner.nextLine());
        boolean strict = Boolean.parseBoolean(scanner.nextLine());
        
        try {
            System.out.println(validateSalary(salary, strict));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
