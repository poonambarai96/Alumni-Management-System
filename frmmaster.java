package project1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class frmmaster extends JFrame implements ActionListener
{
    JButton cmd_add,cmd_modify,cmd_show,cmd_del,cmd_report,cmd_orgname,cmd_name,cmd_cursts,cmd_orgloc;
    JLabel lbl_img,lbl_img1,lbl_img2;
    

   Container c;

     public frmmaster()
          {
          super ("Main Form");
          
         c=getContentPane();
         c.setBackground(Color.GREEN);
        
         c.setLayout(new FlowLayout());
        c.setLayout (null);
        lbl_img=new JLabel(" ",new ImageIcon("D:\\AD\\project1\\src\\project1\\show5.jpg"),JLabel.CENTER);
        lbl_img1=new JLabel(" ",new ImageIcon("D:\\AD\\project1\\src\\project1\\show2.jpg"),JLabel.CENTER);
        lbl_img2=new JLabel(" ",new ImageIcon("D:\\AD\\project1\\src\\project1\\books.jpg"),JLabel.CENTER);
                
          cmd_add=new JButton("Add a New Record");
 
          cmd_modify=new JButton("Modify a Record");
 
          cmd_show=new JButton("Show a  Record");
 
          cmd_del=new JButton("Delete a Record");
            cmd_report=new JButton("Generate  Batch wise Report");
             cmd_name=new JButton("Generate name wise Report");
             cmd_orgname=new JButton("Generate organization name wise Report");
              cmd_cursts=new JButton("Generate current status wise Report");
            cmd_orgloc=new JButton("Generate organization location  wise Report");
            
             //cmd_add.setBackground(Color.yellow);
            setLayout(null);
            lbl_img2.setBounds(0,0,2200,1200);
            lbl_img.setBounds(0,0,1100,1200);
            lbl_img1.setBounds(0,0,300,1200);
            cmd_add.setBounds(100,100,300,50);
             cmd_modify.setBounds(100,200,300,50);
              cmd_show.setBounds(100,300,300,50);
               cmd_del.setBounds(900,300,300,50);
                cmd_name.setBounds(500,200,300,50);
                cmd_orgname.setBounds(500,300,300,50);
                cmd_cursts.setBounds(900,100,300,50);
                 cmd_orgloc.setBounds(900,200,300,50);
                cmd_report.setBounds(500,100,300,50);
	add(lbl_img);
        add(lbl_img1);
        add(lbl_img2);
	add(cmd_add);
	add(cmd_modify);
	add(cmd_show);
	add(cmd_del);
        add(cmd_report);
        add(cmd_name);
        add(cmd_orgname);
        add(cmd_cursts);
        add(cmd_orgloc);
	cmd_add.addActionListener(this);
	cmd_modify.addActionListener(this);
	cmd_show.addActionListener(this);
	cmd_del.addActionListener(this);
        cmd_report.addActionListener(this);
        cmd_name.addActionListener(this);
        cmd_orgname.addActionListener(this);
        cmd_cursts.addActionListener(this);
        cmd_orgloc.addActionListener(this);
         }

       public static void main(String args[])
          {
                Frame f = new frmmaster();
                f.setSize(400,400);
                 f.addWindowListener(new WindowAdapter()
                         {
                            public void windowClosing(WindowEvent a)
                               {
                                  System.exit(0);
                               }
                           }
                       );
	//f.setBackground(Color.green);
                  f.show();
          }
           public void actionPerformed(ActionEvent ae)
                {
	if(ae.getSource()==cmd_add)
	  {
	 	JFrame f1= new faddnew();
	        	f1.setSize(800,550);    
	   	f1.show();

	 }

	if(ae.getSource()==cmd_modify)
	  {
		JFrame f1= new fmodify();
	        	f1.setSize(800,550);    
	   	f1.show();

	 }

	if(ae.getSource()==cmd_show)
	  {
		JFrame f1= new fshow();
	        	f1.setSize(800,550);    
	   	f1.show();

	 }

	if(ae.getSource()==cmd_del)
	  {
		JFrame f1= new fdelete();
	        	f1.setSize(800,550);    
	   	f1.show();

	 }
        if(ae.getSource()==cmd_report)
	  {
		JFrame f1= new freport();
	        	f1.setSize(800,550);    
	   	f1.show();

	 }

        if(ae.getSource()==cmd_name)
	  {
		JFrame f1= new fnamereport();
	        	f1.setSize(800,550);    
	   	f1.show();

	 }
        if(ae.getSource()==cmd_orgname)
	  {
		JFrame f1= new forgname();
	        	f1.setSize(800,550);    
	   	f1.show();

	 }
        
        if(ae.getSource()==cmd_cursts)
	  {
		JFrame f1= new fcursts();
	        	f1.setSize(800,550);    
	   	f1.show();

	 }
        
        if(ae.getSource()==cmd_orgloc)
	  {
		JFrame f1= new forg();
	        	f1.setSize(800,550);    
	   	f1.show();

	 }
        
                  } //actionperformed closed
   }
