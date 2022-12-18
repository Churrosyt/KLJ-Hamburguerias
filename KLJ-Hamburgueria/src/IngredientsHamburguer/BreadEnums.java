package IngredientsHamburguer;

public enum BreadEnums {
	
	bread("Bun")
	,bread_roll("Bread Roll")
	,White_Bread("White Bread")
	,Cheese_breads("Cheese breads ")
	,Twist_Bread("Twist Bread");
	
	private String nameBread;
	
	private BreadEnums(String nameBread) {
		this.nameBread = nameBread;
	}
	
	
	@Override
	public String toString() {
		return nameBread;
	}

}
