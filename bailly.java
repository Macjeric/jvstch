import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class bailly extends JFrame{

	JLabel lb;
	JButton b1,b2,b3,b4,b5,b6;
	JPanel p1, p2;
	public bailly(){
		setTitle("Celebrities");
		setSize(450,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout (FlowLayout.CENTER));
		setLayout(new GridLayout (2,1));

		p1 = new JPanel();
		p2 = new JPanel();
		lb = new JLabel();
		b1 = new JButton("Lionel Messi");
		b1.addActionListener(vb);
		b2 = new JButton("Zlatan Ibrahimovic");
		b2.addActionListener(vb);
		b3 = new JButton("Sir Alex Ferguson");
		b3.addActionListener(vb);
		b4 = new JButton("Sir John Maynard Keyenes");
		b4.addActionListener(vb);
		b5 = new JButton("Ernesto 'Che' Guevara");
		b5.addActionListener(vb);
		b6 = new JButton("Pierre-Simon Laplace");
		b6.addActionListener(vb);


		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p2.add(lb);
		add(p1);
		add(p2);
}

	ActionListener vb = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == b1){
				lb.setText("Argentianian player to have more than 3 ballon d' Or, More than any player in football history ");
			}else if (e.getSource() == b2){
				lb.setText("A Swedish Player who scored goals on every minutes, from 0 to 90 than any player	");
			}
			else if (e.getSource() == b3){
				lb.setText("The Scotish Coach - who formerly managed Manchester United and have won many cups(35) than any other coach in football history");
			}
			else if (e.getSource() == b4){
				lb.setText("English Economist whose ideas fundametally changed the theory and practice of Macroeconomics and the economic policies of the goverment");
			}
			else if (e.getSource() == b5){
				lb.setText("An Argentine Marxist Revolutionary,Author,Physician,Diplomat and Military theorist who was the major figure for Cuba Revolution");
			}
			else if (e.getSource() == b6){
				lb.setText("French Scholar who worked on development of Mathematics,Statistics,Physics and Astronomy");
			}
}
	};



	public static void main(String [] args){
			bailly f = new bailly();
		}
	}

