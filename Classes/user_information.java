package Classes;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;

public class user_information extends JFrame{
	
	private JFrame f1;
	private Container c1;
	private JLabel l1;
	private JButton b1,b2,b3,b4;
	private Image Im1,Im2,Im3,Im4,Im5,Im6,Im7,Im8,Im9,Im10,Im11,Im12;
	private ImageIcon ii1;
	private ImageIcon i1,i2,i3,i4,i5,i6;
	private JScrollPane scroll;
	private JTable table;
	private DefaultTableModel model;
	private Cursor cursor;
	private String[] column = { "User Name", "Password", "Email", "Security Question", "Answer", "Date and Time" };
    private String[] rows = new String[7];
	
	user_information(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,120,1000,600);
		setTitle("user_information");
		setResizable(false);
		ii1=new ImageIcon(); 
		ii1=new ImageIcon(getClass().getResource("/images/ico.jpg"));
		this.setIconImage(ii1.getImage());
		
		c1=this.getContentPane();
		c1.setLayout(null);
		
		i1=new ImageIcon(getClass().getResource("/images/blank.png"));
		Im1=i1.getImage();
		Im2=Im1.getScaledInstance(1000,600,Image.SCALE_SMOOTH);
		i1=new ImageIcon(Im2);
		l1=new JLabel(i1);
		l1.setBounds(0,0,1000,600);
		c1.add(l1);
			
		
		
		
		//tableLayout
		
		Font f3=new Font("Arial",Font.BOLD,15);
		
		table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setFont(f3);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(300);
        table.getColumnModel().getColumn(3).setPreferredWidth(220);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);
        table.getColumnModel().getColumn(5).setPreferredWidth(220);

        scroll = new JScrollPane(table);
        scroll.setBounds(40, 110, 900, 400);
        scroll.setBackground(Color.WHITE);
        l1.add(scroll);

        String file = ".\\Data\\user_data.txt";
        String temp = ".\\Data\\temp.txt";
		
		
		// To input data in the table
		
			
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("User")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(12); // User Name
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(11); // Password
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(8); // Email
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(20); // Security Question
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(9); // Answer
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(14); // Date and Time
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
            return;
        }
		
		JButton back=new JButton("BACK");
		back.setBounds(910,10,80,25);
		back.setForeground(Color.white);
        back.setBackground(Color.red);
		l1.add(back);
		back.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent a){
			
			Login con=new Login();
			con.setVisible(true);
			dispose();
		}
		});
      
	
	}
	public static void main(String args[]){
		
		user_information l =new user_information();
		l.setVisible(true);
	}
	
	
}
