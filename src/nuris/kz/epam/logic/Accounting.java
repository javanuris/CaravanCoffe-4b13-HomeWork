package nuris.kz.epam.logic;

import java.util.ArrayList;

import nuris.kz.epam.store.BuyItem;


public class Accounting {
	/**
	 * Класс , считает общую стоимать товара
	 * @version 1.0
	 * @author Kalenov Nurislam
	 * */
	
	 /** итоговая цена груза
     * @param items - список товаров
     * @see Accounting
    */
public int summaryPrice(ArrayList<BuyItem> items){
	int summary = 0;

	for(BuyItem buyItem :items){
			summary += buyItem.getCoffeAbstract().determinePrice()*buyItem.getAmount();
		
	}
   return summary;

}
/** Итоговый вес товара 
 * @param items - список товаров
 * @see Accounting
*/
public int summaryWeight(ArrayList<BuyItem> items){
	int summary = 0;
	for(BuyItem buyItem :items){
			summary += buyItem.getCoffeAbstract().determineWeight()*buyItem.getAmount();
		
	}
   return summary;
}
}

