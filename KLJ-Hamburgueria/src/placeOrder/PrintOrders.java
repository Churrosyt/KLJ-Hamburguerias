package placeOrder;

import IngredientsHamburguer.BreadEnums;
import IngredientsHamburguer.MeatEnums;

public class PrintOrders {
	private static BreadEnums[] breads = BreadEnums.values();
	private static MeatEnums[] meats = MeatEnums.values();
	
	public void listOperations() {
		System.out.println("***** Selecione uma op��o que deseja realizar *****");
		System.out.println("------------------------------------------------------");
		System.out.println("|   Op��o 1 - MONTAR HAMBURGUER      |");
		System.out.println("|   Op��o 2 - HAMBURGUER PRONTOS     |");
		System.out.println("|   Op��o 3 - REFRIGERANTE           |");
		System.out.println("|   Op��o 4 - MILKSHAKE              |");
		System.out.println("|   Op��o 5 - LISTA DE PEDIDOS       |");
		System.out.println("|   Op��o 6 - Finalizar Pedido       |");
	}

	public void BreadList() {
		
		System.out.println(" ----- Ecolha os tipos de Paes -----");
		int i =0;
		for(  ; i < breads.length ; i++) { //For que esta percorrendo a lista criada no enum, com o nome e o valor do ingrediente
		System.out.printf("|   Op��o %d - %s $(%.2f) \n",(i+1),breads[i].BreadName(),breads[i].breadValue());
		}
		System.out.printf("|   Op��o %d - Voltar \n" , (i+1));
	}

	public void meatList() {
		System.out.println(" ----- Ecolha os tipos de Meat -----");
		int i =0;
		for(  ; i < breads.length ; i++) { //For que esta percorrendo a lista criada no enum, com o nome e o valor do ingrediente
		System.out.printf("|   Op��o %d - %s $(%.2f) \n",(i+1),meats[i].getName(),meats[i].getValue());
		}
		System.out.printf("|   Op��o %d - Voltar \n" , (i+1));
		
	}

	public void vegetableList() {
		System.out.println(" ----- Ecolha os tipos de Vegetal -----");
		System.out.println("|   Op��o 1 - lettuce    $(0.50)  |");
		System.out.println("|   Op��o 2 - corn       $(0.70)  |");
		System.out.println("|   Op��o 3 - pea        $(0.60)  |");
		System.out.println("|   Op��o 4 - pickles    $( 1 )   |");
		System.out.println("|   Op��o 5 - tomato     $(0.90)  |");
		System.out.println("|   Op��o 6 - Voltar         	  |");
	}

	public void sauceList() {
		System.out.println(" ----- Ecolha os tipos de Molho -----");
		System.out.println("|   Op��o 1 - ketchup        |");
		System.out.println("|   Op��o 2 - Mayo           |");
		System.out.println("|   Op��o 3 - garlic sauce   |");
		System.out.println("|   Op��o 4 - barbecue       |");
		System.out.println("|   Op��o 5 - mustard        |");
		System.out.println("|   Op��o 6 - Voltar    	 |");
	}

}
