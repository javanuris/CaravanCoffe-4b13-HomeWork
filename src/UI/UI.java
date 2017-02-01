package ui;

import java.util.ArrayList;

import abstracts.Constants;
import logic.Accounting;
import logic.SortingGood;
import store.BuyItem;
import store.Shop;

public class UI {
	/**
	 * Класс,отображает данные
	 * @version 1.0
	 * @author Kalenov Nurislam
	 * */
	private Shop shop = new Shop();
	private SortingGood good = new SortingGood();
	private Accounting accounting = new Accounting();
	private ArrayList<BuyItem> buyItems = shop.getCaravan().getListOfItem();
	public void transmiter(){
		
		shower(buyItems);
		System.out.println("Сортировка по ценам >50 && <72 тенге:");
		shower(good.sortByPrice(buyItems, 50, 72));
		
		System.out.println("Сортировка по весу >10 && <40 килограмм:");
		shower(good.sortByWeight(buyItems, 10, 40));
		
		System.out.println("Сортировка по сорту:");
		shower(good.sortBySort(buyItems, Constants.SORT_SECOND));
		
		System.out.println("Сортировка по названию:");
		shower(good.sortByName(buyItems));
	}
	
	public void shower(ArrayList<BuyItem> items){
		System.out.println("Сумма груза в фургоне: "+accounting.summaryPrice(items)+" тенге");
		System.out.println("Обьем груза в фургоне: "+accounting.summaryWeight(items)+" киллограм");
		System.out.println("----------------------------------------------------------------------");
		for(int i = 0; i < items.size(); i++){
		System.out.println(items.get(i).getCoffeAbstract().toString()+ 
				"  | " + items.get(i).getAmount()+" шт. | "
						+items.get(i).getCoffeAbstract().isCoffeSort() +" сорт. | "
						+items.get(i).getCoffeAbstract().isCoffeType()+ " вид. | "
						+items.get(i).getCoffeAbstract().determinePrice()+ " тенге. | "
						+items.get(i).getCoffeAbstract().determineWeight()+" кг. "
				);
}
		System.out.println("------------------------------------------------------------------");
	}
	
	
	
}
