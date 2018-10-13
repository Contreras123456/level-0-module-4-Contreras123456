package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class OwnAdventure {

public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "A man named Phil Swift wants to make a new material for his company.");
String alia=JOptionPane.showInputDialog("What will be Phil Swift's new material?");	

if(alia.equals("flex glue")) {
	JOptionPane.showMessageDialog(null, "Good for sticking stuff.");
}
else if(alia.equals("flex tape")) {
	JOptionPane.showMessageDialog(null, "Covers damge and works underwater.");
}
else if(alia.equals("flex hose")) {
	JOptionPane.showMessageDialog(null, "Work for growing plants");
}
else {
	JOptionPane.showMessageDialog(null, "Not a thing.");
}
}
}




