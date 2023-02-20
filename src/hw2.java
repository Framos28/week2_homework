import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is regular price of the item? (Enter 59.0)\n");
        double regularPrice = scan.nextDouble();

        System.out.println("What is discount on the item? (Enter .20)\n");
        double discount = scan.nextDouble();

        double discountedPrice=regularPrice*discount;
        double salesPrice=regularPrice-discountedPrice;

        System.out.println("\nRegular Price: $"+regularPrice);
        System.out.println("\nDiscount: $"+discountedPrice);
        System.out.println("\nSales Price: $"+salesPrice);

    }
}
