import java.util.Hashtable;
import java.util.Iterator;

public class HashTableItems {
	// Wooo, generics in Java just like in C# :)
	Hashtable<String, String> htItems = new Hashtable<String, String>();
	
	public HashTableItems(){
		htItems.put("key1", "value1");
		htItems.put("key2", "value2");
		htItems.put("key3", "value3");
		htItems.put("key4", "value4");
		htItems.put("key5", "value5");
		htItems.put("key6", "value6");
		htItems.put("key7", "value7");
		htItems.put("key8", "value8");
	}
	
	public Iterator<String> createIterator(){
		// Return an iterator for the VALUES of the Hashtable
		// using the built-in Java Iterator interface.
		return htItems.values().iterator();
	}
}
