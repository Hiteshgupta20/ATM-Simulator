package atmSimulaterSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

<<<<<<< HEAD

public class Deposit extends JFrame implements ActionListener {
	JTextField t1,t2;
	JButton b1,b2,b3;
	JLabel l1,l2,l3;
	String pin;

	Deposit() {
	 		 	
	 	setFont(new Font("System",Font.BOLD,22));
		Font f=getFont();
		FontMetrics fm=getFontMetrics(f);
		int x=fm.stringWidth("Deposit");
		int y=fm.stringWidth(" ");
		int z=getWidth()-(5*x);
		int w=z/y;
		String pad="";
		pad=String.format("%"+w+"s", pad);
		setTitle(pad+"Deposit");
		
		//Labels
		l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 35));
        
        l2 = new JLabel("Enter Pin");
        l2.setFont(new Font("System", Font.BOLD, 14));
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        t2= new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));        
        
        b1 = new JButton("DEPOSIT");
        b1.setFont(new Font("System" ,Font.BOLD,18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("BACK");
        b2.setFont(new Font("System" ,Font.BOLD,18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("EXIT");
        b3.setFont(new Font("System" ,Font.BOLD,18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        //Setting layouts
        setLayout(null);
        
        l1.setBounds(190,350,400,35);
        add(l1);
        
        t1.setBounds(190,420,320,25);
        add(t1);
        
        b1.setBounds(390,588,150,35);
        add(b1);
        
        b2.setBounds(390,633,150,35);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(960,1080);
        setLocation(500,0);
        setVisible(true);
}
 
 public void actionPerformed(ActionEvent ae) {
	 try {
		 String amount=t1.getText();
		 String b=t2.getText();
	 
		 if(ae.getSource()==b1) {
			 if(t1.getText().equals("")) 
				 JOptionPane.showMessageDialog(null, "Please enter the Amount you want to Deposit");
			 
			 else {
				 Conn c1 = new Conn();
				 ResultSet rs= c1.s.executeQuery("select * from bank where pin ='"+b+"' ");
				 double balance=0;
				 if(rs.next()) {
					 String pin=rs.getString("pin");
					 balance=rs.getDouble("balance");
					 double d= Double.parseDouble(amount);
					 balance+=d;
					 String q1=("insert into bank values('"+pin+"', '"+d+"', 'null', '"+balance+"')");
					 c1.s.executeUpdate(q1);}
				 
				 	JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
				 	setVisible(false);
				 	new Transactions().setVisible(true);
             }
         }else if(ae.getSource()==b2){
             setVisible(false);
             new Transactions().setVisible(true);
         }
         else if(ae.getSource()==b3)
        	 System.exit(0);
     }catch(Exception e){
         e.printStackTrace();
     }
         
 
}
 public static void main(String[] args) {
	 new Deposit().setVisible(true);
 }
=======
public class Deposit {
	public static void main(String[] args) {
		new Deposit().setVisible(true);
	}

	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
>>>>>>> 46f45f12dc7f97d0c85fa2f133d4db5a01c0b914

}
