

public class Tester {
	
	// Here all of the tests with the iterators are performed
	public static void main(String[] args){
		ArrayItems ai= new ArrayItems();
		Iterator aiIter = ai.createIterator();
		
		while(aiIter.hasNext()){
			System.out.println((String)aiIter.next());
		}
		
		HashTableItems ht = new HashTableItems();
		// Here the built-in Java iterator is used
		java.util.Iterator<String> htIter = ht.createIterator(); 
		
		while(htIter.hasNext()){
			System.out.println((String)htIter.next());
		}
		
	}

	
	
}
