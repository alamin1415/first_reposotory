package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.file.*;
import java.util.*;
import java.io.*;
	
public class Login extends JFrame{
	
	private JFrame f1;
	private Container c1;
	private ImageIcon i1,i2,il1,il2,is1,is2,im;
	private JLabel l1,name ,pass,reg;
	private Image Im1,Im2,Im3,Im4,Im5,Im6,Ims1,Ims2,Ims3,Ims4;
	private JPanel p;
	private JTextField t;
	private ImageIcon ii1;
	
	
	
	
	
		public Login(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,120,1000,600);
		setResizable(false);
		setTitle("LOGIN PAGE");
		ii1=new ImageIcon(); 
		ii1=new ImageIcon(getClass().getResource("/images/ico.jpg"));
		this.setIconImage(ii1.getImage());
		
		
		im=new ImageIcon("/images/smile.jpg");
		
		
		c1=this.getContentPane();
		c1.setLayout(null);
		
		i1=new ImageIcon(getClass().getResource("/images/log.png"));
		Im1=i1.getImage();
		Im2=Im1.getScaledInstance(1000,600,Image.SCALE_SMOOTH);
		i1=new ImageIcon(Im2);
		
		l1=new JLabel(i1);
		l1.setBounds(0,0,1000,600);
		c1.add(l1);
		
		Font f=new Font("Arial",Font.BOLD,20);
		Font fp=new Font("Arial",Font.BOLD,25);
		
		p=new JPanel();
		p.setLayout(null);
		p.setBounds(445,140,480,530);
		p.setBackground (new Color(51,153,155,40));
		p.setFont(f);
		l1.add(p);
		
		name=new JLabel("User Name :");
		name.setBounds(20,70,300,60);
		name.setFont(f);
		name.setForeground(Color.white);
		p.add(name);
		
		
		
		t=new JTextField();
		t.setBounds(150,70,300,60);
		t.setFont(f);
		p.add(t);
		
		
		pass=new JLabel(" Password :");
		pass.setBounds(20,160,300,60);
		pass.setFont(f);
		pass.setForeground(Color.white);
		p.add(pass);
		
		
		JPasswordField pasword =new JPasswordField();
		pasword.setBounds(150,160,300,60);
		pasword.setEchoChar('*');
		pasword.setFont(fp);
		p.add(pasword);
		
		is1=new ImageIcon(getClass().getResource("/images/submit.png"));
		Ims1=is1.getImage();
		Ims2=Ims1.getScaledInstance(186,48,Image.SCALE_SMOOTH);
		is1=new ImageIcon(Ims2);
		JButton sub = new JButton(is1);
		sub.setBounds(197,276,186,48);
		sub.setFont(f);
		p.add(sub);
		
		
		
		
		JButton sin=new JButton("SING IN");
		sin.setBounds(395,373,80,25);
		sin.setForeground(Color.white);
		sin.setBackground(Color.blue);
		p.add(sin);
		
		sin.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			SingIn con=new SingIn();
			con.setVisible(true);
			dispose	();
		}
		});
		
		ButtonGroup grp =new ButtonGroup();
		
		Font f1=new Font("Arial",Font.BOLD,15);
		
		JRadioButton r1=new JRadioButton("Admin");
		r1.setBounds(60,15,150,30);
		r1.setBackground(Color.decode("#008B8B"));
		r1.setFont(f1);
	
		p.add(r1);
		
		JRadioButton r2=new JRadioButton("user login ");
		r2.setBackground(Color.decode("#008B8B"));
		r2.setBounds(300,15,150,30);
		
		r2.setFont(f1);
		p.add(r2);
		
		
		grp.add(r1);
		grp.add(r2);
		r2.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = t.getText().toLowerCase(); // User Name 
                String textField2 = pasword.getText(); // Password

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Fillup  Your information.", "Warning!",
                            JOptionPane.ERROR_MESSAGE);
                } else {

                    try {
                        String userNameS = "User Name : " + textField1;
                        String passwordS = "Password : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\user_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Your Login Successful Done.", "FLYING DREAMS!",
                                            JOptionPane.PLAIN_MESSAGE);

                                    setVisible(false);
                                    home frame = new home();
                                    frame.setVisible(true);
                                    break;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Incorrect your User Name or Password!", "Warning!",
                                JOptionPane.ERROR_MESSAGE);
                    }

                }

            }
        });
		}
		});
		
		
		r1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

				String textField1 = t.getText().toLowerCase(); // Admin Name
                String textField2 = pasword.getText(); // Password

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Fillup Your information.", "Warning!",
                            JOptionPane.ERROR_MESSAGE);
                } else {

                    try {

                        String userNameS = "Name : " + textField1;
                        String passwordS = "Password : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\admin_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Admin Login Successful.", "FLYING DREAMS!",
                                            JOptionPane.WARNING_MESSAGE);

                                    setVisible(false);
                                    user_information frame = new user_information();
                                    frame.setVisible(true);
                                    break;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Incorrect your User Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }
				
				
				

            }
        });
		}
		});
		
    }
		
		
		
		
	
	public static void main(String args[]){
		
		Login l=new Login();
		l.setVisible(true);
	}
}
	