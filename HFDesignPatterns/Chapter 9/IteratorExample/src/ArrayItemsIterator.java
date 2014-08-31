
public class ArrayItemsIterator implements Iterator{
	// This class will contain items in an array
	
	String[] items;
	int position = 0;
	
	public ArrayItemsIterator(String[] items){
		this.items = items;
	}
	
	public Object next(){
		String currStr = items[position++];
		return currStr;
	}
	
	public boolean hasNext(){
		if (position > (items.length - 1) || items[position] == null){
			return false;
		}
		return true;
	}
}
