package ui;

import java.util.ArrayList;

import abstracts.Constants;
import logic.Accounting;
import logic.SortingGood;
import store.BuyItem;
import store.Shop;

public class UI {
	/**
	 * Класс , отображает данные
	 * @version 1.0
	 * @author Kalenov Nurislam
	 * */
	private Shop shop = new Shop();
	private SortingGood good = new SortingGood();
	private Accounting accounting = new Accounting();
	private ArrayList<BuyItem> buyItems = shop.getCaravan().getListOfItem();
	public void transmiter(){
		
		shower(buyItems);
		System.out.println("Сортировка по цене >50 && <72 тенге :");
		shower(good.sortByPrice(buyItems, 50, 72));
		
		System.out.println("Сортировка по весу >10 && <40  килограм :");
		shower(good.sortByWeight(buyItems, 10, 40));
		
		System.out.println("Сортирока по сорту :");
		shower(good.sortBySort(buyItems, Constants.SORT_SECOND));
		
		System.out.println("Сортировка по наименованию :");
		shower(good.sortByName(buyItems));
	}
	
	public void shower(ArrayList<BuyItem> items){
		System.out.println("Общая сумма груза : "+accounting.summaryPrice(items)+" тенге");
		System.out.println("Общий вес груза : "+accounting.summaryWeight(items)+" килограмм");
		System.out.println("----------------------------------------------------------------------");
		for(int i = 0; i < items.size(); i++){
		System.out.println(items.get(i).getCoffeAbstract().toString()+ 
				"  | " + items.get(i).getAmount()+" шт. | "
						+items.get(i).getCoffeAbstract().isCoffeSort() +" сорт. | "
						+items.get(i).getCoffeAbstract().isCoffeType()+ " вид. | "
						+items.get(i).getCoffeAbstract().determinePrice()+ " тг. | "
						+items.get(i).getCoffeAbstract().determineWeight()+" кг. "
				);
}
		System.out.println("------------------------------------------------------------------");
	}
	
	
	
}
