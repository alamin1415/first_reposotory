package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class contribution  extends JFrame{
	
	private JFrame f1;
	private Container c1;
	private ImageIcon i1,i2;
	private JLabel l1;
	private JButton b1,b2,b3;
	private Image Im1,Im2,Im3,Im4;
	private ImageIcon ii1;
	
	
	contribution(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,120,1000,600);
		setTitle("CONTRIBUTION");
		ii1=new ImageIcon(); 
		ii1=new ImageIcon(getClass().getResource("/images/ico.jpg"));
		this.setIconImage(ii1.getImage());
		
		c1=this.getContentPane();
		c1.setLayout(null);
		
		i1=new ImageIcon(getClass().getResource("/images/scon.png"));
		Im1=i1.getImage();
		Im2=Im1.getScaledInstance(1000,600,Image.SCALE_SMOOTH);
		i1=new ImageIcon(Im2);
		
		l1=new JLabel(i1);
		l1.setBounds(0,0,1000,600);
		c1.add(l1);
		
		
		i2=new ImageIcon(getClass().getResource("/images/okay.png"));
		Im3=i2.getImage();
		Im4=Im3.getScaledInstance(100,30,Image.SCALE_SMOOTH);
		i2=new ImageIcon(Im4);
		b1=new JButton(i2);
		b1.setBounds(150,500,100,30);
		l1.add(b1);
		b1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
		
			dispose();
			
		}
		});
		
		
		
		
		
		b1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			
			dispose	();
		}
			
			
		});
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public static void main(String args[]){
		
		contribution l =new contribution();
		l.setVisible(true);
	}
	
	
}