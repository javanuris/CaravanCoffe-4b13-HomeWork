package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import abstracts.CoffeAbstract;
import abstracts.Constants;
import store.BuyItem;

public class SortingGood {
	/**
	 * �����, ��������� ����� �� ������������ ��������
	 * @version 1.0
	 * @author Kalenov Nurislam
	 * */
	
	/** ��������� ������ �� ������������ 
     * @param ArrayList<BuyItem> - ������ �������
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
/** ��������� ������ �� ���� 
 * @param ArrayList<BuyItem> - ������ �������
 * @param int - ��������� ��������
 * @param int - �������� ��������
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
/** ��������� ������ �� ����
 * @param ArrayList<BuyItem> - ������ �������
 * @param int - ��������� ��������
 * @param int - �������� ��������
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
/** ��������� ������ �� ����� ����
 * @param ArrayList<BuyItem> - ������ �������
 * @param String - ������������ �����
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
/** ������������ � ArrayList<CoffeAbstract>
 * @param ArrayList<BuyItem> - ������ �������
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
