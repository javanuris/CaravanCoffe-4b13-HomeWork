package nuris.kz.epam.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import nuris.kz.epam.template.Constants;
import nuris.kz.epam.store.BuyItem;

public class SortingGood {
	/**
	 * Класс, сортирует товар по определенным правилам
	 * @version 1.0
	 * @author Kalenov Nurislam
	 * */
	
	/** Сортирует список по наименованию 
     * @param buyItems - список товаров
     */
public ArrayList<BuyItem> sortByName(ArrayList<BuyItem> buyItems){
		Collections.sort(buyItems , new Comparator<BuyItem>() {
			@Override
			public int compare(BuyItem arg0, BuyItem arg1) {
				return arg0.getCoffeAbstract().toString().compareTo(arg1.getCoffeAbstract().toString());
			}
		});
		return buyItems;
	}
/** Сортирует список по цене 
 * @param buyItems - список товаров
 * @param start - начальный диапозон
 * @param end - конечный диапозон
*/
public ArrayList<BuyItem> sortByPrice(ArrayList<BuyItem> buyItems , int start, int end ){
	ArrayList<BuyItem> itemLocal = new ArrayList<>();
	for(BuyItem buyItem : buyItems){
		if(buyItem.getCoffeAbstract().determinePrice()>= start && buyItem.getCoffeAbstract().determinePrice()<= end){
			itemLocal.add(buyItem);
		}
	}
	return itemLocal;
	}
/** Сортирует список по весу
 * @param buyItems - список товаров
 * @param start - начальный диапозон
 * @param end - конечный диапозон
*/
public ArrayList<BuyItem> sortByWeight(ArrayList<BuyItem> buyItems , int start, int end ){
	ArrayList<BuyItem> second = new ArrayList<>();
	for(BuyItem buyItem : buyItems){
		if(buyItem.getCoffeAbstract().determineWeight()>= start &&buyItem.getCoffeAbstract().determineWeight()<= end){
			second.add(buyItem);
		}
	}
	return second;
	}
/** Сортирует список по сорту кофе
 * @param buyItems - список товаров
 * @param sort - наименование сорта
 * 
*/
public ArrayList<BuyItem> sortBySort(ArrayList<BuyItem> buyItems , String sort){
	ArrayList<BuyItem> second = new ArrayList<>();
		for(BuyItem buyItem :buyItems){
			if(sort == Constants.SORT_FIRST){
				if(buyItem.getCoffeAbstract().getCoffeSort().equals(Constants.SORT_FIRST)){
					second.add(buyItem);
				}
			}
			else if(sort == Constants.SORT_SECOND){
				if(buyItem.getCoffeAbstract().getCoffeSort().equals(Constants.SORT_SECOND)){
					second.add(buyItem);
				}
			}
			else if(sort == Constants.SORT_THIRD){
				if(buyItem.getCoffeAbstract().getCoffeSort().equals(Constants.SORT_THIRD)){
					second.add(buyItem);
				}
			}
		}
		return second;
	}
}
