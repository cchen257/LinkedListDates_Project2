/***
 * 
 * 
 */

public class DateNode {

	protected Date212 data;
	protected DateNode next;
	
	/**
	 * A DateNode is created.
	 * 
	 * @param d The Date212 object passed in will be the data stored in the node,
	 * 			and the node will be pointing to another DateNode, that is initially null. 
	 */
	public DateNode(Date212 d) {
		data = d;
		next = null;
	}
	
}
