package nuris.kz.epam.store;

import nuris.kz.epam.abstracts.CoffeAbstract;

public class BuyItem {
	/**
	 * Класс , хранит данные о выборе 
	 * @version 1.0
	 * @author Kalenov Nurislam
	 * */
	private CoffeAbstract coffeAbstract;
	private int amount;
	
	public int getAmount() {
		return amount;
	}
	public CoffeAbstract getCoffeAbstract() {
		return coffeAbstract;
	}
	public void setCoffeAbstract(CoffeAbstract coffeAbstract) {
		this.coffeAbstract = coffeAbstract;
		
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
