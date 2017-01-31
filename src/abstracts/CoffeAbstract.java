package abstracts;

import java.util.Comparator;
/**
 * ����������� ����� , ������� ��� �������� �������� ����
 * @version 1.0
 * @author Kalenov Nurislam
 * */
public abstract class CoffeAbstract implements DimensionGoods , DetermineValueGood {
	/**�������� - ���������*/
	private String coffeType;
	/**�������� - ����*/
	private String coffeSort;
	/**�������� - ������������*/
	private String coffeName;
	/**�������� - ����*/
	private int price ;
	/**�������� - ���*/
	private int weight;
	
public CoffeAbstract(String coffetype, String coffeSort){
		this.coffeType = coffetype;
		this.coffeSort = coffeSort;
		determinePrice();
		determineWeight();
	}
	/**
	 * @return ��������� �������
	 * */
	public String isCoffeType(){
		return coffeType;
	}
	/**
	 * @return ���� �������
	 * */
	public String isCoffeSort(){
		return coffeSort;
	}
	/**
	 * @return ������������ �������
	 * */
	public String toString() {
		return  getClass().getSimpleName();
	//return coffeName;
	}
	/**
	 * ������������� ����
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
	 *  ������������� ���
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
	 * @return ���� �������
	 * */
	@Override
   public int getPriceGood() {
		return price;
   }
	/**
	 * @return ���� �������
	 * */
	@Override
	public int getWeihtGood() {
		return weight;
	}
	
}
