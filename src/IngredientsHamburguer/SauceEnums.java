package IngredientsHamburguer;

public enum SauceEnums {
	
	ketchup("ketchup", 0.00)
	,Mayo("Mayo", 0.00)
	,garlic_sauce("Garlic Sauce", 0.00)
	,barbecue("barbecue", 0.00)
	,mustard("mustard", 0.00);
	
	private String SauceName;
	private Double SauceValue;
	
	private SauceEnums(String sauceName, Double sauceValue) {
		SauceName = sauceName;
		SauceValue = sauceValue;
	}

	public String getSauceName() {
		return SauceName;
	}

	public Double getSauceValue() {
		return SauceValue;
	}


	
	
	
	
	
}
