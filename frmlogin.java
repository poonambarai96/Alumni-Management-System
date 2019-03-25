package project1;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class frmlogin extends JFrame implements ActionListener
{
   JLabel lblhead,lbluname,lblpass,lbllogo; 
   JTextField txtuname;
   TextField txtpass;
    JButton btnok,btncancel;
    Font fhead=new Font("Arial",Font.BOLD,20);
   Container c;

     public frmlogin()
          {
           	super ("Alumni Record");
           	c=getContentPane();
          	c.setLayout (null);
          	lblhead=new JLabel("Login Form");
          	lbluname=new JLabel("Enter User Name:"); 
          	lblpass=new JLabel("Enter Password:");
          	txtuname=new JTextField(15);
          	txtpass=new TextField(15);
          	btnok=new JButton("Ok");
          	btncancel=new JButton("Cancel");
	lbllogo=new JLabel(" ",new ImageIcon("D:\\AD\\project1\\src\\project1\\connected_data_big1.jpg"),JLabel.LEFT);
         	c.add( lblhead);
         	c.add(lbluname);
         	c.add(txtuname);
          	c.add(lblpass);
         	c.add(txtpass);
          	c.add(btnok);
        	c.add(btncancel);
	c.add(lbllogo);
         	btnok.addActionListener(this);
         	btncancel.addActionListener(this);
	lblhead.setBounds(150,10,150,30);
	lbluname.setBounds(70,150,100,30);
	txtuname.setBounds(180,150,100,30);
	lblpass.setBounds(70,190,100,30);
	txtpass.setBounds(180,190,100,30);
 	btnok.setBounds(70,230,100,30);
	btncancel.setBounds(180,230,100,30);
	lbllogo.setBounds(0,0,300,300);
	lblhead.setFont(fhead);
	txtpass.setEchoChar('*');
      }

       public static void main(String args[])
          {
                JFrame f = new frmlogin();
                f.setSize(320,320);
                 f.addWindowListener(new WindowAdapter()
                         {
                            public void windowClosing(WindowEvent a)
                               {
                                  System.exit(0);
                               }
                           }
                       );
                  f.show();
          }
           public void actionPerformed(ActionEvent ae)
                {
                    if(ae.getSource()==btnok)
                       {
                       String n=txtuname.getText().trim();
	     String p=txtpass.getText().trim();
                       Connection conn;
                       Statement stmt;
	     ResultSet rs;
	     int flag=0;
                          try
                          {
                            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                          }
                          catch(ClassNotFoundException e)
                               {
                                  System.out.println("No Class Exception:" +e.getMessage());
                                 }

                        try
                          {
                             conn=DriverManager.getConnection("jdbc:odbc:pdsn");
                             stmt=conn.createStatement();
  	            String str="select * from logintab";
                              rs=stmt.executeQuery(str);
	            while(rs.next())
		{
		 if(rs.getString("username").equals(n) && rs.getString("password").equals(p))
		    {
		         JFrame f1= new frmwelcome();
	   	         f1.setSize(800,550);    
	   	         f1.show();
		      flag=1;
		      break;
		     }
		}

		if(flag==0)
		  {
		   JOptionPane.showMessageDialog((Component) null, 
                  "Invalid User Name or Password ", "Alumni Records", JOptionPane.ERROR_MESSAGE);
		   }
                               }
                 catch(Exception e)
                     {
                       System.out.println("SqlException:" +e.getMessage());
                     }
                 } //if closed
             else
              {
                System.exit(0);
              }
        } //actionperformed closed
   }
