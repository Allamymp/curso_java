package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

/*Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
• Realizar uma entrada no estoque e mostrar novamente os dados do produto
• Realizar uma saída no estoque e mostrar novamente os dados do produto
 */
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Products product = new Products();
			
		    System.out.println("Enter product data: ");
		    System.out.print("Name: ");
		    product.name = sc.nextLine();
		    System.out.print("Price: ");
		    product.price = sc.nextDouble();
		    System.out.print("Quantity in stock: ");
		    product.quantity = sc.nextInt();
			
		    System.out.println("Product data: "+ product);
		    
		    System.out.println("Enter the number of products to be added in stock:");
		    int quantity = sc.nextInt();
		    product.addProducts(quantity);
		    

		    System.out.println("Product updated data: "+ product);
		    
		    System.out.println("Enter the number of products to be removed from stock: ");
		    quantity = sc.nextInt();
		    
		    product.removeProducts(quantity);
		    
		    System.out.println("Product updated data: "+ product);
		    
		    
		    
			sc.close();

	}

}
