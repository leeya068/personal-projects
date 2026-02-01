package chocolatesales;

/* Write a Java program to read all lines from a chocolate sales CSV file. 
Add a loop that prints out the first 10 lines of the file.
*/

import java.util.*;
import java.io.*;
import java.nio.file.*;

public class ReadAllLines {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\leeya\\Desktop\\chocolatesales.csv"));
        for (int i = 0; i < lines.size() && i < 10; i++) {
            System.out.println(lines.get(i));
        }
    }
}