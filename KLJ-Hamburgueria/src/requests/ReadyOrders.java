package requests;

import java.util.Scanner;

import IngredientsHamburguer.Hamburguer;
import IngredientsHamburguer.HamburguerBread;

public class ReadyOrders {
	static Scanner input = new Scanner(System.in);
	static Hamburguer hamburguer = new Hamburguer();
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
		
		print.listBread();
		int selectOption = input.nextInt();
		Hamburguer a1 = new Hamburguer();
		HamburguerBread hamburguerBread = new HamburguerBread(selectOption);
		
		System.out.println(hamburguerBread.toString());
	}
	
	public static void listMeat() {
		
	}
	
	
}
