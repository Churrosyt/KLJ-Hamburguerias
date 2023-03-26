package allOrders;

import listsFoods.Hamburguer;

public class CustomerOrdersCompleted {
	
	private Hamburguer hamburguer = new Hamburguer();
	

	
	
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(hamburguer.toString());
//		sb.append("\nMeat: " + meatList());
//		sb.append("\nVegetable: " + VegetableList()) ;
//		sb.append("\nSauce: " + SauceList());
//		sb.append("\nTotal: " + String.format("%.2f", totalHamburguer()));

		return sb.toString();
	}
	
	

}
