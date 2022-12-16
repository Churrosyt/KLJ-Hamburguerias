package requests;

import java.util.ArrayList;
import java.util.Scanner;

import lanches.Hamburguer;

public class ReadyOrders {
	
	static Scanner input = new Scanner(System.in);
	static ArrayList<Hamburguer> hamburguer;
	
	public static void main(String[] args) {
		hamburguer = new ArrayList<Hamburguer>();
		operations();
		
	}
	
	public static void operations(){
		
			System.out.println("------------------------------------------------------");
	        System.out.println("------------Bem vindos a KLJ HAMBURGUERIA-------------");
	        System.out.println("------------------------------------------------------");
	        System.out.println("***** Selecione uma opera��o que deseja realizar *****");
	        System.out.println("------------------------------------------------------");
	        System.out.println("|   Op��o 1 - MONTAR HAMBURGUER     |");
	        System.out.println("|   Op��o 2 - HAMBURGUER PRONTOS    |");
	        System.out.println("|   Op��o 3 - REFRIGERANTE          |");
	        System.out.println("|   Op��o 4 - MILKSHAKE             |");
	        System.out.println("|   Op��o 5 - LISTA DE PEDIDOS      |");
	        System.out.println("|   Op��o 6 - Sair                  |");

	        
	       int operations = input.nextInt();
	       
	       switch (operations) {
	       	case 1:
	       		assembleHamburger();
	       		break;
	       	case 5:
	       		listarContas();
	       		break;
	       	default:
                System.out.println("Op��o inv�lida!");
                operations();
                break;
	       
	       }
	}
	
	public static void assembleHamburger() {
		
		 System.out.println(" ----- Ecolha os tipos de paos -----");
		 System.out.println("|   Op��o 1 - Bun            $(0.50)  |");
		 System.out.println("|   Op��o 2 - Bread Roll     $(0.70)  |");
	     System.out.println("|   Op��o 3 - White Bread    $(0.60)  |");
	     System.out.println("|   Op��o 4 - Cheese breads  $( 1 )   |");
	     System.out.println("|   Op��o 5 - French loaf    $(0.90)  |");
	     System.out.println("|   Op��o 6 - Voltar          		   |");
	     
	     int typesOfBread = input.nextInt();
	     
	     String bread = "";
	     
	     switch (typesOfBread) { //Recebe o tipo de pao como String e o valor como double
		case 1: 
			bread = "Bun";
			break;			
		case 2: 
			bread = "Bread Roll";
			break;
		case 3: 
			bread = "White Bread";
			break;
		case 4: 
			bread = "Cheese breads";
			break;
		case 5: 
			bread = "French loaf";
			break;
		case 6: 
			operations(); // para encerrar o sistema
		default:
			System.out.println("Op��o inv�lida!");
			operations();
            break;
		}
		
	     System.out.println(" ----- Ecolha os tipos de meat -----");
		 System.out.println("|   Op��o 1 - Steak          $(0.50)  |");
		 System.out.println("|   Op��o 2 - Ground Beef    $(0.70)  |");
	     System.out.println("|   Op��o 3 - Sirloin        $(0.60   |");
	     System.out.println("|   Op��o 4 - Rib Cuts       $( 1 )   |");
	     System.out.println("|   Op��o 5 - Chiken         $(0.90)  |");
	     System.out.println("|   Op��o 6 - Voltar          		   |");
	     
	     int typesOfMeat = input.nextInt();
	     
	     String meat = "";
	     
	     switch (typesOfMeat) {
		case 1: 
			meat = "Steak";
			break;			
		case 2: 
			meat = "Ground Beef";
			break;
		case 3: 
			meat = "Sirloin";
			break;
		case 4: 
			meat = "Rib Cuts";
			break;
		case 5: 
			meat = "Chiken";
			break;
		case 6: 
			operations(); // para encerrar o sistema
		default:
			System.out.println("Op��o inv�lida!");
			operations();
            break;
		}
	     
	     
	     Hamburguer hamburgue = new Hamburguer(bread, meat);
	     hamburguer.add(hamburgue);
	     operations();
	     
	}
	
	 public static void listarContas() {
	        if(hamburguer.size() > 0) {
	            for(Hamburguer hamburgue : hamburguer) {
	                System.out.println(hamburgue);
	            }
	        }else {
	            System.out.println("--- N�o h� contas cadastradas ---");
	        }

	        operations();
	    }

}
