package atmSimulaterSystem;
<<<<<<< HEAD
<<<<<<< HEAD
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Transactions extends JFrame implements ActionListener {
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6,b7;
	
	
	Transactions() {
		
		//Move Title to Center
		
		setFont(new Font("System",Font.BOLD,22));
		Font f=getFont();
		FontMetrics fm=getFontMetrics(f);
		int x=fm.stringWidth("Transactions");
		int y=fm.stringWidth(" ");
		int z=getWidth()-x;
		int w=z/y;
		String pad="";
		pad=String.format("%"+w+"s", pad);
		setTitle(pad+"Transactions");
		
		//Labels
		l1 = new JLabel("Please Select your Trasactions");
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("System", Font.BOLD,16));
		
		//Buttons
		b1=new JButton("DEPOSIT");
		b2=new JButton("CASH WITHDRWAL");
		b3=new JButton("FAST CASH");
		b4=new JButton("MINI STATEMENT");
		b5=new JButton("PIN CHANGE");
		b6=new JButton("BALANCE ENQUIRY");
		b7=new JButton("EXIT");
		
		setLayout(null);
		
		//setting Layouts
		l1.setBounds(235,400,700,35);
        add(l1);
        
        b1.setBounds(170,499,150,35);
        add(b1);
        
        b2.setBounds(390,499,150,35);
        add(b2);
        
        b3.setBounds(170,543,150,35);
        add(b3);
        
        b4.setBounds(390,543,150,35);
        add(b4);
        
        b5.setBounds(170,588,150,35);
        add(b5);
        
        b6.setBounds(390,588,150,35);
        add(b6);
        
        b7.setBounds(390,633,150,35);
        add(b7);
        
        //Action listnere for buttons
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        //Window size and Color
        getContentPane().setBackground(Color.WHITE);
        setSize(850,850);
        setLocation(500,120);
        setVisible(true);
	}
	 public void actionPerformed(ActionEvent ae) {
		 if(ae.getSource()==b1) {
			 new Deposit().setVisible(true);
			 setVisible(false);
		 }
		 else if(ae.getSource()==b2) {
			 new Withdrawl().setVisible(true);
			 setVisible(false);
		 }
		 else if(ae.getSource()==b3) {
			 new FastCash().setVisible(true);
			 setVisible(false);
		 }
		 else if(ae.getSource()==b4) {
			 new Login().setVisible(true);
			 setVisible(false);
		 }
		 else if(ae.getSource()==b5) {
			 new Pin().setVisible(true);
			 setVisible(false);
		 }
		 else if(ae.getSource()==b6) {
			 String pin = JOptionPane.showInputDialog("Enter Your Pin");
			 Conn c1= new Conn();
			 
			 try {
				 ResultSet rs=c1.s.executeQuery(" select balance from bank order by pin ='"+pin+"' desc limit 1");
				 if(rs.next()) {
					 String balance =rs.getString("balance");
					 JOptionPane.showMessageDialog(null, "Your Account Balance is " +balance);
					 }
				 }
			 catch (Exception e) {
				 e.printStackTrace();
			 }
	
			}
		 else if(ae.getSource()==b7)
			 System.exit(0);
		 }
	 public void main(String[] args) {
		 new Transactions().setVisible(true);
	 }
	
=======
=======
>>>>>>> 46f45f12dc7f97d0c85fa2f133d4db5a01c0b914

public class Transactions {

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
<<<<<<< HEAD
>>>>>>> 46f45f12dc7f97d0c85fa2f133d4db5a01c0b914
=======
>>>>>>> 46f45f12dc7f97d0c85fa2f133d4db5a01c0b914

}
