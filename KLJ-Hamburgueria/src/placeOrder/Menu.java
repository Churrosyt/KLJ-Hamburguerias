package placeOrder;

import IngredientsHamburguer.BreadEnums;
import IngredientsHamburguer.MeatEnums;
import IngredientsHamburguer.SauceEnums;
import IngredientsHamburguer.VegetableEnums;

public class Menu {
	private static BreadEnums[] breads = BreadEnums.values();
	private static MeatEnums[] meats = MeatEnums.values();
	private static VegetableEnums[] vegetable = VegetableEnums.values();
	private static SauceEnums[] Sauce = SauceEnums.values();
	
	public void listOperations() {
		System.out.println("***** SELECT AN OPTION *****");
		System.out.println("------------------------------------------------------");
		System.out.println("|   OPTION 1 - HAMBURGUER ASSEMBLY    |");
		System.out.println("|   OPTION 2 - BURGER READY           |");
		System.out.println("|   OPTION 3 - SODA                   |");
		System.out.println("|   OPTION 4 - MILKSHAKE              |");
		System.out.println("|   OPTION 5 - MY REQUESTS            |");
		System.out.println("|   OPTION 6 - FINALIZE MY ORDER      |");
	}

	public void BreadList() {
		
		System.out.println(" ----- CHOOSE THE BREAD -----");
		int i =0;
		for(  ; i < breads.length ; i++) { //For que esta percorrendo a lista criada no enum, com o nome e o valor do ingrediente
		System.out.printf("|   OPTION %d - %s $(%.2f) \n",(i+1),breads[i].BreadName(),breads[i].breadValue());
		}
		System.out.printf("|   OPTION %d - BACK \n" , (i+1));
	}

	public void meatList() {
		System.out.println(" ----- CHOOSE THE MEAT -----");
		int i =0;
		for(  ; i < breads.length ; i++) { //For que esta percorrendo a lista criada no enum, com o nome e o valor do ingrediente
		System.out.printf("|   OPTION %d - %s $(%.2f) \n",(i+1),meats[i].getName(),meats[i].getValue());
		}
		System.out.printf("|   OPTION %d - BACK \n" , (i+1));
		
	}

	public void vegetableList() {
		System.out.println(" ----- CHOOSE THE VEGETABLE -----");
		int i =0;
		for(  ; i < vegetable.length ; i++) { //For que esta percorrendo a lista criada no enum, com o nome e o valor do ingrediente
		System.out.printf("|   OPTION %d - %s $(%.2f) \n",(i+1),vegetable[i].getVegetableName(),vegetable[i].getVegetableValue());
		}
		System.out.printf("|   OPTION %d - BACK \n" , (i+1));
	}

	public void sauceList() {
		System.out.println(" ----- CHOOSE THE SAUCE -----");
		int i =0;
		for(  ; i < Sauce.length ; i++) { //For que esta percorrendo a lista criada no enum, com o nome e o valor do ingrediente
		System.out.printf("|   OPTION %d - %s $(%.2f) \n",(i+1),Sauce[i].getSauceName(),Sauce[i].getSauceValue());
		}
		System.out.printf("|   OPTION %d - BACK \n" , (i+1));
	}
	}


