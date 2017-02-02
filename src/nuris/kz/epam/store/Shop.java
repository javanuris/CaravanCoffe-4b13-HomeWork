package nuris.kz.epam.store;


import nuris.kz.epam.abstracts.Constants;
import nuris.kz.epam.goods.ArabicaCoffee;
import nuris.kz.epam.goods.CanephoraCoffe;
import nuris.kz.epam.goods.DewevreiCoffe;
import nuris.kz.epam.goods.LibericaCoffe;


public class Shop {
private	Caravan caravan = new Caravan();
public Shop(){
		
	choice();
}
	
public void choice(){
	ArabicaCoffee arabicaCoffre = new ArabicaCoffee(Constants.GROUND, Constants.SORT_THIRD);
	CanephoraCoffe canephoraCoffe = new CanephoraCoffe(Constants.INSTANT, Constants.SORT_SECOND);
	DewevreiCoffe dewevreiCoffe = new DewevreiCoffe(Constants.CORN, Constants.SORT_FIRST);
	LibericaCoffe libericaCoffe = new LibericaCoffe(Constants.GROUND, Constants.SORT_SECOND);
	
	ArabicaCoffee arabicaCoffre1 = new ArabicaCoffee(Constants.INSTANT, Constants.SORT_SECOND);
	CanephoraCoffe canephoraCoffe1= new CanephoraCoffe(Constants.CORN, Constants.SORT_FIRST);
	DewevreiCoffe dewevreiCoffe1 = new DewevreiCoffe(Constants.INSTANT, Constants.SORT_SECOND);
	LibericaCoffe libericaCoffe1 = new LibericaCoffe(Constants.CORN, Constants.SORT_THIRD);
	
	caravan.addListOfItem(arabicaCoffre, 5);
	caravan.addListOfItem(canephoraCoffe,6);
	caravan.addListOfItem(dewevreiCoffe, 12);
	caravan.addListOfItem(arabicaCoffre, 5);
	caravan.addListOfItem(canephoraCoffe, 7);
	caravan.addListOfItem(dewevreiCoffe1, 15);
	caravan.addListOfItem(arabicaCoffre1, 8);
	caravan.addListOfItem(canephoraCoffe1, 7);
	caravan.addListOfItem(dewevreiCoffe1, 6);
	caravan.addListOfItem(arabicaCoffre1, 4);
	caravan.addListOfItem(canephoraCoffe1, 8);
	caravan.addListOfItem(dewevreiCoffe, 45);
	caravan.addListOfItem(arabicaCoffre, 5);
	caravan.addListOfItem(canephoraCoffe, 85);
	caravan.addListOfItem(dewevreiCoffe, 12);
	caravan.addListOfItem(arabicaCoffre, 278);
	caravan.addListOfItem(canephoraCoffe, 88);
	caravan.addListOfItem(dewevreiCoffe, 12);
	caravan.addListOfItem(libericaCoffe, 15);
	caravan.addListOfItem(libericaCoffe, 152);
}
			
   public Caravan getCaravan(){
			return caravan;
   }	




}
