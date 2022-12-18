package IngredientsHamburguer;

public enum BreadEnums {
	
	bread("Bun",1.0)
	,bread_roll("Bread Roll",2.0)
	,White_Bread("White Bread",3.0)
	,Cheese_breads("Cheese breads ",4.10)
	,Twist_Bread("Twist Bread",5.20);
	
	private String nameBread;
	private Double value;
	
	private BreadEnums(String nameBread, Double value) {
		this.nameBread = nameBread;
		this.value = value;
	}
	
	public String nameE() {
		return nameBread;
	}
	public Double valueE() {
		return value;
	}
	
/*	@Override
	public String toString() {
		return nameBread;
	}
*/
}
