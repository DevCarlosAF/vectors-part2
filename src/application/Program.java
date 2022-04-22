package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the quantity of products: ");
		int n = input.nextInt();
		Product[] vector = new Product[n];
		
		for (int i=0; i<vector.length; i++) {
			input.nextLine();
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Price: ");
			Double price = input.nextDouble();
			vector[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vector.length; i++) {
			System.out.println("Product " + (1+i) + ": " + vector[i]);
			sum += vector[i].getPrice();
		}
		
		double avg = sum / vector.length;
		System.out.println("Total: $" + String.format("%.2f", sum));
		System.out.println("Average price: $" + String.format("%.2f", avg));
		
		input.close();
	}

}
