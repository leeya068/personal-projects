package chocolatesales;

/*
Design a class ChocolateSale with at least three attributes from the chocolate sales CSV file, 
such as salesPerson, product, and amount, and optionally other fields like country or date. 

Write a constructor and getter methods for these attributes, then read the CSV file, skip the header, 
split each line, and store each row as a ChocolateSale object in an ArrayList. 
Finally, write a method findProduct(String productName) that loops through the 
ArrayList and prints the details (salesperson, country, amount, date) of all sales matching the given product.

*/

import java.util.*;
import java.io.*;

public class ChocolateArrayList {

    private ArrayList<ChocolateSale> salesList = new ArrayList<>();

    public void readFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\leeya\\Desktop\\chocolatesales.csv"))) {
            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null) {
                line = line.replace("\"", "");
                String[] data = line.split(",");

                if (data.length < 3) continue;

                String salesPerson = data[0];
                String country = data[1];
                String product = data[2];

                ChocolateSale sale = new ChocolateSale(salesPerson, country, product);
                salesList.add(sale);
            }
        }
    }

    public void findProduct(String productName) {
        boolean found = false;

        for (ChocolateSale sale : salesList) {
            if (sale.getProduct().equalsIgnoreCase(productName)) {
                System.out.println("Sales Person: " + sale.getSalesPerson() +
                                   ", Country: " + sale.getCountry() +
                                   ", Product: " + sale.getProduct());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No sales found for product: " + productName);
        }
    }

    public static void main(String[] args) throws IOException {
        ChocolateArrayList chocolate = new ChocolateArrayList();
        chocolate.readFile();
        chocolate.findProduct("Drinking Coco");
    }
}
