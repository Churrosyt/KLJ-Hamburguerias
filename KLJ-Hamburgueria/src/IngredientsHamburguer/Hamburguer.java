package IngredientsHamburguer;

public class Hamburguer {

	protected Integer selectOption;
	protected Integer quantityIngredients;

	
	private BreadEnums breadEnums;

	public Hamburguer() {

	}
	
	public Double getBreadValue() {
		return this.breadEnums.valueE();
	}
	
	public String getBreadName() {
		return this.breadEnums.name();
	}

	public Hamburguer(BreadEnums breadEnums) {
		this.breadEnums = breadEnums;
	}

	public Hamburguer(Integer selectOption, Integer quantityIngredients) {
		super();
		this.selectOption = selectOption;
		this.quantityIngredients = quantityIngredients;
	}

	public Integer getSelectOption() {
		return selectOption;
	}

	public void setSelectOption(Integer selectOption) {
		this.selectOption = selectOption;
	}

	public Integer getQuantityIngredients() {
		return quantityIngredients;
	}

	public void setQuantityIngredients(Integer quantityIngredients) {
		this.quantityIngredients = quantityIngredients;
	}

	@Override
	public String toString() {
		return "\nBread: " + "\nMeat: ";

	}

}
