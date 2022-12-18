package requests;

import java.util.Locale;

import IngredientsHamburguer.BreadEnums;

public class PrintOrders {
	private static BreadEnums[] breads = BreadEnums.values();  
	
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

	public void listBread() {
		
		System.out.println(" ----- Ecolha os tipos de Paes -----");
		int i =0;
		for(  ; i < breads.length ; i++) {
		System.out.printf("|   Op��o %d - %s $(%.2f)  |\n",(i+1),breads[i].nameE(),breads[i].valueE());
		}
		System.out.printf("|   Op��o %d - Voltar   |\n" , (i+1));
	}

	public void listMeat() {
		System.out.println(" ----- Ecolha os tipos de Meat -----");
		System.out.println("|   Op��o 1 - Steak          $(0.50)  |");
		System.out.println("|   Op��o 2 - Ground Beef    $(0.70)  |");
		System.out.println("|   Op��o 3 - Sirloin        $(0.60   |");
		System.out.println("|   Op��o 4 - Rib Cuts       $( 1 )   |");
		System.out.println("|   Op��o 5 - Chiken         $(0.90)  |");
		System.out.println("|   Op��o 6 - Voltar          		  |");
	}

	public void listVetable() {
		System.out.println(" ----- Ecolha os tipos de Vegetal -----");
		System.out.println("|   Op��o 1 - lettuce    $(0.50)  |");
		System.out.println("|   Op��o 2 - corn       $(0.70)  |");
		System.out.println("|   Op��o 3 - pea        $(0.60)  |");
		System.out.println("|   Op��o 4 - pickles    $( 1 )   |");
		System.out.println("|   Op��o 5 - tomato     $(0.90)  |");
		System.out.println("|   Op��o 6 - Voltar         	  |");
	}

	public void listSauce() {
		System.out.println(" ----- Ecolha os tipos de Molho -----");
		System.out.println("|   Op��o 1 - ketchup        |");
		System.out.println("|   Op��o 2 - Mayo           |");
		System.out.println("|   Op��o 3 - garlic sauce   |");
		System.out.println("|   Op��o 4 - barbecue       |");
		System.out.println("|   Op��o 5 - mustard        |");
		System.out.println("|   Op��o 6 - Voltar    	 |");
	}

}
