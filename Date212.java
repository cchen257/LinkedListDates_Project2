/***
 * 
 * This Date212 class declares private variables year, month, and day for each individual Date212 object created.
 * It has get and set methods for the year, month, and day.
 * The Date212 constructor takes each date in the .txt file as a String, and determines which parts of this date are
 * the year, month, and day. It converts each of these to integer type.
 * The compareTo() method determines whether one date is older, newer, or equal to another date.
 * The equals() method returns true if the year, month, and day of a date are exactly equal to those of another date.
 * The toString() method converts a date's month to its month on the calendar, in word format.
 * It converts an entire date to the format, "Month Day, Year". This toString method is used for the sorted list,
 * while the unsorted list will use the regularString() method because it will print the dates in the .txt file as
 * it originally is in the GUI.
 * 
 */

public class Date212 {
	
	private int year, month, day;
	
	public int getYear() { return year; }
	
	public int getMonth() { return month; }
	
	public int getDay() { return day; }
	
	public void setYear(int y){ year = y; }
	
	public void setMonth(int m) { month = m; }
	
	public void setDay(int d) { day = d; }
	
	public Date212(String ADate) {
		year = Integer.parseInt( ADate.substring(0,4) );
		month = Integer.parseInt( ADate.substring(4,6) );
		day = Integer.parseInt( ADate.substring(6,8) );
	}
	
	public int compareTo(Date212 other) {
		if (this.year < other.year) return -10;
		else if (this.year > other.year) return 10;
		else if ( this.year == other.year ) {
				if (this.month < other.month) return -10;
				else if (this.month > other.month) return 10;
				else if (this.month == other.month){
					if (this.day < other.day) return -10;
					else if (this.day > other.day) return 10;
					else if (this.day == other.day) return 0;
			}//else if
		}//if
		return 50;
	}
	
	public boolean equals(Date212 other) {
		return (this.year == other.year) && (this.month == other.month) && (this.day == other.day);
	}
	
	public String toString() {
		String[] months = {"", "January", "February", "March", "April", "May", "June",
							"July", "August", "September", "October", "November", "December"};
		return months[month] + " " + day + ", " + year;
	}
	
	public String regularString() {
		return "" + year + month + day;
	}
	
}
