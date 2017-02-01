package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import abstracts.CoffeAbstract;
import abstracts.Constants;
import store.BuyItem;

public class SortingGood {
	/**
	 * Класс, сортирует товар по определенным правилам
	 * @version 1.0
	 * @author Kalenov Nurislam
	 * */
	
	/** Сортирует список по наименованию 
     * @param ArrayList<BuyItem> - список товаров
     */
public ArrayList<BuyItem> sortByName(ArrayList<BuyItem> buyItems){
		Collections.sort(buyItems , new Comparator<BuyItem>() {

			@Override
			public int compare(BuyItem arg0, BuyItem arg1) {
				// TODO Auto-generated method stub
				return arg0.getCoffeAbstract().toString().compareTo(arg1.getCoffeAbstract().toString());
			}
		});
		return buyItems;
	}
/** Сортирует список по цене 
 * @param ArrayList<BuyItem> - список товаров
 * @param int - начальный диапозон
 * @param int - конечный диапозон
*/
public ArrayList<BuyItem> sortByPrice(ArrayList<BuyItem> buyItems , int start, int end ){
	ArrayList<BuyItem> itemsSort = buyItems;
	ArrayList<BuyItem> itemLocal = new ArrayList<>();
	for(int i = 0; i < itemsSort.size(); i++){
		if(itemsSort.get(i).getCoffeAbstract().determinePrice()>= start && itemsSort.get(i).getCoffeAbstract().determinePrice()<= end){
			itemLocal.add(itemsSort.get(i));
		}
	}
	return itemLocal;
	}
/** Сортирует список по весу
 * @param ArrayList<BuyItem> - список товаров
 * @param int - начальный диапозон
 * @param int - конечный диапозон
*/
public ArrayList<BuyItem> sortByWeight(ArrayList<BuyItem> buyItems , int start, int end ){
	ArrayList<BuyItem> bItemssort = buyItems;
	ArrayList<BuyItem> second = new ArrayList<>();
	for(int i = 0; i < bItemssort.size(); i++){
		if(bItemssort.get(i).getCoffeAbstract().determineWeight()>= start && bItemssort.get(i).getCoffeAbstract().determineWeight()<= end){
			second.add(bItemssort.get(i));
		}
	}
	return second;
	}
/** Сортирует список по сорту кофе
 * @param ArrayList<BuyItem> - список товаров
 * @param String - наименование сорта
 * 
*/
public ArrayList<BuyItem> sortBySort(ArrayList<BuyItem> buyItems , String sort){
		ArrayList<BuyItem> bItemssort = buyItems;
		ArrayList<BuyItem> second = new ArrayList<>();
		for(int i = 0; i < bItemssort.size(); i++){
			if(sort == Constants.SORT_FIRST){
				if(bItemssort.get(i).getCoffeAbstract().isCoffeSort().equals(Constants.SORT_FIRST)){
					second.add(bItemssort.get(i));
				}
			}
			else if(sort == Constants.SORT_SECOND){
				if(bItemssort.get(i).getCoffeAbstract().isCoffeSort().equals(Constants.SORT_SECOND)){
					second.add(bItemssort.get(i));
				}
			}
			else if(sort == Constants.SORT_THIRD){
				if(bItemssort.get(i).getCoffeAbstract().isCoffeSort().equals(Constants.SORT_THIRD)){
					second.add(bItemssort.get(i));
				}
			}
		}
		return second;
	}
/** Конфертирует в ArrayList<CoffeAbstract>
 * @param ArrayList<BuyItem> - список товаров
 * 
*/
public ArrayList<CoffeAbstract> convertorToCoffeType(ArrayList<BuyItem> buyItems){
	ArrayList<BuyItem> bItemssort = buyItems;
	ArrayList<CoffeAbstract> second = new ArrayList<>();
	for(int i = 0; i < bItemssort.size(); i++){
		second.add(bItemssort.get(i).getCoffeAbstract());
	}
	
	return second;
	
}



}
