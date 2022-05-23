/***
 * 
 * This FileMenuHandler class uses the interface ActionListener.
 * This class controls what happens when the user clicks on Open or Quit.
 * When the user clicks "Quit", the program simply exits.
 * When the user clicks "Open", the openFile() method is called upon,
 * which then calls upon the readDatesFromFile() method from class Project2.
 * This will take each line of the .txt file and convert them to unsorted and sorted lists.
 * printtoColumns() method is then called from the DateGUI class, taking the unsorted and sorted lists as Strings,
 * and printing them to each column in the GUI.
 * 
 */

import java.io.File;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FileMenuHandler implements ActionListener {
	
	JFrame jframe;
   
	public FileMenuHandler (JFrame jf) {
      jframe = jf;
    }
   
   public void actionPerformed(ActionEvent event) {
	   	String menuName;
	   	menuName = event.getActionCommand();
		
	   	if (menuName.equals("Open")) openFile();
	   	
		else if (menuName.equals("Quit")) System.exit(0);
	}
   
   public void openFile() {
	   JFileChooser chooser = new JFileChooser();
	   chooser.showOpenDialog(null);
	   File theFile = chooser.getSelectedFile();
	   String chosenFileName = theFile.getAbsolutePath();
	   
	   Project2.readDatesFromFile(chosenFileName);
	   
	   ((DateGUI) this.jframe).printtoColumns(Project2.UnsortedColumn.toString() , Project2.SortedColumn.toString() );
   }
}