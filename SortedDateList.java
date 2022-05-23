/***
 * 
 *	SortedDateList class sorts Date212 objects into order using insert() method, and returns the list node as String
 *	form using toString() from Date212 class.
 */

public class SortedDateList extends DateList {
	
	public void add(Date212 d) {
		insert(d);
	}
	
	public String toString() {
		return SortedString();
	}
	
	public int getLength() {
		return length;
	}
}
