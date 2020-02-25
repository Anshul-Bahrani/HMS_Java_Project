/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.database.Database;

/**
 *
 * @author Avinash Bhawnani
 */
public class Pay_bill extends Applet implements ActionListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Label newfirst,newpass,newphoneno,newemail,newadd;
    TextField tnewfirst,tnewpass,tnewphoneno,tnewemail,tnewadd;
    Label lbill;
    Bill b;
    Button newdone;
    boolean flag=false;
    int sum=0;
    Pay_bill(Bill b)
    {
        this.b=b;
    }
    
    public void init() {
        // TODO start asynchronous download of heavy resources
        this.setLayout(null);
        this.setSize(1000,1000);
        Font f6=new Font("courier",Font.BOLD,20);
        setFont(f6);
        newfirst=new Label("First Name:");
        newpass=new Label("Password:");
        newphoneno=new Label("Phone No:");
        newemail=new Label("Email id :");
        newadd=new Label("Address :");
        tnewfirst=new TextField();
        tnewpass=new TextField();
        tnewphoneno=new TextField();
        tnewemail=new TextField();
        tnewadd=new TextField();
        newdone=new Button("DONE");
        newfirst.setBounds(100, 240, 200, 50);
        newpass.setBounds(100,320,200,50);
        newphoneno.setBounds(100,400,200,50);
        newemail.setBounds(100,480,200,50);
        newadd.setBounds(100,560,200,50);
        tnewfirst.setBounds(320,240,200,50);
        tnewpass.setBounds(320,320,200,50);
        tnewphoneno.setBounds(320,400,200,50);
        tnewemail.setBounds(320,480,200,50);
        tnewadd.setBounds(320,560,300,50);
        newdone.setBounds(500,500,100,30);
        add(newfirst);
        add(newpass);
        add(newphoneno);
        add(newemail);
        add(newadd);
        add(tnewfirst);
        add(tnewpass);
        add(tnewphoneno);
        add(tnewemail);
        add(tnewadd);
        add(newdone);
        tnewpass.setEchoChar('*');
       
        lbill=new Label("");
        lbill.setBounds(300, 500, 500, 300);
        Font f2=new Font("dialogue",Font.BOLD,30);
        lbill.setFont(f2);
        add(lbill);
        lbill.setVisible(false);
         newemail.setVisible(false);
        newadd.setVisible(false);
        newphoneno.setVisible(false);
        tnewemail.setVisible(false);
        tnewadd.setVisible(false);
        tnewphoneno.setVisible(false);
        for(int i=0;i<9;i++)
        {
            if(b.item[i]==true)
                sum=sum+b.price[i]*b.qty[i];              
                
        }
        lbill.setText("Your Bill is "+sum);
        newdone.addActionListener(this);
      
        
        
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
                Connection con1=DriverManager.getConnection("jdbc:derby://localhost:1527/Priya", "happy", "happy");
                Statement st1=con1.createStatement();
                String query1="select * from HOTEL";
                ResultSet rs1=st1.executeQuery(query1);
                
                String s1=tnewfirst.getText();
                String s2=tnewpass.getText();
                newdone.setVisible(false);
                while(rs1.next())
                {
                    if(s1.equals(rs1.getString("NAME"))&&s2.equals(rs1.getString("PASSWORD")))
                    {
                        //llcn.setText("Library Card No:");
                        flag=true;
                        tnewphoneno.setText(rs1.getString("PHONENO"));
                        tnewemail.setText(rs1.getString("EMAIL"));
                        tnewadd.setText(rs1.getString("ADDRESS"));
                        newphoneno.setVisible(true);
                        newemail.setVisible(true);
                        newadd.setVisible(true);
                        tnewphoneno.setVisible(true);
                        tnewemail.setVisible(true);
                        tnewadd.setVisible(true);
                        lbill.setVisible(true);
                        
                    }
                    
                }
                if(flag==false)
                {
                    lbill.setText("please register and then order");
                    lbill.setVisible(true);
                }
            } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}
