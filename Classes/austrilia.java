package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class austrilia  extends JFrame{
	
	private JFrame f1;
	private Container c1;
	private ImageIcon i1,i2;
	private JLabel l1;
	private JButton b1,b2,b3;
	private Image Im1,Im2,Im3,Im4;
	private ImageIcon ii1;
	
	
	austrilia(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,120,1000,600);
		setTitle("AUSTRILIA");
		ii1=new ImageIcon(); 
		ii1=new ImageIcon(getClass().getResource("/images/ico.jpg"));
		this.setIconImage(ii1.getImage());
		
		c1=this.getContentPane();
		c1.setLayout(null);
		
		i1=new ImageIcon(getClass().getResource("/images/aus.png"));
		Im1=i1.getImage();
		Im2=Im1.getScaledInstance(1000,600,Image.SCALE_SMOOTH);
		i1=new ImageIcon(Im2);
		l1=new JLabel(i1);
		l1.setBounds(0,0,1000,600);
		c1.add(l1);
			
	}
	
	
	public static void main(String args[]){
		
		austrilia  l =new austrilia();
		l.setVisible(true);
	}
	
	
}