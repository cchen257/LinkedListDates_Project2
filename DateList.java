/***
 * 
 */

public abstract class DateList {
	
	private DateNode first;
	private DateNode last;
	protected int length;
	
	/**
	 * creates one DateNode object with nothing/null inside
	 */
	public DateList() {
		first = new DateNode(null);
		last = first;
		length = 0;
	}
	
	/**
	 * @param d The Date212 object that will be added to the end of a list node
	 */
	public void append(Date212 d) {
		DateNode aNewNode = new DateNode(d);
		last.next = aNewNode;
		last = aNewNode;	
		length++;
	}
	
	/**
	 * 
	 * @param d The Date212 object that will be inserted between two nodes.
	 * 			If it is less than the previous node, then it will be placed before the previous node.
	 *			If it is greater than the previous, then it will be placed after.
	 *			This method sorts the dates in order.
	 */
	public void insert(Date212 d) {
		DateNode newNode = new DateNode(d);
		
		DateNode previousNode = first;
		
		if (previousNode.next==null) {
			previousNode.next = newNode;
			length++;
			return;
		}
		
		while (previousNode.next!=null && newNode.data.compareTo(previousNode.next.data) > 0) {
			previousNode = previousNode.next;
		}
		newNode.next = previousNode.next;
		previousNode.next = newNode;
		
		length++;
	}
	
	/**
	 * 
	 * @return All of the dates in sorted order and String form, after they have used the insert() method.
	 * 			Each date will be converted to "Month Day, Year" format using the toString() method from Date212 class.
	 */
	public String SortedString() {
		DateNode theCurrentNode = first.next;
		String Stringform = "";
		while (theCurrentNode!=null) {
			Stringform += theCurrentNode.data + "\n";
			theCurrentNode = theCurrentNode.next;
		}
		return Stringform;
	}
	
	/**
	 * 
	 * @return All of the dates in unsorted order and String form, after they have used the append() method.
	 * 			This calls on the regularString() method in Date212 class, which has each date remain the way
	 * 			it originally looked in the .txt file, with no dates converted to words, and not in chronological order. 
	 */
	public String UnsortedString() {
		DateNode theCurrentNode = first.next;
		String Stringform = "";
		while (theCurrentNode!=null) {
			Stringform += theCurrentNode.data.regularString() + "\n";
			theCurrentNode = theCurrentNode.next;
		}
		return Stringform;	
	}
	
}//DateList
