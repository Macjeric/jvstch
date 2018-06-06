import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
class Mourinho extends JFrame{
JPanel p1, p2,p3,p4;

	Mourinho(){
		//Setting Panel
		setLayout(new FlowLayout (FlowLayout.LEFT,10,20));
		//setLayout(new GridLayout(4,0));

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();


		//Adding Labels and Textfields
		p1.add(new JLabel("First Name"));
		p1.add(new JTextField(8));
		p2.add(new JLabel("Surname"));
		p2.add(new JTextField(8));
		p3.add(new JLabel("Telephone Number"));
		p3.add(new JTextField(8));
		p4.add(new JLabel("Age"));
		p4.add(new JTextField(8));

add(p2);
add(p1);
add(p2);
add(p3);
add(p4);
	}
	public static void main(String [] args){
		Mourinho frame = new Mourinho();
		frame.setTitle("Old Trafford");
		frame.setSize(450,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		}
}