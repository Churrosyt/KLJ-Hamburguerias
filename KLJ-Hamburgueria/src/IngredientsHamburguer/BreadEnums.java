package IngredientsHamburguer;

public enum BreadEnums {
	
	bread("Bun",1.50)
	,bread_roll("Bread Roll",1.90)
	,White_Bread("White Bread",2.30)
	,Cheese_breads("Cheese breads ",4.10)
	,Twist_Bread("Twist Bread",2.10);
	
	private String nameBread;
	private Double valueBread;
	
	private BreadEnums(String nameBread, Double valueBread) {
		this.nameBread = nameBread;
		this.valueBread = valueBread;
	}
	
	public String nameBread() {
		return nameBread;
	}
	public Double valueBread() {
		return valueBread;
	}
	
/*	@Override
	public String toString() {
		return nameBread;
	}
*/
}
