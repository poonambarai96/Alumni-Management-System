
package project1;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class frmwelcome extends JFrame implements ActionListener
{
   JLabel lblname1,lblname2,lblname3,lblname4,lblgname,lblphead,lblghead; 
   JLabel well;

   JButton btnnext;
    Font fhead=new Font("Arial",Font.BOLD,20);
    Font fg=new Font("Arial",Font.BOLD|Font.ITALIC,10);
    Font fp=new Font("Arial",Font.BOLD,10);

    Font fx=new Font("Arial",Font.BOLD,40);
    
   Container c;

     public frmwelcome()
          {
           	super ("Alumni Records");
           	c=getContentPane();
          	c.setLayout (null);
                c.setBackground(Color.LIGHT_GRAY);
          	//well=new JLabel(new ImageIcon("welcome.jpg"),JLabel.CENTER);
	well=new JLabel(" ",new ImageIcon("D:\\AD\\project1\\src\\project1\\welcome.jpg"),JLabel.CENTER);
        
	lblghead=new JLabel("(Guided By)");
	lblphead=new JLabel("(Developed By)");
	lblgname=new JLabel("Prof.Neha Titarmare ");
	lblname1=new JLabel("Amarja Indapwar");
          	lblname2=new JLabel("Hemangi Oke");
	lblname3=new JLabel("Poonam Barai");
	lblname4=new JLabel("Pratima Katre");

          	btnnext=new JButton("Next");
	well.setFont(fx);
        

         	c.add( well);
         	c.add(lblghead);
         	c.add(lblphead);
          	c.add(lblgname);
         	c.add(lblname1);
          	c.add(lblname2);
        	c.add(lblname3);
	c.add(lblname4);
	c.add(btnnext);
         	btnnext.addActionListener(this);
                 well.setBounds(0,0,800,300);

	lblghead.setBounds(550,450,100,30);
	lblgname.setBounds(550,400,300,30);
	lblphead.setBounds(50,450,100,30);
         	lblname1.setBounds(50,425,250,20);
	lblname2.setBounds(50,400,250,20);
	lblname3.setBounds(50,375,250,20);
	lblname4.setBounds(50,350,250,20);
	btnnext.setBounds(150,480,150,20);
        
        
      }

       public static void main(String args[])
          {
                JFrame f = new  frmwelcome();
                f.setSize(800,550);
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
                    if(ae.getSource()==btnnext)
                       {
                        JFrame f1= new frmmaster();
	       f1.setSize(800,550);    
	        f1.show(); 
                        }
                 } //actionperformed closed
    }
