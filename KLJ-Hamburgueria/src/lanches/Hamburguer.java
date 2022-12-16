package lanches;

public class Hamburguer {
	
	private String bread;
	private String meat;
	private String vegetable;
	private String sauce;
	
	public Hamburguer(String bread, String meat) {
	
		this.bread = bread;
		this.meat = meat;
		this.vegetable = vegetable;
		this.sauce = sauce;
		
	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public String getVegetable() {
		return vegetable;
	}

	public void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	@Override
	public String toString() {
		return "\nBread: " + bread 
				+ "\nMeat: " + meat 
				+ "\nVegetable: " + vegetable 
				+ "\nSauce:  " + sauce;
	}
	
	
	
	
	
	

}
