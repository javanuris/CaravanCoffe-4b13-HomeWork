package abstracts;

public interface Constants {
	/**
	 * @version 1.0
	 * @author Kalenov Nurislam
	 * */
	
	public static final String SORT_FIRST = "Первый";
	public static final String SORT_SECOND = "Второй";
	public static final String SORT_THIRD  = "Третий";
	public static final String[] ARRAY_SORT = {SORT_FIRST ,SORT_SECOND ,SORT_THIRD};
		
	public static final String CORN  = "corn";
	public static final String GROUND  = "ground";
	public static final String INSTANT  = "instant";
	public static final String[] ARRAY_KIND_OF_COFFE = {CORN ,GROUND ,INSTANT};
	
	static int SIZE_OF_SORT_COFFE = ARRAY_SORT.length;
    static int SIZE_OF_TYPE_COFFE = ARRAY_KIND_OF_COFFE.length;
}
