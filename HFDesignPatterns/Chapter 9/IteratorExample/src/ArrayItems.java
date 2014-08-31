
public class ArrayItems {
	
	String[] arrItems = new String[5];
	
	public ArrayItems(){
		// Hard code some items
		arrItems[0] = "hello";
		arrItems[1] = "there";
		arrItems[2] = "how";
		arrItems[3] = "are";
		arrItems[4] = "you";
	}
	
	public Iterator createIterator(){
		return new ArrayItemsIterator(arrItems);
	}
}
