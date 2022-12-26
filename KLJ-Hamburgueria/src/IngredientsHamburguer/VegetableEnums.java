package IngredientsHamburguer;

public enum VegetableEnums {
	
	lettuce("lettuce", 0.14)
	,corn("corn", 0.18)
	,pea("pea", 0.22)
	,pickles("pickles", 0.15)
	,tomato("tomato", 0.19);
	
	private String vegetableName;
	private Double vegetableValue;
	
	
	private VegetableEnums(String vegetableName, Double vegetableValue) {
		this.vegetableName = vegetableName;
		this.vegetableValue = vegetableValue;
	}

	public String getVegetableName() {
		return vegetableName;
	}

	public Double getVegetableValue() {
		return vegetableValue;
	}
	
	

}
