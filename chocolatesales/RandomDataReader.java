package chocolatesales;

//Write a Java program to read random data from a chocolate sales CSV file. 

import java.util.* ;
import java.io.* ;
import java.nio.file.* ;

public class RandomDataReader {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\leeya\\Desktop\\chocolatesales.csv"));
        Random rand = new Random();
        int randomIndex = rand.nextInt(lines.size() - 1) + 1; // to avoid header line

        String line = lines.get(randomIndex);
        line = line.replace("\"", "");
        String[] data = line.split(",");

        String amountStr = data[4];
        if (data.length > 6) { // if split created extra element
            amountStr += data[5];
        }

        double amount = Double.parseDouble(amountStr.replace(",", "").replace("$", ""));

        System.out.println("Random Chocolate Sale Record");
        System.out.println("Sales Person: " + data[0]);
        System.out.println("Country: " + data[1]);
        System.out.println("Product: " + data[2]);
        System.out.println("Date: " + data[3]);
        System.out.println("Amount Sold: $" + String.format("%.2f", amount));
    }
}
