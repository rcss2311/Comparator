package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("NoteBook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		//Comparator<Product> comp = (p1,p2)-> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		//arrow function
		
		list.sort((p1,p2)-> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())); //mais enxuto
		
		for(Product p: list) {
			System.out.println(p);
		}

	}

}
