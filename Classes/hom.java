package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class hom extends JFrame{
	
	private JFrame f1;
	private Container c1;
	private ImageIcon i1,i2,i3,i4;
	private JLabel l1;
	private JButton b1,b2,b3;
	private Image Im1,Im2,Im3,Im4,Im5,Im6,Im7,Im8;
	private ImageIcon ii1;
	
	
	public hom(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,120,1000,600);
		ii1=new ImageIcon(); 
		ii1=new ImageIcon(getClass().getResource("/images/ico.jpg"));
		this.setIconImage(ii1.getImage());
		
		c1=this.getContentPane();
		c1.setLayout(null);
		
		i1=new ImageIcon(getClass().getResource("/images/p1bac.jpg"));
		Im1=i1.getImage();
		Im2=Im1.getScaledInstance(1000,600,Image.SCALE_SMOOTH);
		i1=new ImageIcon(Im2);
		
		l1=new JLabel(i1);
		l1.setBounds(0,0,1000,600);
		c1.add(l1);
		
		
		i2=new ImageIcon(getClass().getResource("/images/start.png"));
		Im3=i2.getImage();
		Im4=Im3.getScaledInstance(240,45,Image.SCALE_SMOOTH);
		i2=new ImageIcon(Im4);
		b1=new JButton(i2);
		b1.setBounds( 110,339,240,45);
		l1.add(b1);
		
		i3=new ImageIcon(getClass().getResource("/images/contribution.png"));
		Im5=i3.getImage();
		Im6=Im5.getScaledInstance(240,45,Image.SCALE_SMOOTH);
		i3=new ImageIcon(Im6);
		b2=new JButton(i3);
		b2.setBounds(113,432,240,45);
		l1.add(b2);
		
		i4=new ImageIcon(getClass().getResource("/images/exit.png"));
		Im7=i4.getImage();
		Im8=Im7.getScaledInstance(240,45,Image.SCALE_SMOOTH);
		i4=new ImageIcon(Im7);
		b3=new JButton(i4);
		b3.setBounds(880,530,100,30);
		l1.add(b3);
		
				
		b1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			Login log=new Login();
			log.setVisible(true);
			dispose	();
		}
			
			
		});
		
		
		b2.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			contribution con=new contribution();
			con.setVisible(true);
			
		}
		});
		
		
		b3.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			dispose();
			
		}
		});
				
	}
	
	
	
	
}