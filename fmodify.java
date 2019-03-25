package project1;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class fmodify extends JFrame implements ActionListener
{
JLabel lbl_image,lbl_heading,lbl_branch,lbl_name,lbl_email,lbl_mobno,lbl_altno,lbl_orgloc,lbl_address,lbl_batch,lbl_dob,lbl_currsts,lbl_nameorg,lbl_desig,lbl_orgadd,lbl_placmnt,lbl_gateapp,lbl_gatemrk,lbl_currwork,lbl_agg;
JTextField t_sn,t_name,t_email,t_mobno,t_altno,t_currsts,t_nameorg,t_desig,t_proof,t_gatemrk,t_currwork,t_agg;
JTextArea ta_address;
JButton b_show,b_save,b_exit;
JComboBox l_orgloc,li_batch,cmb_dd,cmb_mm,cmb_yy,l_branch,l_currsts;
JCheckBox c1_oncmp,c2_offcmp;
JRadioButton c3_gaty,c4_gatn;
ButtonGroup g;

String strorgl[]={"Mumbai","Pune","Delhi","Nagpur"};
String strbatch[]={"2012","2013","2014","2015","2016","2017"};
String strbranch[]={"CSE","ETC","EE","ETX","IT","CT","CIVIL","ME"};
String strcurrsts[]={"job","Business","Goverment service","Higher studies","Searching job","Housewife","other"};

String strdd[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
String strmm[]={"01","02","03","04","05","06","07","08","09","10","11","12"};
String stryy[]={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017"};
 
    Font f1=new Font("CASTELLAR",Font.BOLD,12);
   Font f2=new Font("ALGERIAN",Font.BOLD,36);
  
  

     public fmodify()
          {
           	super("MODIFY RECORD");
	       Container c=getContentPane();
                c.setLayout(new FlowLayout());
                 c.setBackground(Color.pink);
          	c.setLayout (null);
                //lbl_image=new JLabel(" ",new ImageIcon("D:\\AD\\project1\\src\\project1\\show4.jpg"),JLabel.CENTER);
                
		lbl_name=new JLabel("Full Name:");
		lbl_branch=new JLabel("Branch:");
lbl_email=new JLabel("EmailID");
lbl_mobno=new JLabel("MobileNo");
lbl_address=new JLabel("Address");
lbl_orgloc=new JLabel("Org location");
lbl_heading=new JLabel("MODIFY RECORD");
lbl_altno=new JLabel("Alternate no:");
lbl_dob=new JLabel("Date of birth");
lbl_currsts=new JLabel("Current status");
lbl_nameorg=new JLabel("Name of org");
lbl_desig=new JLabel("Designation");
lbl_orgadd=new JLabel("Proof");
lbl_gateapp=new JLabel("Gate appear");
lbl_gatemrk=new JLabel("Gate Marks");
lbl_currwork=new JLabel("Curr-company");
lbl_placmnt=new JLabel("Placement");
lbl_batch=new JLabel("BATCH");
lbl_agg=new JLabel("Aggregate");


t_name=new JTextField(10);
t_email=new JTextField(10);
t_mobno=new JTextField(10);
t_altno=new JTextField(10);
t_nameorg=new JTextField(10);
t_desig=new JTextField(10);
t_agg=new JTextField(10);
t_currwork=new JTextField(10);
t_proof=new JTextField(10);
t_gatemrk=new JTextField(10);
g=new ButtonGroup();

c1_oncmp=new JCheckBox("ONcampus");
c2_offcmp=new JCheckBox("OFFcampus");
c3_gaty=new JRadioButton("YES");
c4_gatn=new JRadioButton("NO");

g.add(c3_gaty);
g.add(c4_gatn);

ta_address=new JTextArea();
l_orgloc=new JComboBox(strorgl);
li_batch=new JComboBox(strbatch);
l_branch=new JComboBox(strbranch);
l_currsts=new JComboBox(strcurrsts);
  
  cmb_dd=new JComboBox(strdd);
  cmb_mm=new JComboBox(strmm);
  cmb_yy=new JComboBox(stryy);

  
b_save=new JButton("MODIFY");
b_show=new JButton("SHOW");
b_exit=new JButton("EXIT");
setLayout(null);
///lbl_image.setBounds(0,0,2000,2000);
//lbl_image1.setBounds(750,20,600,400);
lbl_heading.setBounds(550,10,1000,60);
lbl_branch.setBounds(680,100,140,20);
lbl_name.setBounds(50,100,140,20);
lbl_email.setBounds(50,160,140,20);
lbl_mobno.setBounds(670,160,140,20);
lbl_altno.setBounds(50,220,140,20);
lbl_orgloc.setBounds(680,220,140,20);
lbl_address.setBounds(50,280,140,20);
lbl_batch.setBounds(680,280,140,20);
lbl_dob.setBounds(50,380,220,20);
lbl_currsts.setBounds(680,380,140,20);
lbl_nameorg.setBounds(50,440,140,20);
lbl_desig.setBounds(680,440,140,20);
lbl_orgadd.setBounds(50,500,140,20);
lbl_placmnt.setBounds(680,500,140,20);
lbl_gateapp.setBounds(50,560,140,20);
lbl_gatemrk.setBounds(680,560,140,20);
lbl_currwork.setBounds(50,620,140,20);
lbl_agg.setBounds(680,620,140,20);

l_orgloc.setBounds(840,220,140,30);
li_batch.setBounds(840,280,140,30);
l_currsts.setBounds(840,380,140,30);

l_branch.setBounds(840,100,180,30);
t_name.setBounds(200,100,400,30);
t_email.setBounds(200,160,400,30);
t_mobno.setBounds(840,160,300,30);
t_altno.setBounds(200,220,180,30);
t_nameorg.setBounds(200,440,400,30);
t_desig.setBounds(840,440,400,30);
t_proof.setBounds(200,500,400,30);
t_gatemrk.setBounds(840,560,400,30);
t_gatemrk.setEditable(false);
t_currwork.setBounds(200,620,400,30);
t_agg.setBounds(840,620,400,30);
ta_address.setBounds(200,280,400,70);

c1_oncmp.setBounds(840,500,130,30);
c2_offcmp.setBounds(1000,500,130,30);
c3_gaty.setBounds(200,560,90,30);
c4_gatn.setBounds(400,560,90,30);

  cmb_dd.setBounds(200,380,70,30);
  cmb_mm.setBounds(350,380,70,30);
  cmb_yy.setBounds(500,380,70,30);

//c.add(lbl_image);
//c.add(lbl_image1);
b_save.setBounds(500,670,100,30);
b_exit.setBounds(800,670,100,30);
b_show.setBounds(200,670,100,30);
c.add(lbl_heading);
c.add(lbl_branch);
c.add(lbl_name);
c.add(lbl_email);
c.add(lbl_mobno);
c.add(lbl_altno);
c.add(lbl_orgloc);
c.add(lbl_dob);
c.add(lbl_address);
c.add(lbl_batch);
c.add(lbl_currsts);
c.add(lbl_nameorg);
c.add(lbl_desig);
c.add(lbl_placmnt);
c.add(lbl_orgadd);
c.add(lbl_gateapp);
c.add(lbl_gatemrk);
c.add(lbl_currwork);
c.add(lbl_agg);
c.add(l_branch);
c.add(t_name);
c.add(t_email);
c.add(t_mobno);
c.add(t_altno);
c.add(cmb_dd);
c.add(cmb_mm);
c.add(cmb_yy);
c.add(ta_address);
c.add(l_currsts);
c.add(t_nameorg);
c.add(t_desig);
c.add(t_proof);
c.add(t_gatemrk);
c.add(t_currwork);
c.add(t_agg);
c.add(b_save);
c.add(b_show);
c.add(b_exit);

c.add(c1_oncmp);
c.add(c2_offcmp);
c.add(c3_gaty);
c.add(c4_gatn);

c.add(l_orgloc);
c.add(li_batch);

b_show.addActionListener(this);
b_save.addActionListener(this);
b_exit.addActionListener(this); 

   lbl_heading.setFont(f2);      
   lbl_branch.setFont(f1);
   lbl_name.setFont(f1);
   lbl_email.setFont(f1);
   lbl_mobno.setFont(f1);
   lbl_altno.setFont(f1);
   lbl_orgloc.setFont(f1);
   lbl_address.setFont(f1);

   lbl_batch.setFont(f1);
   lbl_dob.setFont(f1);
   lbl_currsts.setFont(f1);
   lbl_nameorg.setFont(f1);
   lbl_desig.setFont(f1);
   lbl_orgadd.setFont(f1);
   lbl_placmnt.setFont(f1);
   lbl_gatemrk.setFont(f1);
   lbl_gateapp.setFont(f1);

   lbl_currwork.setFont(f1);
   lbl_agg.setFont(f1);





    }

       public static void main(String args[])
          {
                JFrame f = new fmodify();
                f.setSize(2000,2000);
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
                 if(ae.getSource()==b_show)
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
                        t_email.setText(rs.getString("email"));
                        t_mobno.setText(rs.getString("mobno"));
                        t_altno.setText(rs.getString("altno"));
                        
                        l_orgloc.setSelectedItem(rs.getString("orgloc"));
                        ta_address.setText(rs.getString("add"));
                        li_batch.setSelectedItem(rs.getString("batch"));
                        
                        // date of birth
                        cmb_dd.setSelectedItem(rs.getString("dobdd"));
                         cmb_mm.setSelectedItem(rs.getString("dobmm"));
                         cmb_yy.setSelectedItem(rs.getString("dobyy"));
                       
                        l_currsts.setSelectedItem(rs.getString("curstatus"));
                                  
                        t_nameorg.setText(rs.getString("orgname"));
                        t_desig.setText(rs.getString("desig"));
                        
                        t_proof.setText(rs.getString("proof"));
                        
                        String camp=rs.getString("onoffcampus");
                        if(camp.equals("On Campus"))
                        {
                          c1_oncmp.setSelected(true)  ;
                        }
                        else
                        {
                           c2_offcmp.setSelected(true);
                      }
                       
                          String gapp=rs.getString("gateapp");
                        if(gapp.equals("Yes"))
                        {
                          c3_gaty.setSelected(true)  ;
                        }
                        else
                        {
                          c4_gatn.setSelected(true)  ;
                      }
                     t_gatemrk.setText(rs.getString("gatemrk"));
                     
                     t_currwork.setText(rs.getString("curwrkcmpy"));
                     
                    t_agg.setText(rs.getString("agg"));
                
                          
                        flag = 1;
                        break;
                    }
                }

                if (flag == 0) {
                    JOptionPane.showMessageDialog((Component) null,
                            "Record Not Found ", "Alumni Records", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println("SqlException:" + e.getMessage());
            }  
           }  //show completed
                 
                 if(ae.getSource()==b_save)
                 {
                   String n = t_name.getText().trim();
                    String b = l_branch.getSelectedItem().toString().trim();
                     String emailid=t_email.getText();
                    String mbno=t_mobno.getText();
                    String altno=t_altno.getText();
                    String orgloc=l_orgloc.getSelectedItem().toString();
                    String addr=ta_address.getText();
                    String batch=li_batch.getSelectedItem().toString();
                    String dobdd=cmb_dd.getSelectedItem().toString();
                    String dobmm=cmb_mm.getSelectedItem().toString();
                    String dobyy=cmb_yy.getSelectedItem().toString();
                   String currs=l_currsts.getSelectedItem().toString();
                   String nameorg=t_nameorg.getText();
                   String designation=t_desig.getText();
                   String proof=t_proof.getText();
                   
                   String placement="";
                   if(c1_oncmp.isSelected()==true)
                   {
                      placement="On Campus" ;
                   }
                   else
                   {
                         placement="Off Campus" ;  
                   }
                   String gatapp="";
                   
                    if(c3_gaty.isSelected()==true)
                   {
                      gatapp="Yes" ;
                   }
                   else
                   {
                         gatapp="No" ;  
                   }
                   
                   String gatm=t_gatemrk.getText();
                   String currwork=t_currwork.getText();
                   String agg=t_agg.getText();
                   
                   
                   
                    
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
               // String str = "update alutab set mobno="+ mbno + ;
                String stru="";
                stru="update alutab set email =" + "'"+ emailid + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                stmt.executeUpdate(stru);
               
                    stru="update alutab set mobno =" + "'"+ mbno + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                    stmt.executeUpdate(stru);
                
                      stru="update alutab set altno =" + "'"+ altno + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                stmt.executeUpdate(stru);
               
                    stru="update alutab set orgloc =" + "'"+ orgloc + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                    stmt.executeUpdate(stru);
                 
                   
                      stru="update alutab set add =" + "'"+ addr + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                    stmt.executeUpdate(stru);
                    
                      stru="update alutab set batch =" + "'"+ batch + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                    stmt.executeUpdate(stru);
                    
                      stru="update alutab set dobdd =" + "'"+ dobdd + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                    stmt.executeUpdate(stru);
                    
                      stru="update alutab set dobmm =" + "'"+ dobmm + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                    stmt.executeUpdate(stru);
                    
                      stru="update alutab set dobyy =" + "'"+ dobyy + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                    stmt.executeUpdate(stru);
                  
                      stru="update alutab set curstatus =" + "'"+ currs + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                      stmt.executeUpdate(stru);
                     
                      stru="update alutab set orgname =" + "'"+ nameorg + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                    stmt.executeUpdate(stru);
                    
                      stru="update alutab set desig =" + "'"+ designation + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                    stmt.executeUpdate(stru);
                    
                      stru="update alutab set proof =" + "'"+ proof + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                    stmt.executeUpdate(stru);
                    
                      stru="update alutab set onoffcampus =" + "'"+ placement + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                    stmt.executeUpdate(stru);
                    
                      stru="update alutab set gateapp =" + "'"+ gatapp + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                    stmt.executeUpdate(stru);
                    
                    
                      stru="update alutab set gatemrk =" + "'"+ gatm + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                    stmt.executeUpdate(stru);
                    
                      stru="update alutab set curwrkcmpy =" + "'"+ currwork + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                    stmt.executeUpdate(stru);
                    
                      stru="update alutab set agg =" + "'"+ agg + "'" + " where aname="+"'"+ n + "'"+" and branch="+"'"+ b + "'";
                    stmt.executeUpdate(stru);
                  
                  JOptionPane.showMessageDialog((Component) null,
                            "Record Modified Successfully ", "Alumni Records", JOptionPane.ERROR_MESSAGE);
              
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
