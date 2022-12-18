package IngredientsHamburguer;

public  class Hamburguer{
	
	protected Integer selectOption = 1;
	protected Integer quantityIngredients;
	
	protected String hamburguerBread;
	
	public Hamburguer() {
		
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
		return hamburguerBread;
		
		
		
		
	}
	

	

}
