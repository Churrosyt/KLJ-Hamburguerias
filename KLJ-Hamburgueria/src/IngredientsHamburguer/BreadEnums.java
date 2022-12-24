package IngredientsHamburguer;

public enum BreadEnums {
	
	bread("Bun",1.50)
	,bread_roll("Bread Roll",1.90)
	,White_Bread("White Bread",2.30)
	,Cheese_breads("Cheese breads ",4.10)
	,Twist_Bread("Twist Bread",2.10);
	
	private String breadName;
	private Double breadValue;
	
	private BreadEnums(String breadName, Double breadValue) {
		this.breadName = breadName;
		this.breadValue = breadValue;
	}
	
	public String BreadName() {
		return breadName;
	}
	public Double breadValue() {
		return breadValue;
	}
	
/*	@Override
	public String toString() {
		return nameBread;
	}
*/
}
