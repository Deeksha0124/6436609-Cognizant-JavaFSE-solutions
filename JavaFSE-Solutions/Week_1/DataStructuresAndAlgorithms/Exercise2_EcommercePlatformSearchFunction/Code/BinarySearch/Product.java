package Week_1.DataStructuresAndAlgorithms.Exercise2_EcommercePlatformSearchFunction.Code.BinarySearch;

import java.util.Scanner;

public class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "ProductID: " + productId + ", ProductName: " + productName + ", Category: " + category;
    }

    public static Product binarySearch(Product[] listOfProducts, int targetID){
        int low = 0;
        int high = listOfProducts.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (listOfProducts[mid].productId == targetID) {
                return listOfProducts[mid];
            } else if (targetID < listOfProducts[mid].productId) {
                high = mid - 1;
            } else if (targetID > listOfProducts[mid].productId) {
                low = mid + 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] listOfProducts = {
                new Product(1, "Tablet", "Electronics"),
                new Product(5, "Headphones", "Electronics"),
                new Product(10, "Desk Chair", "Furniture"),
                new Product(15, "Backpack", "Accessories"),
                new Product(20, "Water Bottle", "Lifestyle"),
                new Product(25, "Monitor", "Electronics"),
                new Product(30, "Sneakers", "Footwear"),
                new Product(35, "Keyboard", "Electronics"),
                new Product(40, "Notebook", "Stationery"),
                new Product(45, "Sunglasses", "Fashion")
        };
        for(int i = 0; i < 3; i++) {
            System.out.println("\nEnter a Product ID: ");
            int targetID = sc.nextInt();

            Product result = binarySearch(listOfProducts, targetID);

            //case 1: Product exists
            if (result != null) {
                System.out.println("Product found: \n" + result);
            }

            //case 2: Product does not exist
            else {
                System.out.println("Sorry, there is no product with the entered product ID.");
            }
        }
        sc.close();
    }
}

