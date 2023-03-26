package placeOrder;

import java.util.ArrayList;
import java.util.Scanner;

import IngredientsHamburguer.BreadEnums;
import IngredientsHamburguer.MeatEnums;
import IngredientsHamburguer.SauceEnums;
import IngredientsHamburguer.VegetableEnums;
import hamburguer.Hamburguer;

public class ReadyOrders {
	static Scanner input = new Scanner(System.in);

	static Menu menu = new Menu();
	/*static List<MeatEnums> MeatList =  new ArrayList<>();
	static List<VegetableEnums> vegetableList =  new ArrayList<>();
	static List<SauceEnums> sauceList =  new ArrayList<>();*/
	
	public static void main(String[] args) {	 
		
		operations(); //Chamando o metodo da Classe Print
		
	}
	
	public static void operations() {

		menu.listOperations(); // lista de opera�oes
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
			System.out.println("Op��o inv�lida!");
			operations();
			break;

		}
	}
	
	public static void chooseBread() {
		
		menu.BreadList();
		// TRATAR
		int selectOptionBread = input.nextInt() - 1; // percorrer a lista enum do 0
		BreadEnums bread = BreadEnums.values()[selectOptionBread]; //chamando a posi��o da minha lista enum pelo selectOption
		
		System.out.print("| \nDo you want to choose how many meat? ");
		int quantityMeat =  input.nextInt();
		ArrayList<MeatEnums> meatList = new ArrayList<>();
		int selectMeat = 0;
		for (int i = 0 ; i < quantityMeat ; i++) {
			menu.meatList();
			selectMeat = input.nextInt() - 1;
			MeatEnums meat = MeatEnums.values()[selectMeat];
			meatList.add(meat);	
			
		}
		
		System.out.print("| \nDo you want to choose how many vegetable? ");
		int quantityVegetable =  input.nextInt();
		ArrayList<VegetableEnums> vegetableList = new ArrayList<>();
		int selectVegetable = 0;
		for (int i = 0 ; i < quantityVegetable ; i++) {
			menu.vegetableList();
			selectVegetable = input.nextInt() - 1;
			VegetableEnums vegetable = VegetableEnums.values()[selectVegetable];
			vegetableList.add(vegetable);	
			
		}
		
		System.out.print("| \nDo you want to choose how many sauce? ");
		int quantitySauce =  input.nextInt();
		ArrayList<SauceEnums> sauceList = new ArrayList<>();
		int selectSauce = 0;
		for (int i = 0 ; i < quantitySauce ; i++) {
			menu.sauceList();
			selectSauce = input.nextInt() - 1;
			SauceEnums sauce = SauceEnums.values()[selectSauce];
			sauceList.add(sauce);	
			
		}
		
		
		
		
		Hamburguer hamburguer = new Hamburguer(bread, meatList, vegetableList, sauceList); //instancio a classe Hamburguer e passo como argumento o valor selecionado da minha lista
		System.out.println(hamburguer.toString());
	}
	
	
	
	
	public static void listRequest() {
	//	Hamburguer ham = new Hamburguer();
		//System.out.println(ham.toString());
	}
}
