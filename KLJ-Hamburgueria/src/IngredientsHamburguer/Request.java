package IngredientsHamburguer;

public class Request {
	
	public static void main(String[] args) {
		BreadEnums[] set = BreadEnums.values();
		
		
		BreadEnums get = set[0];
		Hamburguer ham = new Hamburguer(get);
		System.out.println(ham.getBreadValue());
		double x = 0;
		for(BreadEnums enumm : set) {
			
			x += enumm.valueE();
		}
		System.out.print(x);
	}
}
