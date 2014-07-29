/** This class will implement the {@code BagInterface} using
	an array. The array will be of a fixed size and once full, 
	the bag will no longer be able to accept more items.

	@author Brian McEntee */

public class ArrayBag<T> implements BagInterface {
	
	//DEFINED CONSTANTS
	private final static int DEFAULT_SIZE = 10;
	
	//DATA MEMBERS
	private T[] bag; // used to hold the entries
	private int numOfEntries;

	public ArrayBag() {
		@SuppressWarnings("unchecked")
		T[] temp = (T[])new Object[DEFAULT_SIZE];
		bag = temp;
		numOfEntries = 0;
	}

	public ArrayBag(int max_capac) {
		@SuppressWarnings("unchecked")
		T[] temp = (T[])new Object[max_capac];
		bag = temp;
		numOfEntries = 0;
	}

	

}