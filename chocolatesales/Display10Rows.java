package chocolatesales;

/* Write a Java program to display 10 rows of chocolate sales data in a table format.
   Each row should show the chocolate type, quantity sold, and total sales amount.
   Use nested loops to generate the rows and columns.
*/

import java.util.*;
import java.io.*;

public class Display10Rows {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\leeya\\Desktop\\chocolatesales.csv";
        File chocolateSales = new File(path);
        Scanner scan = new Scanner(chocolateSales);
        String[] chocolate = new String[10];

        int count = 0;
        while(scan.hasNextLine() && count < 10){
            String line = scan.nextLine();
            System.out.println(line);
            count++;
        }

        scan.close();
    }
}
