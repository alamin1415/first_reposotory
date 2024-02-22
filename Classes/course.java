package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class course extends JFrame{
	
	private JFrame f1;
	private Container c1;
	private ImageIcon i1,i2,i3;
	private JLabel l1;
	private Image Im1,Im2,Im3,Im4,Im5,Im6;
	private ImageIcon ii1;
	
	
	course(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,120,1000,600);
		setTitle("AUSTRILIA");
		setResizable(false);
		ii1=new ImageIcon(); 
		ii1=new ImageIcon(getClass().getResource("/images/ico.jpg"));
		this.setIconImage(ii1.getImage());
		Font f=new Font("Arial",Font.BOLD,15);
		
		c1=this.getContentPane();
		c1.setLayout(null);
		
		i1=new ImageIcon(getClass().getResource("/images/course.png"));
		Im1=i1.getImage();
		Im2=Im1.getScaledInstance(1000,600,Image.SCALE_SMOOTH);
		i1=new ImageIcon(Im2);
		
		l1=new JLabel(i1);
		l1.setBounds(0,0,1000,600);
		c1.add(l1);
		
		JButton c1 =new JButton("ENGINEERING");
		c1.setBounds(33,289,187,25);
		c1.setFont(f);
		l1.add(c1);
		c1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			engineering con=new engineering();
			con.setVisible(true);
			dispose();
		}
		});
		
		
		
		JButton c2 =new JButton("Health & Medicine");
		c2.setBounds(282,289,187,25);
		c2.setFont(f);
		l1.add(c2);
		c2.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			helth con=new helth();
			con.setVisible(true);
			dispose();
		}
		});
		
		JButton c3 =new JButton("Arts & Design ");
		c3.setBounds(531,289,187,25);
		c3.setFont(f);
		l1.add(c3);
		c3.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			arts con=new arts();
			con.setVisible(true);
			dispose();
		}
		});
		
		
		JButton c4 =new JButton("Business ");
		c4.setBounds(777,289,187,25);
		c4.setFont(f);
		l1.add(c4);
		c4.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			arts con=new arts();
			con.setVisible(true);
			dispose();
		}
		});
		
		
		
		JButton c5 =new JButton("History ");
		c5.setBounds(33,533,187,25);
		c5.setFont(f);
		l1.add(c5);
		c5.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			arts con=new arts();
			con.setVisible(true);
			dispose();
		}
		});
		
		JButton c6 =new JButton("Social Science ");
		c6.setBounds(282,533,187,25);
		c6.setFont(f);
		l1.add(c6);
		c6.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			agricultural con=new agricultural();
			con.setVisible(true);
			dispose();
		}
		});
		
		
		JButton c7 =new JButton("Agriculture");
		c7.setBounds(531,533,187,25);
		c7.setFont(f);
		l1.add(c7);
		c7.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			agricultural con=new agricultural();
			con.setVisible(true);
			dispose();
		}
		});
		
		JButton c8 =new JButton("Law ");
		c8.setBounds(777,533,187,25);
		c8.setFont(f);
		l1.add(c8);
		c8.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			law con=new law();
			con.setVisible(true);
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
			
			home con=new home();
			con.setVisible(true);
			dispose();
		}
		});
		
		
		
		
		
		
		
		
	}
	
	
	public static void main(String args[]){
		
		course l=new course();
		l.setVisible(true);
	}
	
	
}