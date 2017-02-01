package ui;

import java.util.ArrayList;

import abstracts.Constants;
import logic.Accounting;
import logic.SortingGood;
import store.BuyItem;
import store.Shop;

public class UI {
	/**
	 * �����,���������� ������
	 * @version 1.0
	 * @author Kalenov Nurislam
	 * */
	private Shop shop = new Shop();
	private SortingGood good = new SortingGood();
	private Accounting accounting = new Accounting();
	private ArrayList<BuyItem> buyItems = shop.getCaravan().getListOfItem();
	public void transmiter(){
		
		shower(buyItems);
		System.out.println("���������� �� ����� >50 && <72 �����:");
		shower(good.sortByPrice(buyItems, 50, 72));
		
		System.out.println("���������� �� ���� >10 && <40 ���������:");
		shower(good.sortByWeight(buyItems, 10, 40));
		
		System.out.println("���������� �� �����:");
		shower(good.sortBySort(buyItems, Constants.SORT_SECOND));
		
		System.out.println("���������� �� ��������:");
		shower(good.sortByName(buyItems));
	}
	
	public void shower(ArrayList<BuyItem> items){
		System.out.println("����� ����� � �������: "+accounting.summaryPrice(items)+" �����");
		System.out.println("����� ����� � �������: "+accounting.summaryWeight(items)+" ���������");
		System.out.println("----------------------------------------------------------------------");
		for(int i = 0; i < items.size(); i++){
		System.out.println(items.get(i).getCoffeAbstract().toString()+ 
				"  | " + items.get(i).getAmount()+" ��. | "
						+items.get(i).getCoffeAbstract().isCoffeSort() +" ����. | "
						+items.get(i).getCoffeAbstract().isCoffeType()+ " ���. | "
						+items.get(i).getCoffeAbstract().determinePrice()+ " �����. | "
						+items.get(i).getCoffeAbstract().determineWeight()+" ��. "
				);
}
		System.out.println("------------------------------------------------------------------");
	}
	
	
	
}
