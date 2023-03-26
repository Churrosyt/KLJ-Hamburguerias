package listsFoods;

import java.util.ArrayList;
import java.util.List;

import IngredientsHamburguer.BreadEnums;
import IngredientsHamburguer.MeatEnums;
import IngredientsHamburguer.SauceEnums;
import IngredientsHamburguer.VegetableEnums;
import allOrders.CustomerOrdersCompleted;

public class Hamburguer {

	private BreadEnums breadEnums;
	private List<MeatEnums> meatEnums = new ArrayList<>();
	private List<VegetableEnums> vegetableEnums = new ArrayList<>();
	private List<SauceEnums> sauceEnums = new ArrayList<>();


	

	public Hamburguer(BreadEnums breadEnums, ArrayList<MeatEnums> meatEnums, ArrayList<VegetableEnums> vegetableEnums,
			ArrayList<SauceEnums> sauceEnums) {
		this.breadEnums = breadEnums;
		this.meatEnums = meatEnums;
		this.vegetableEnums = vegetableEnums;
		this.sauceEnums = sauceEnums;
	}

	public Hamburguer() {
		
	}



	private String meatList() {
		String ret = "";
		for (MeatEnums meat : meatEnums) {
			ret += meat.getMeatName();
			if (meat.ordinal() < this.meatEnums.size() - 1) {
				ret += ", ";
			}
		}
		return ret;
	}
	
	private String VegetableList() {
		String ret = "";
		for (VegetableEnums vegetable : vegetableEnums) {
			ret += vegetable.getVegetableName();
			if (vegetable.ordinal() < this.vegetableEnums.size() - 1) {
				ret += ", ";
			}
		}
		return ret;
	}
	
	private String SauceList() {
		String ret = "";
		for (SauceEnums sauce : sauceEnums) {
			ret += sauce.getSauceName();
			if (sauce.ordinal() < this.sauceEnums.size() - 1) {
				ret += ", ";
			}
		}
		return ret;
	}
	

	private Double totalHamburguer() {
		double total = breadEnums.getBreadValue();

		for (MeatEnums value : meatEnums) {
			total += value.getMeatValue();
		}

		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nBread: " + breadEnums.getBreadName());
		sb.append("\nMeat: " + meatList());
		sb.append("\nVegetable: " + VegetableList()) ;
		sb.append("\nSauce: " + SauceList());
		sb.append("\nTotal: " + String.format("%.2f", totalHamburguer()));

		return sb.toString();
	}

}
