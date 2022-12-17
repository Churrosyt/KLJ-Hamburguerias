package requests;

public class PrintOrders {
	
	public void listOperations() {
		System.out.println("***** Selecione uma opção que deseja realizar *****");
		System.out.println("------------------------------------------------------");
		System.out.println("|   Opção 1 - MONTAR HAMBURGUER     |");
		System.out.println("|   Opção 2 - HAMBURGUER PRONTOS    |");
		System.out.println("|   Opção 3 - REFRIGERANTE          |");
		System.out.println("|   Opção 4 - MILKSHAKE             |");
		System.out.println("|   Opção 5 - LISTA DE PEDIDOS      |");
		System.out.println("|   Opção 6 - Finalizar Pedido      |");
	}

	public void listBread() {
		
		System.out.println(" ----- Ecolha os tipos de Paes -----");
		System.out.println("|   Opção 1 - Bun            $(0.50)  |");
		System.out.println("|   Opção 2 - Bread Roll     $(0.70)  |");
		System.out.println("|   Opção 3 - White Bread    $(0.60)  |");
		System.out.println("|   Opção 4 - Cheese breads  $( 1 )   |");
		System.out.println("|   Opção 5 - Twist Bread    $(0.90)  |");
		System.out.println("|   Opção 6 - Voltar          		  |");
	}

	public void listMeat() {
		System.out.println(" ----- Ecolha os tipos de Meat -----");
		System.out.println("|   Opção 1 - Steak          $(0.50)  |");
		System.out.println("|   Opção 2 - Ground Beef    $(0.70)  |");
		System.out.println("|   Opção 3 - Sirloin        $(0.60   |");
		System.out.println("|   Opção 4 - Rib Cuts       $( 1 )   |");
		System.out.println("|   Opção 5 - Chiken         $(0.90)  |");
		System.out.println("|   Opção 6 - Voltar          		  |");
	}

	public void listVetable() {
		System.out.println(" ----- Ecolha os tipos de Vegetal -----");
		System.out.println("|   Opção 1 - lettuce    $(0.50)  |");
		System.out.println("|   Opção 2 - corn       $(0.70)  |");
		System.out.println("|   Opção 3 - pea        $(0.60)  |");
		System.out.println("|   Opção 4 - pickles    $( 1 )   |");
		System.out.println("|   Opção 5 - tomato     $(0.90)  |");
		System.out.println("|   Opção 6 - Voltar         	  |");
	}

	public void listSauce() {
		System.out.println(" ----- Ecolha os tipos de Molho -----");
		System.out.println("|   Opção 1 - ketchup        |");
		System.out.println("|   Opção 2 - Mayo           |");
		System.out.println("|   Opção 3 - garlic sauce   |");
		System.out.println("|   Opção 4 - barbecue       |");
		System.out.println("|   Opção 5 - mustard        |");
		System.out.println("|   Opção 6 - Voltar    	 |");
	}

}
