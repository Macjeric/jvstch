import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
class Mou extends JFrame{
	public Mou(){
		//JPanel tfP = new JPanel(new GridLayout(4,3,10,2));
		//tfP.setBorder(BorderFactory.createTitledBorder("Text Fields: "));
		//Setting Flow layout alignment vertical and horizontally
		//setLayout(new FlowLayout (FlowLayout.LEFT,10,20));
		setLayout(new GridLayout (GridLayout(4,3,10,2)));

		//Adding Labels and Textfields
		add(new JLabel("First Name"));
		add(new JTextField(8));
		add(new JLabel("Surname"));
		add(new JTextField(8));
		add(new JLabel("Telephone Number"));
		add(new JTextField(8));
		add(new JLabel("Age"));
		add(new JTextField(8));
	}
	public static void main(String [] args){
		Mou frame = new Mou();
		frame.setTitle("Old Trafford");
		frame.setSize(450,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
}