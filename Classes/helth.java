package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class helth extends JFrame{
	
	private JFrame f1;
	private Container c1;
	private ImageIcon i1,i2,i3,i4,i5,i6;
	private JLabel l1;
	private JButton b1,b2,b3,b4;
	private Image Im1,Im2,Im3,Im4,Im5,Im6,Im7,Im8,Im9,Im10,Im11,Im12;
	private ImageIcon ii1;
	
	
		helth(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,120,1000,600);
		setTitle("AUSTRILIA");
		setResizable(false);
		ii1=new ImageIcon(); 
		ii1=new ImageIcon(getClass().getResource("/images/ico.jpg"));
		this.setIconImage(ii1.getImage());
		
		c1=this.getContentPane();
		c1.setLayout(null);
		
		i1=new ImageIcon(getClass().getResource("/images/hel.png"));
		Im1=i1.getImage();
		Im2=Im1.getScaledInstance(1000,600,Image.SCALE_SMOOTH);
		i1=new ImageIcon(Im2);
		l1=new JLabel(i1);
		l1.setBounds(0,0,1000,600);
		c1.add(l1);
		
		JButton nex=new JButton("EXITE");
		nex.setBounds(910,530,80,25);
		nex.setForeground(Color.white);
        nex.setBackground(Color.red);
		l1.add(nex);
		nex.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			
			dispose();
		}
		});
		
		JButton back=new JButton("BACK");
		back.setBounds(910,10,80,25);
		back.setForeground(Color.white);
        back.setBackground(Color.red);
		l1.add(back);
		back.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			
			course con=new course();
			con.setVisible(true);
			dispose();
		}
		});
		
	
	}
	public static void main(String args[]){
		
		helth l =new helth();
		l.setVisible(true);
	}
	
	
}
