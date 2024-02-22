package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class country extends JFrame{
	
	private JFrame f1;
	private Container c1;
	private ImageIcon i1,i2,i3;
	private JLabel l1;
	private Image Im1,Im2,Im3,Im4,Im5,Im6;
	private ImageIcon ii1;
	
	
	country(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,120,1000,600);
		ii1=new ImageIcon(); 
		ii1=new ImageIcon(getClass().getResource("/images/ico.jpg"));
		this.setIconImage(ii1.getImage());
		Font f=new Font("Arial",Font.BOLD,15);
		
		c1=this.getContentPane();
		c1.setLayout(null);
		
		i1=new ImageIcon(getClass().getResource("/images/country.png"));
		Im1=i1.getImage();
		Im2=Im1.getScaledInstance(1000,600,Image.SCALE_SMOOTH);
		i1=new ImageIcon(Im2);
		
		l1=new JLabel(i1);
		l1.setBounds(0,0,1000,600);
		c1.add(l1);
		
		JButton c1 =new JButton("austrilia");
		
		c1.setBounds(33,289,160,25);
		c1.setFont(f);
		l1.add(c1);
		
		JButton c2 =new JButton("UK");
		c2.setBounds(300,289,160,25);
		c2.setFont(f);
		l1.add(c2);
		
		JButton c3 =new JButton("USA");
		c3.setBounds(550,289,160,25);
		c3.setFont(f);
		l1.add(c3);
		
		
		JButton c4 =new JButton("MALAYSHIA");
		c4.setBounds(800,289,160,25);
		c4.setFont(f);
		l1.add(c4);
		
		JButton c5 =new JButton("GERMANY");
		c5.setBounds(33,533,160,25);
		c5.setFont(f);
		l1.add(c5);
		
		JButton c6 =new JButton("FINLAND");
		c6.setBounds(300,533,160,25);
		c6.setFont(f);
		l1.add(c6);
		
		JButton c7 =new JButton("CANADA");
		c7.setBounds(550,533,160,25);
		c7.setFont(f);
		l1.add(c7);
		
		JButton c8 =new JButton("DENMARK");
		c8.setBounds(800,533,160,25);
		c8.setFont(f);
		l1.add(c8);
		
		
	   JButton back=new JButton("BACK");
		back.setBounds(910,10,80,25);
		l1.add(back);
		back.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			home con=new home();
			con.setVisible(true);
			dispose();
		}
		});
		
		
		c1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
		austrilia aus=new austrilia();
			aus.setVisible(true);
			dispose();
		}
		});
		
		
		
		
		
	}
	
	
	public static void main(String args[]){
		
		country l=new country();
		l.setVisible(true);
	}
	
	
}