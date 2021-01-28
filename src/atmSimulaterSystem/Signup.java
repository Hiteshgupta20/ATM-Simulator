package atmSimulaterSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class Signup extends JFrame implements ActionListener {

	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b;
    JComboBox c1,c2,c3;
    
    //Random Number For Application Number
    Random ran= new Random();
    long first4=(ran.nextLong() % 9000L)+1000L;
    String first=""+Math.abs(first4);
    
    Signup(){
    	
    	//Set the title to center
		
    	setFont(new Font("System",Font.BOLD,22));
		Font f=getFont();
		FontMetrics fm=getFontMetrics(f);
		int x=fm.stringWidth("New Application Form - Page 1");
		int y=fm.stringWidth(" ");
		int z=getWidth()-x;
		int w=z/y;
		String pad="";
		pad=String.format("%"+w+"s", pad);
		setTitle(pad+"New Application Form - Page 1");
		
		//Labels
		l1 = new JLabel("APPLICATION FORM NO. "+first);
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        
        l2 = new JLabel("Page 1: Personal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        
        l3 = new JLabel("Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l4 = new JLabel("Father's Name:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l5 = new JLabel("Date of Birth:");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l8 = new JLabel("Marital Status:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l11 = new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l12 = new JLabel("State:");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l13 = new JLabel("Date");
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l14 = new JLabel("Month");
        l14.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l15 = new JLabel("Year");
        l15.setFont(new Font("Raleway", Font.BOLD, 14));
        
        //TExt Fields 
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t6 = new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t7 = new JTextField();
        t7.setFont(new Font("Raleway", Font.BOLD, 14));
 
        //Button
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        //Radio Buttons
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        
<<<<<<< HEAD
=======
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        
>>>>>>> 46f45f12dc7f97d0c85fa2f133d4db5a01c0b914
        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        
        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);
        
<<<<<<< HEAD
=======
        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);
        groupstatus.add(r5);
        
>>>>>>> 46f45f12dc7f97d0c85fa2f133d4db5a01c0b914
        
        String Date[] = {"1","2","3","4","5","6","7","8","9"};
        c1=new JComboBox(Date);
        c1.setBackground(Color.WHITE);
        

        String Month[] = {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
        c1=new JComboBox(Month);
        c1.setBackground(Color.WHITE);
        

        String Year[] = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011"};
        c1=new JComboBox(Year);
        c1.setBackground(Color.WHITE);
        
        //Setting Bounds for labels
        setLayout(null);
        l1.setBounds(140,20,600,40);
        add(l1);
        
        l2.setBounds(290,80,600,30);
        add(l2);
        
        l3.setBounds(100,140,100,30);
        add(l3);
        
        l4.setBounds(100,190,200,30);
        add(l4);
               
        l5.setBounds(100,240,200,30);
        add(l5);
        
        
        l6.setBounds(100,290,200,30);
        add(l6);
        
        
        l7.setBounds(100,340,200,30);
        add(l7);
        
        l8.setBounds(100,390,200,30);
        add(l8);
        
        l9.setBounds(100,440,200,30);
        add(l9);
         
        l10.setBounds(100,490,200,30);
        add(l10);
        
        l11.setBounds(100,540,200,30);
        add(l11);
               
        l12.setBounds(100,590,200,30);
        add(l12);
        
        //set bounds for radio buttons
        r1.setBounds(300,290,60,30);
        add(r1);
        
        r2.setBounds(450,290,90,30);
        add(r2);
        
        r3.setBounds(300,390,100,30);
        add(r3);
        
        r4.setBounds(450,390,100,30);
        add(r4);
        
        r5.setBounds(635,390,100,30);
        add(r5);
        
        
        
        //set bounds for textarea
        t1.setBounds(300,140,400,30);
        add(t1);
        
        t2.setBounds(300,190,400,30);
        add(t2);
        
        t3.setBounds(300,340,400,30);
        add(t3);
        
        t4.setBounds(300,440,400,30);
        add(t4);
        
        t5.setBounds(300,490,400,30);
        add(t5);
        
        t6.setBounds(300,540,400,30);
        add(t6);
        
        t7.setBounds(300,590,400,30);
        add(t7);
        
        //set bounds for buttons
        b.setBounds(620,660,80,30);
        add(b);
        
        b.addActionListener(this); 
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,850);
        setLocation(500,90);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
    	String a= t1.getText();
    	String b= t2.getText();
    	
    	String ac= (String)c1.getSelectedItem();
    	String bc= (String)c2.getSelectedItem();
    	String cc= (String)c3.getSelectedItem();
    	
    	String d=null;
    	if(r1.isSelected()) 
    		d="Male";
    	else if(r2.isSelected())
    		d="Female";
    	
    	String e=t3.getText();
    	String f=null;
    	if(r3.isSelected())
    		f="Married";
    	else if(r4.isSelected())
    		f="Unmarried";
    	else if(r5.isSelected())
    		f="Other";
    	
    	String g=t4.getText();
    	String h=t5.getText();
    	String i=t6.getText();
    	String j=t7.getText();
    	
    	try {
    		if(t6.getText().equals("")) 
    			JOptionPane.showMessageDialog(null, "Fill all the required Fields");
    		else {
    			Conn c1= new Conn();
    			String q1="insert into signup values('"+a+"','"+b+"','"+ac+"','"+bc+"','"+cc+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+first+"')";
    			c1.s.executeUpdate(q1);
    			
    			new Signup2(first).setVisible(true);
    			setVisible(false);
    		}
    		}
    	catch (Exception ex) {
			ex.printStackTrace();
		}
    	
    	}
    public static void main (String[] args) {
    	new Signup().setVisible(true);
    }
	
}
