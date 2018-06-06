import javax.swing.*;
import java.awt.*;
class Utd{
JPanel panel;
public Utd(){
	panel = new JPanel();
	//setLayout(new FlowLayout (FlowLayout.LEFT,10,20));


		//frame.setLayout(new GridLayout());

		GridBagConstraints c = new GridBagConstraints();




		JLabel label1 = new JLabel("First Name");
		c.gridx = 0;
		c.gridy = 0;

		panel.add(label1,c);
		c.insets = new Insets(1,10,10,10);
		JLabel label2 = new JLabel("Surname");
		c.gridx = 0;
		c.gridy = 1;
		panel.add(label2,c);
		JLabel label3 = new JLabel("Telephone Number");
		c.gridx = 0;
		c.gridy = 2;
		panel.add(label3,c);
		JLabel label4 = new JLabel("Age");
		c.gridx = 0;
		c.gridy = 3;
		panel.add(label4,c);


		JTextField TextField1 = new JTextField(10);
		c.gridx = 1;
		c.gridy = 0;
		panel.add(TextField1,c);
		JTextField TextField2 = new JTextField(10);
		c.gridx = 1;
		c.gridy = 1;
		panel.add(TextField2,c);
		JTextField TextField3 = new JTextField(10);
		c.gridx = 1;
		c.gridy = 2;
		panel.add(TextField3,c);
		JTextField TextField4 = new JTextField(10);
		c.gridx = 1;
		c.gridy = 3;
		panel.add(TextField4,c);
	}

		public static void main(String [] args){
				JFrame frame = new JFrame("Manchester");
				frame.setSize(550,300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				JPanel panel = new JPanel(new GridBagLayout());
				frame.getContentPane().add(panel,BorderLayout.WEST);



}
}