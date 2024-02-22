package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class engineering  extends JFrame{
	
	private JFrame f1;
	private Container c1;
	private ImageIcon i1,i2,i3,i4,i5,i6;
	private JLabel l1;
	private JButton b1,b2,b3,b4,b5,b6;
	private Image Im1,Im2,Im3,Im4,Im5,Im6,Im7,Im8,Im9,Im10,Im11,Im12;
	private ImageIcon ii1;
	
	
	engineering(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,120,1000,600);
		setTitle("AUSTRILIA");
		ii1=new ImageIcon(); 
		ii1=new ImageIcon(getClass().getResource("/images/ico.jpg"));
		this.setIconImage(ii1.getImage());
		
		c1=this.getContentPane();
		c1.setLayout(null);
		
		i1=new ImageIcon(getClass().getResource("/images/engineering.png"));
		Im1=i1.getImage();
		Im2=Im1.getScaledInstance(1000,550,Image.SCALE_SMOOTH);
		i1=new ImageIcon(Im2);
		l1=new JLabel(i1);
		l1.setBounds(0,0,1000,600);
		c1.add(l1);
		
		JButton back=new JButton("BACK");
		back.setBounds(910,28,80,25);
		l1.add(back);
		back.setForeground(Color.white);
        back.setBackground(Color.red);
		back.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			course con=new course();
			con.setVisible(true);
			dispose();
		}
		});
		
		
		
		//button
		
		/*i4=new ImageIcon(getClass().getResource("/images/civ.jpg"));
		Im7=i4.getImage();
		Im8=Im7.getScaledInstance(185,27,Image.SCALE_SMOOTH);
		i4=new ImageIcon(Im7);
		*/
		b3=new JButton("Civil Engineering");
		b3.setBounds(99,288,185,27);
		l1.add(b3);
		b3.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			 civil co=new civil();
			 co.setVisible(true);
			 dispose();
		}
		});
		
		/*i3=new ImageIcon(getClass().getResource());
		Im5=i3.getImage();
		Im6=Im5.getScaledInstance(170,25,Image.SCALE_SMOOTH);
		i3=new ImageIcon(Im6);*/
		b2=new JButton("Biomedical Engineering ");
		b2.setBounds(99,520,185,25);
		l1.add(b2);
		b2.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			 bio co=new bio ();
			 co.setVisible(true);
			 dispose();
		}
		});
		
		/*i2=new ImageIcon(getClass().getResource("/images/syii.jpg"));
		Im3=i2.getImage();
		Im4=Im3.getScaledInstance(185,25,Image.SCALE_SMOOTH);
		i2=new ImageIcon(Im4);
		*/
		b1=new JButton("Architecture ");
		b1.setBounds(404,520,185,25);
		l1.add(b1);
		
		b1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			archi con=new archi();
			con.setVisible(true);
			dispose();
		}
		});
		
		
		
		/*i5=new ImageIcon(getClass().getResource("/images/.jpg"));
		Im11=i5.getImage();
		Im12=Im11.getScaledInstance(185,25,Image.SCALE_SMOOTH);
		i5=new ImageIcon(Im11);
		*/
		b4=new JButton("Computer Engineering ");
		b4.setBounds(700,520,185,25);
		l1.add(b4);
		b4.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			 com co=new com ();
			 co.setVisible(true);
			 dispose();
		}
		});
		
		
		
		b5=new JButton("Mechanical Engineering" );
		b5.setBounds(404,288,185,25);
		l1.add(b5);
		b5.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			 mechanical co=new mechanical ();
			 co.setVisible(true);
			 dispose();
		}
		});
		
		
		
		b6=new JButton("Electrical Engineering  ");
		b6.setBounds(700,288,185,25);
		l1.add(b6);
		b6.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			 ele co=new ele ();
			 co.setVisible(true);
			 dispose();
		}
		});
		
				
		}
	
	public static void main(String args[]){
		
		engineering l =new engineering();
		l.setVisible(true);
	}
	
	
}