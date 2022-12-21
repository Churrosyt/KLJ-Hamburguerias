package placeOrder;

import java.util.Scanner;

import IngredientsHamburguer.BreadEnums;
import hamburguer.Hamburguer;

public class ReadyOrders {
	static Scanner input = new Scanner(System.in);

	static PrintOrders print = new PrintOrders();
	
	public static void main(String[] args) {	
		
		operations();
		
		
		
	/*	HamburguerIngredientBread a1 = new HamburguerIngredientBread(1);
		HamburguerIngredientBread a2 = new HamburguerIngredientBread(2);
		HamburguerIngredientBread a3 = new HamburguerIngredientBread(3);
		a1.selectValue();
		a2.selectValue();
		a3.selectValue();
		
		*/
	}
	
	public static void operations() {

		print.listOperations(); // lista de operaçoes
		int operations = input.nextInt();

		switch (operations) {
		case 1:
			assembleHamburguer();
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		default:
			System.out.println("Opção inválida!");
			operations();
			break;

		}
	}
	
	public static void assembleHamburguer() {
		
		print.BreadList();
		// TRATAR
		int selectOption = input.nextInt() - 1;
		BreadEnums bread = BreadEnums.values()[selectOption];
		Hamburguer hamburguer = new Hamburguer(bread);

		System.out.printf("%s", hamburguer.toString() );
		
	}
	
	public static void listMeat() {
		Hamburguer ham = new Hamburguer();
		System.out.println(ham.toString());
	}
	
	
}
