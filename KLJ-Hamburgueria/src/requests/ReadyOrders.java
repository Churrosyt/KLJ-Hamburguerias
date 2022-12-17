package requests;

import java.util.ArrayList;
import java.util.Scanner;

import lanches.Hamburguer;

public class ReadyOrders {
	static PrintOrders print = new PrintOrders();
	static Scanner input = new Scanner(System.in);
	static ArrayList<Hamburguer> hamburguer;

	public static void main(String[] args) {
		hamburguer = new ArrayList<Hamburguer>();
		operations();

	}

	public static void operations() {

		print.listOperations(); // lista de operaçoes

		int operations = input.nextInt();

		switch (operations) {
		case 1:
			assembleHamburger();
			break;
		case 5:
			listarContas();
			break;
		case 6:
			finishOrders();
			break;
		default:
			System.out.println("Opção inválida!");
			operations();
			break;

		}
	}

	public static void assembleHamburger() {
		
		int n = 0;
		for(int i=0 ; i<n ; i++) {
			
		}
		
		
		print.listBread(); // Esta passando a lista de tipos de paes

		int typesOfBread = input.nextInt();

		String bread = "";

		switch (typesOfBread) { // Recebe o tipo de pao como String e o valor como double
		case 1:
			bread = "Bun"; // pao
			break;
		case 2:
			bread = "Bread Roll"; // Pão Francês
			break;
		case 3:
			bread = "White Bread"; // Pão de forma
			break;
		case 4:
			bread = "Cheese bread"; // pao de queijo
			break;
		case 5:
			bread = "Twist Bread"; // Pão Torcido
			break;
		case 6:
			operations(); // Voltar para tela inicial
		default:
			System.out.println("Opção inválida!");
			operations();
			break;
		}

		print.listMeat(); // Esta passando a lista de tipos de carne

		int typesOfMeat = input.nextInt(); // Recebe o tipo de carne como String e o valor como double

		String meat = "";

		switch (typesOfMeat) {
		case 1:
			meat = "Steak"; // Bife
			break;
		case 2:
			meat = "Ground Beef"; // Carne moída
			break;
		case 3:
			meat = "Sirloin"; // //Contrafilé
			break;
		case 4:
			meat = "Rib Cuts";// Costela
			break;
		case 5:
			meat = "Chiken";// Frango
			break;
		case 6:
			operations();// Voltar para tela inicial
		default:
			System.out.println("Opção inválida!");
			operations();
			break;
		}

		print.listVetable(); // Esta passando a lista de tipos de vegetais

		int typesOfVegetable = input.nextInt(); // Recebe o tipo de vegetais como String e o valor como double

		String vegetable = "";

		switch (typesOfVegetable) {
		case 1:
			vegetable = "lettuce"; // Alface
			break;
		case 2:
			vegetable = "corn"; // Milho
			break;
		case 3:
			vegetable = "pea"; // //Ervilha
			break;
		case 4:
			vegetable = "pickles";// Picles
			break;
		case 5:
			vegetable = "tomato";// tomate
			break;
		case 6:
			operations();// Voltar para tela inicial
		default:
			System.out.println("Opção inválida!");
			operations();
			break;
		}
		
		print.listSauce();
		
		int typesOfSauce = input.nextInt(); // Recebe o tipo de molhos como String 

		String sauce = "";

		switch (typesOfSauce) {
		case 1:
			sauce = "ketchup"; // ketchup
			break;
		case 2:
			sauce = "Mayo"; // maionese
			break;
		case 3:
			sauce = "garlic sauce"; //Molho de alho
			break;
		case 4:
			sauce = "barbecue";// barbecue
			break;
		case 5:
			sauce = "mustard";// tomate
			break;
		case 6:
			operations();// Voltar para tela inicial
		default:
			System.out.println("Opção inválida!");
			operations();
			break;
		}

		Hamburguer hamburgue = new Hamburguer(bread, meat, vegetable, sauce);
		hamburguer.add(hamburgue);
		operations();

	}
	
	public static void finishOrders() {
		
	}

	public static void listarContas() {
		if (hamburguer.size() > 0) {
			for (Hamburguer hamburgue : hamburguer) {
				System.out.println(hamburgue);
			}
		} else {
			System.out.println("--- Não há contas cadastradas ---");
		}

		operations();
	}

}
