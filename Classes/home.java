package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class home extends JFrame{
	
	private JFrame f1;
	private Container c1;
	private ImageIcon i1,i2,i3,i4,i5,i6;
	private JLabel l1;
	private JButton b1,b2,b3,b4,b5;
	private Image Im1,Im2,Im3,Im4,Im5,Im6,Im7,Im8,Im9,Im10,Im11,Im12;
	private ImageIcon ii1;
	
	
	home(){
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,120,1000,600);
		ii1=new ImageIcon(); 
		ii1=new ImageIcon(getClass().getResource("/images/ico.jpg"));
		this.setIconImage(ii1.getImage());
		setTitle("HOME PAGE");
		setResizable(false);
		c1=this.getContentPane();
		c1.setLayout(null);
		
		i1=new ImageIcon(getClass().getResource("/images/all.png"));
		Im1=i1.getImage();
		Im2=Im1.getScaledInstance(1000,600,Image.SCALE_SMOOTH);
		i1=new ImageIcon(Im2);
		
		l1=new JLabel(i1);
		l1.setBounds(0,0,1000,600);
		c1.add(l1);
		
		
		i2=new ImageIcon(getClass().getResource("/images/explorecon.jpg"));
		Im3=i2.getImage();
		Im4=Im3.getScaledInstance(187,25,Image.SCALE_SMOOTH);
		i2=new ImageIcon(Im4);
		b1=new JButton(i2);
		b1.setBounds( 97,529,187,25);
		l1.add(b1);
		
		/*i3=new ImageIcon(getClass().getResource("/images/userprofile.jpg"));
		Im5=i3.getImage();
		Im6=Im5.getScaledInstance(187,25,Image.SCALE_SMOOTH);
		i3=new ImageIcon(Im6);
		b2=new JButton(i3);
		b2.setBounds(33,529,187,25);
		l1.add(b2);*/
		
		
		i4=new ImageIcon(getClass().getResource("/images/findcourse.jpg"));
		Im7=i4.getImage();
		Im8=Im7.getScaledInstance(187,25,Image.SCALE_SMOOTH);
		i4=new ImageIcon(Im7);
		b3=new JButton(i4);
		b3.setBounds(406,529,187,25);
		l1.add(b3);
		
		i5=new ImageIcon(getClass().getResource("/images/university.jpg"));
		Im11=i5.getImage();
		Im12=Im11.getScaledInstance(187,25,Image.SCALE_SMOOTH);
		i5=new ImageIcon(Im11);
		b4=new JButton(i5);
		b4.setBounds(708,529,187,25);
		l1.add(b4);
		b4.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			
			uni1 con=new uni1();
			con.setVisible(true);
			dispose();
		}
		});
		
		
		b5=new JButton("BACK");
		b5.setForeground(Color.white);
        b5.setBackground(Color.red);
		b5.setBounds(910,7,70,27);
		l1.add(b5); 
		
		
		b1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			country con=new country();
			con.setVisible(true);
			dispose();
		}
		});
		
		
		b3.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			course co=new course();
			co.setVisible(true);
			dispose();
		}
		});
		
		b5.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			 Login co=new Login ();
			 co.setVisible(true);
			 dispose();
		}
		});
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public static void main(String args[]){
		
		home l=new home();
		l.setVisible(true);
	}
	
	
}