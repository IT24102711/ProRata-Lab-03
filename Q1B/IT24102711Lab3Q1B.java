import java.util.Scanner;

public class IT24102711Lab3Q1B {
    public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		double pricePerKg = scanner.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		double quantity = scanner.nextDouble();
		
		double totalAmount = pricePerKg * quantity;
		double discountAmount = totalAmount - ( totalAmount * 0.10 );
		
		System.out.println("The total amount with 10% discount is: " + discountAmount);
	}
}