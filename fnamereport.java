package project1;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;

import javax.swing.table.*;

public class fnamereport extends JFrame implements ActionListener {

    JLabel lbl_heading, lbl_batch;
  
    JButton b_show, b_exit;
    JTextField t_name;
    JPanel p1,p2,p3;
    

Font f1 = new Font("Arial", Font.BOLD, 20);

    Object[] data = new Object[5];
    DefaultTableModel defaulttablemodel = new DefaultTableModel();
    JTable jtable = new JTable(defaulttablemodel);
    
    public fnamereport() {
        super("Allumni Record");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.setBackground(Color.MAGENTA);
      //  c.setLayout(null);
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        
        p1.setLayout(new GridLayout(1,1));
        p2.setLayout(new GridLayout(1,3));
        p3.setLayout(new GridLayout(2,1));
      
        t_name=new JTextField(10);
        lbl_heading = new JLabel("name Wise Report",JLabel.CENTER);
      
        lbl_batch = new JLabel("Enter Name:");
       
            
        b_show = new JButton("Show Report");
        b_exit = new JButton("EXIT");
       
            
       defaulttablemodel.addColumn("Name");
      defaulttablemodel.addColumn("Branch");
      defaulttablemodel.addColumn("Batch");
      defaulttablemodel.addColumn("Email id");
defaulttablemodel.addColumn("Mobile no");


  
       JScrollPane jp=new JScrollPane(jtable) ;
       
        p1.add(lbl_heading);
        p2.add(lbl_batch);
        p2.add(t_name);
        p2.add(b_show);
     
        p3.add(p1);
        p3.add(p2);
        
      //  lbl_heading.setBounds(400, 10, 500, 20);
      
      //  lbl_batch.setBounds(20, 290, 140, 20);
       
      //  li_batch.setBounds(200, 290, 500, 20);

       


       // b_exit.setBounds(600, 650, 100, 50);
       // b_show.setBounds(200, 650, 100, 50);
          //c.add(lbl_heading);
       
        // c.add(lbl_batch,BorderLayout.NORTH);
        // c.add(li_batch);

       // c.add(b_show);
      //  jtable.sizeColumnsToFit(0);
        jtable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
         c.add(p3,BorderLayout.NORTH);
         c.add(b_exit,BorderLayout.SOUTH);
         c.add(jp,BorderLayout.CENTER);
         
          b_show.addActionListener(this);
          b_exit.addActionListener(this);


          lbl_heading.setFont(f1);
       

          lbl_batch.setFont(f1);
      }

    public static void main(String args[]) {
        JFrame f = new fnamereport();
        f.setSize(1000, 600);
        f.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent a) {
                System.exit(0);
            }
        });
        f.show();
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == b_show)
        {
         //  String b = li_batch.getSelectedItem().toString().trim();
           String b=t_name.getText();
           String strb[]=b.split(" ");
           String nb=strb[0];
           System.out.println(b);
            System.out.println(nb);
           
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
               // String str = "select * from alutab where aname="+"'"+nb+"'";
              String str = "select * from alutab where aname like "+"'"+nb+"%"+"'";
               
                rs = stmt.executeQuery(str);
              //  int x=0;
                defaulttablemodel.setRowCount(0);
                
                while (rs.next()) 
                {
                     data[0] = rs.getString("aname");
                     data[1] = rs.getString("branch");
                     data[2] = rs.getString("batch");
                     data[3] = rs.getString("email");
                      data[4] = rs.getString("mobno");
                     defaulttablemodel.addRow(data);
                  
                }
                   jtable.sizeColumnsToFit(0);
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
            
          
        } //if closed
       if(ae.getSource()==b_exit)
                 {
                     //System.exit(0);
                     this.hide();
                     
                 }



    } //actionperformed closed

}
