package abstracts;

import java.util.Comparator;
/**
 * Абстрактный класс , служить для описание продукта Кофе
 * @version 1.0
 * @author Kalenov Nurislam
 * */
public abstract class CoffeAbstract implements DimensionGoods , DetermineValueGood {
	/**Свойство - состояние*/
	private String coffeType;
	/**Свойство - сорт*/
	private String coffeSort;
	/**Свойство - наименование*/
	private String coffeName;
	/**Свойство - цена*/
	private int price ;
	/**Свойство - вес*/
	private int weight;
	
public CoffeAbstract(String coffetype, String coffeSort){
		this.coffeType = coffetype;
		this.coffeSort = coffeSort;
		determinePrice();
		determineWeight();
	}
	/**
	 * @return Состояние обьекта
	 * */
	public String isCoffeType(){
		return coffeType;
	}
	/**
	 * @return Сорт обьекта
	 * */
	public String isCoffeSort(){
		return coffeSort;
	}
	/**
	 * @return Наименование обьекта
	 * */
	public String toString() {
		return  getClass().getSimpleName();
	//return coffeName;
	}
	/**
	 * Определяеться цена
	 * @return 
	 * */
	@Override
	public int determinePrice() {
		for(int i = 0; i < Constants.SIZE_OF_SORT_COFFE; i++){
				if(coffeType.equals(Constants.ARRAY_KIND_OF_COFFE[i])){
					price=20*i+33;
				}
			}
    return price;
	}
	/**
	 *  Определяеться вес
	 * @return 
	 * */
	@Override
	public int determineWeight() {
		for(int i = 0; i <Constants.SIZE_OF_TYPE_COFFE; i++){
			if( coffeSort.equals(Constants.ARRAY_SORT[i])){
				weight=20*i+10;
			}
		}
	return weight;
	}
	/**
	 * @return Цена обьекта
	 * */
	@Override
   public int getPriceGood() {
		return price;
   }
	/**
	 * @return Цена обьекта
	 * */
	@Override
	public int getWeihtGood() {
		return weight;
	}
	
}
