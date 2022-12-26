package IngredientsHamburguer;

public enum SauceEnums {
	
	ketchup("ketchup", 0.0)
	,Mayo("Mayo", 0.0)
	,garlic_sauce("Garlic Sauce", 0.0)
	,barbecue("barbecue", 0.0)
	,mustard("mustard", 0.0);
	
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
