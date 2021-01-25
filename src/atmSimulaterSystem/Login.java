package atmSimulaterSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
	JLabel l1,l2,l3;	//Label for names like login etc.
	JTextField tf1;		//This if for textfield this is visible to user
	JPasswordField pf2;	//Password field is for enetring password It is not visible to user 
	JButton b1,b2,b3;	//this is for buttons 
	
	Login(){
		
		//Set the title to center
		
		setFont(new Font("System",Font.BOLD,22));
		Font f=getFont();
		FontMetrics fm=getFontMetrics(f);
		int x=fm.stringWidth("Automated Teller Machine");
		int y=fm.stringWidth(" ");
		int z=getWidth()-x;
		int w=z/y;
		String pad="";
		pad=String.format("%"+w+"s", pad);
		setTitle(pad+"Automated Teller Machine");
		
		//Labels 
		l1=new JLabel("WELCOME TO ATM");
		l1.setFont(new Font("Osward",Font.BOLD,38));
		
		l2=new JLabel("Card No:");
		l2.setFont(new Font("Raleway",Font.BOLD,28));
		
		l3=new JLabel("Pin:");
		l3.setFont(new Font("Raleway",Font.BOLD,28));
		
		//textField And password fiwld;
		
		tf1=new JTextField(15);
		pf2=new JPasswordField(15);
		
		//Buttons
		
		b1= new JButton("Sign In");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		b2= new JButton("Clear");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);

		b3= new JButton("Sign Up");
		b3.setBackground(Color.BLACK);//Backgroun
		b3.setForeground(Color.WHITE);//Foreground color
		
		setLayout(null);
		
		l1.setBounds(175,50,450,200);
		add(l1);
		
		l2.setBounds(125,150,375,200);
		add(l2);
		
		l3.setBounds(125,225,375,200);
		add(l3);
		
		tf1.setFont(new Font("Arial",Font.BOLD,14));;
		tf1.setBounds(300,235,230,30);
		add(tf1);
		

		pf2.setFont(new Font("Arial",Font.BOLD,14));;
		pf2.setBounds(300,310,230,30);
		add(pf2);
        
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(300,400,100,30);
        add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430,400,100,30);
        add(b2);
        
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(300,450,230,30);
        add(b3);

        //Action listeners for buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        //size and colour for window
        getContentPane().setBackground(Color.WHITE);
        setSize(750,750);
        setLocation(500,200);
        setVisible(true);
}
	
	//Method for Actions
	public void actionPerformed(ActionEvent ae) {
		try {
			Conn c1= new Conn();  //New object for connection to database 
			String a= tf1.getText();	//Getting text for TextArea
			String b= pf2.getText();	//getting text for PAssword Area
			String q= "select * from login where cardno = '"+a+"' and pin = '"+b+"'"; //getting details from database
			ResultSet rs= c1.s.executeQuery(q);  //taking the result or details from database
			
			if(ae.getSource()==b1) {
				if(rs.next()) {
					new Transactions().setVisible(true);
					setVisible(false);
				}
				else 
					JOptionPane.showMessageDialog(null,"Incorrect Card Number and Pin");
			}
			else if(ae.getSource()==b2) {
				tf1.setText("");
				pf2.setText("");
			}
			else if(ae.getSource()==b3) {
				new Signup().setVisible(true);
				setVisible(false);
			}
			
		} catch (Exception e) {
				e.printStackTrace();
				System.out.println("error: "+e);
		}
			
		}
	public static void main(String[] args) {
		new Login().setVisible(true);

	}
	
	


		
	}

