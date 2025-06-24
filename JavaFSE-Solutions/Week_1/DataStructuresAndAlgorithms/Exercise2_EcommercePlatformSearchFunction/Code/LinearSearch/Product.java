package Week_1.DataStructuresAndAlgorithms.Exercise2_EcommercePlatformSearchFunction.Code.LinearSearch;

import java.util.Scanner;

public class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString(){
        return "ProductID: " + productId + ", ProductName: " + productName + ", Category: " + category;
    }

    public static Product linearSearch(Product[] listOfProducts, int targetId){
        for(int i=0; i<listOfProducts.length; i++){
            if(listOfProducts[i].productId == targetId){
                return listOfProducts[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] listOfProducts =  {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shirt", "Clothing"),
                new Product(3, "Book", "Stationery"),
                new Product(4, "Phone", "Electronics"),
                new Product(5, "Shoes", "Footwear")
        };

        for(int i = 0; i < 3; i++) {
            System.out.println("\nEnter a Product ID: ");
            int targetID = sc.nextInt();

            Product result = linearSearch(listOfProducts, targetID);

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
