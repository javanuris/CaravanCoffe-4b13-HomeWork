package nuris.kz.epam.template;

public interface Constants {
	/**
	 * @version 1.0
	 * @author Kalenov Nurislam
	 * */
	
	 String SORT_FIRST = "Первый";
	 String SORT_SECOND = "Второй";
	 String SORT_THIRD  = "Третий";
	 String[] ARRAY_SORT = {SORT_FIRST ,SORT_SECOND ,SORT_THIRD};
		
	String CORN  = "corn";
	String GROUND  = "ground";
	String INSTANT  = "instant";
	String[] ARRAY_KIND_OF_COFFE = {CORN ,GROUND ,INSTANT};
	
	 int SIZE_OF_SORT_COFFE = ARRAY_SORT.length;
     int SIZE_OF_TYPE_COFFE = ARRAY_KIND_OF_COFFE.length;
}
