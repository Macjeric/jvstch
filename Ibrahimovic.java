import javax.swing.*;
import java.awt.*;



class Ibrahimovic extends JFrame{
	//instance variable
	JButton b1,b2;
	JPanel p1,p2,p3;
	JLabel label;
	LayoutManager lm;

	Ibrahimovic(){
		//setTitle("FirstFrame");
		super("FirstFrame");
		setSize(500,300);
		setVisible(true);
		b1=new JButton("Hamisi");
		//b1.setText("Hamisi");
		b2=new JButton("Simple");
		//b2.setText("Simple");
		label=new JLabel("First Name");
		//lm=new LayoutManager();
		p1=new JPanel(new BorderLayout());
		p2=new JPanel();
		p3=new JPanel();
		p2.add(b1);
		p2.add(b2);
		p3.add(label);
		p1.add(p2,BorderLayout.WEST);
		p1.add(p3,BorderLayout.SOUTH);
		add(p1);




		}


	public static void main(String args[]){
		// an object of FirstFrame
        FirstFrame ff=new FirstFrame();


		}



	}