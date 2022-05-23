/***
 * 
 * This DateGUI class creates two JTextAreas, one for the unsorted list and one for sorted.
 * The DateGUI constructor creates a GridLayout with 1 row and 2 columns.
 * It creates a menu bar that contains an option "File", and creates a FileMenuHandler with two options, Open and Quit.
 * This class calls upon the class FileMenuHandler, which deals with what happens when the user clicks on File, Open, or Quit.
 * The printtoColumns() method is responsible for printing the sorted and unsorted lists to each column in the GUI.
 * It uses the setText() method to add to each column.
 * setText() only accepts Strings, so each list will be converted to a String when passed in.
 */
import javax.swing.*;
import java.awt.TextArea;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class DateGUI extends JFrame {
	
	JTextArea StringUnsorted, StringSorted;
	
	public DateGUI() {
		setTitle("Project 2");
		setSize(500, 500);
		setLocation(600, 200);
		
		createFileMenu();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout( new GridLayout(1,2) );
		
		StringUnsorted = new JTextArea();
		StringSorted = new JTextArea();
		getContentPane().add(StringUnsorted);
		getContentPane().add(StringSorted);
		setVisible(true);
	}
	
	private void createFileMenu() {
		JMenuItem item;
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		FileMenuHandler fmh = new FileMenuHandler(this);

		item = new JMenuItem("Open");
		item.addActionListener(fmh);
		fileMenu.add(item);

		fileMenu.addSeparator();

		item = new JMenuItem("Quit");
		item.addActionListener(fmh);
		fileMenu.add(item);
		
		setJMenuBar(menuBar);
		menuBar.add(fileMenu);
	}
	
	public void printtoColumns(String leftColumn, String rightColumn) {
		this.StringUnsorted.setText(leftColumn);
		this.StringSorted.setText(rightColumn);
	}
	
}//class