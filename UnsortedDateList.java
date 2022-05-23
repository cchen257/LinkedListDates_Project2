/***
 * 
 * UnsortedDateList class simply adds the next node to the end of the list using append().
 * It converts dates to String form using regularString() from Date212 class.
 */

public class UnsortedDateList extends DateList {
	
	public void add(Date212 d) {
		append(d);
	}
	
	public String toString() {
		return UnsortedString();
	}
	
	public int getLength() {
		return length;
	}
	
}
