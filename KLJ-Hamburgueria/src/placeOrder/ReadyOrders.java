package placeOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import IngredientsHamburguer.BreadEnums;
import IngredientsHamburguer.MeatEnums;
import hamburguer.Hamburguer;

public class ReadyOrders {
	static Scanner input = new Scanner(System.in);

	static PrintOrders print = new PrintOrders();
	static List<MeatEnums> aaa =  new ArrayList<>();
	
	public static void main(String[] args) {	
		
		operations(); //Chamando o metodo da Classe Print
		
	}
	
	public static void operations() {

		print.listOperations(); // lista de operaçoes
		int operations = input.nextInt();

		switch (operations) {
		case 1:
			chooseBread();
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
	
	public static void chooseBread() {
		
		print.BreadList();
		// TRATAR
		int selectOptionBread = input.nextInt() - 1; // percorrer a lista enum do 0
		BreadEnums bread = BreadEnums.values()[selectOptionBread]; //chamando a posição da minha lista enum pelo selectOption
		
		System.out.print("| \nDeseja escolher quantos Meat? ");
		int quantityHamburguers =  input.nextInt();
		ArrayList<MeatEnums> meatList = new ArrayList<>();
		int selectOptionMeat = 0;
		for (int i = 0 ; i < quantityHamburguers ; i++) {
			print.meatList();
			selectOptionMeat = input.nextInt() - 1;
			MeatEnums meat = MeatEnums.values()[selectOptionMeat];
			meatList.add(meat);	
			
		}

		
		
		
		Hamburguer hamburguer = new Hamburguer(bread, meatList); //instancio a classe Hamburguer e passo como argumento o valor selecionado da minha lista
		System.out.println(hamburguer.toString());
	}
	
	
	
	public static void listRequest() {
		Hamburguer ham = new Hamburguer();
		System.out.println(ham.toString());
	}
	
	
}
