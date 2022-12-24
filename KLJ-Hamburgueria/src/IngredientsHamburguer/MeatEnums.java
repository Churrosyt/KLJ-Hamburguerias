package IngredientsHamburguer;

public enum MeatEnums {
	
	Steak("Steak", 4.60)
	,Groung_Beef("Ground Beef", 3.10)
	,Sirloin("Sirloin", 2.90)
	,Rib_Cuts("Rib Cuts", 3.40)
	,Chiken("Chiken", 2.00);
	
	private String meatName;
	private Double meatValue;
	
	private MeatEnums(String meatName, Double meatValue) {
		this.meatName = meatName;
		this.meatValue = meatValue;
	}
	
	public String getName() {
		return meatName;
	}
	
	public Double getValue() {
		return meatValue;
	}
	
	

}
