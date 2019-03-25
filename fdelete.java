package project1;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class fdelete extends JFrame implements ActionListener
{
   JLabel lbl_image,lbl_heading,lbl_branch,lbl_name;
JTextField t_name;
JComboBox l_branch;
JButton b_delete,b_exit;

   Font f1=new Font("Arial",Font.BOLD,20);
     String strbranch[] = {"CSE", "ETC", "EE", "ETX", "IT", "CT", "CIVIL", "ME"};
  

     public fdelete()
          {
           	super("DELETE RECORD");
	       Container c=getContentPane();
                c.setLayout(new FlowLayout());
                 c.setBackground(Color.cyan);
          	c.setLayout (null);
                 lbl_image=new JLabel(" ",new ImageIcon("D:\\AD\\project1\\src\\project1\\delete1.jpg"),JLabel.RIGHT);
                 
		lbl_name=new JLabel("Enter Full Name:");
		lbl_branch=new JLabel("Select Branch:");
                  l_branch = new JComboBox(strbranch);
                lbl_heading=new JLabel("DELETE RECORD");

                //t_sn=new JTextField(10);
                t_name=new JTextField(10);


  

            b_delete=new JButton("DELETE");
            b_exit=new JButton("EXIT");
    setLayout(null);
    lbl_image.setBounds(0,250,900,500);
    lbl_heading.setBounds(300,10,500,20);
    lbl_branch.setBounds(20,60,140,20);
    lbl_name.setBounds(20,100,180,20);


l_branch.setBounds(200,60,500,20);
t_name.setBounds(200,100,500,20);

c.add(lbl_image);
b_exit.setBounds(400,160,100,50);
b_delete.setBounds(200,160,100,50);
c.add(lbl_heading);
c.add(lbl_branch);
c.add(lbl_name);
c.add(l_branch);
c.add(t_name);

c.add(b_delete);
c.add(b_exit);


b_delete.addActionListener(this);
b_exit.addActionListener(this);
 

   lbl_heading.setFont(f1);     
   lbl_branch.setFont(f1);
   lbl_name.setFont(f1);
   





    }

       public static void main(String args[])
          {
                JFrame f = new fdelete();
                f.setSize(1000,1000);
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
               if(ae.getSource()==b_delete)
               {
                   String n = t_name.getText().trim();
                   String b = l_branch.getSelectedItem().toString().trim();
            Connection conn;
            Statement stmt;
            ResultSet rs;
            int flag = 0;
            try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            } catch (ClassNotFoundException e) {
                System.out.println("No Class Exception:" + e.getMessage());
            }

            try {
                conn = DriverManager.getConnection("jdbc:odbc:pdsn");
                stmt = conn.createStatement();
                String str = "select * from alutab";
                rs = stmt.executeQuery(str);
              //  int x=0;
                while (rs.next()) 
                {
                    //x++;
                     //  System.out.println("x="+x);
                  //  System.out.println("u name="+n);
                  //  System.out.println("t name="+rs.getString("aname"));
                    //   System.out.println("u b="+b);
                  //  System.out.println("t b="+rs.getString("branch"));
                   
                    if (rs.getString("aname").trim().equals(n) && rs.getString("branch").trim().equals(b))
                    {
                       
                        flag = 1;
                        break;
                    }
                }

                if (flag == 0)
                {
                    JOptionPane.showMessageDialog((Component) null,
                            "Record Not Found ", "Alumni Records", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                  String strdel="delete from alutab where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                  stmt.executeUpdate(strdel);
                    JOptionPane.showMessageDialog((Component) null,
                            "Record Deleted ", "Alumni Records", JOptionPane.ERROR_MESSAGE);
              
                 }
            } catch (Exception e) {
                System.out.println("SqlException:" + e.getMessage());
            } 
               }
               
                   if(ae.getSource()==b_exit)
                 {
                     //System.exit(0);
                     this.hide();
                     
                 }
                } //actionperformed closed
   }
