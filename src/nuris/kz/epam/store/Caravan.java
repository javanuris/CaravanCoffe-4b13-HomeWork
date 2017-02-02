package nuris.kz.epam.store;

import java.util.ArrayList;

import nuris.kz.epam.template.CoffeAbstract;

public class Caravan {
	/**
	 * Класс, забивает стек данных в массив
	 * @version 1.0
	 * @author Kalenov Nurislam
	 * */
private ArrayList<BuyItem> items;
	public Caravan(){
	   items = new ArrayList<BuyItem>();
	}

	public void addListOfItem(CoffeAbstract coffeAbstract , int amount){
	 BuyItem buyItem = new BuyItem();
		buyItem.setCoffeAbstract(coffeAbstract);
		buyItem.setAmount(amount);
		items.add(buyItem);
	}
	public ArrayList<BuyItem> getListOfItem(){
		return items;
	}
	

}
