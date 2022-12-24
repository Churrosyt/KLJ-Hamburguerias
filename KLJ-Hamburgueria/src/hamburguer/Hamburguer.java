package hamburguer;

import java.util.ArrayList;

import IngredientsHamburguer.BreadEnums;
import IngredientsHamburguer.MeatEnums;

public class Hamburguer {

	private BreadEnums breadEnums;
    private ArrayList<MeatEnums> meatEnums = new ArrayList<>();

	/*public Hamburguer(BreadEnums breadEnums, MeatEnums meatEnums) {
		this.breadEnums = breadEnums;
		this.meatEnums .add(meatEnums);
	}*/
    
    public Hamburguer() {
    	
    }
	public Hamburguer(BreadEnums breadEnums, ArrayList<MeatEnums> meatEnums) {
		this.breadEnums = breadEnums;
		this.meatEnums = meatEnums;
	}

	public String getBreadName() {
		return this.breadEnums.BreadName();
	}

	public Double getBreadValue() {
		return this.breadEnums.breadValue();
	}
	
	private String meatList() {
		String ret = "";
		for (MeatEnums meat : meatEnums) {
			ret += meat.getName();
			if(meat.ordinal() < this.meatEnums.size() - 1) {
				ret +=  ", "; 
			}
			
		}
		return ret;
	}
	
	private Double Total() {
		double total = getBreadValue();
		
		for(MeatEnums value : meatEnums) {
			total += value.getValue();
		}

		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nBread: " + getBreadName());
		sb.append("\nMeat: ");
		sb.append(meatList());
		sb.append("\nTotal: " + String.format("%.2f", Total()));
		
		
		return sb.toString();
	}

}
