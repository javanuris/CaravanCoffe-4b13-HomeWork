package nuris.kz.epam.template;

/**
 * Абстракный класс , определяет товар - кофе
 * @version 1.0
 * @author Kalenov Nurislam
 * */
public abstract class CoffeAbstract implements DimensionGoods , DetermineValueGood {
	
	private String coffeType;
	private String coffeSort;
	private int price ;
	private int weight;
	
public CoffeAbstract(String coffetype, String coffeSort){
		this.coffeType = coffetype;
		this.coffeSort = coffeSort;
		determinePrice();
		determineWeight();
	}
	/**
	 * @return  состянеие товара
	 * */
	public String getCoffeType(){
		return coffeType;
	}
	/**
	 * @return сорт товара
	 * */
	public String getCoffeSort(){
		return coffeSort;
	}
	/**
	 * @return  наименование товара
	 * */
	public String toString() {
		return  getClass().getSimpleName();
	//return coffeName;
	}
	/**
	 *  определяет ценц
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
	 *  определяет вес
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
	 * @return цена товра
	 * */
	@Override
   public int getPriceGood() {
		return price;
   }
	/**
	 * @return  вес товара
	 * */
	@Override
	public int getWeihtGood() {
		return weight;
	}
	
}
