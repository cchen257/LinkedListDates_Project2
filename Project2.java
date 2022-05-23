import java.util.StringTokenizer;
/***
 * 
 * This Project2 class instantiates two lists that are of type UnsortedDateList
 * and type SortedDateList (which both extend from the DateList class).
 * 
 * It contains a method, readDatesFromFile, that will use the TextFileInput class to read in
 * each line of the file (thedates.txt) the user chooses.
 * It will take each line of the file as a String, convert it to a Date212 object,
 * and then add that object to both the unsorted and sorted lists.
 * The add method here will use DateList's append or insert methods, depending on whether or not the list
 * is of type UnsortedDateList or SortedDateList.
 * 
 * The main method will create a new GUI, calling on the DateGUI class.
 *   
 */

public class Project2 {
	
	public static UnsortedDateList UnsortedColumn = new UnsortedDateList();
	public static SortedDateList SortedColumn = new SortedDateList();
	
	public static void main(String[] args) {
		DateGUI myGUI = new DateGUI();
	}
	
	public static void readDatesFromFile(String filename) {
		
		TextFileInput myFile = new TextFileInput(filename);
		String line = myFile.readLine();
     
		while (line!=null){
			
			StringTokenizer myTokens = new StringTokenizer(line, ",");
			
			while ( myTokens.hasMoreTokens() ) {			
				String aDate = myTokens.nextToken();	
				Date212 aDateObj = new Date212(aDate);
				
				UnsortedColumn.add(aDateObj);
				SortedColumn.add(aDateObj);
			}
			
			line = myFile.readLine();
		}
		
	}

}//class
