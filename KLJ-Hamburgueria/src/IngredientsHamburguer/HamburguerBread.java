package IngredientsHamburguer;

import requests.ReadyOrders;

public class HamburguerBread extends Hamburguer {

	private String nameBread;

	public HamburguerBread(Integer selectOption) {
		super(selectOption, selectOption);
		// TODO Auto-generated constructor stub
	}

	public void setNameBread(String nameBread) {
		this.nameBread = nameBread;
	}

	@SuppressWarnings("static-access")
	public String chooseOption() {

		String typeBread = "";

		switch (selectOption) {
		case 1:
			typeBread = BreadEnums.bread.toString();
			break;
		case 2:
			typeBread = BreadEnums.bread_roll.toString();
			break;
		case 3:
			typeBread = BreadEnums.White_Bread.toString();
			break;
		case 4:
			typeBread = BreadEnums.Cheese_breads.toString();
			break;
		case 5:
			typeBread = BreadEnums.Twist_Bread.toString();
			break;

		case 6:
			ReadyOrders readyOrders = new ReadyOrders();
			readyOrders.operations();
			break;

		}
		
		nameBread = typeBread;
		return nameBread;

	}

	@Override
	public String toString() {
		return chooseOption();
	}

}
