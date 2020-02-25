package Course;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sunil
 */
public class Register extends Applet implements ActionListener {
    Label lfirst,lpass,lphoneno,lemail,ladd;
    TextField tfirst,tpass,tphoneno,temail,tadd;
    Button submit;
    @Override
    public void init() {
        this.setLayout(null);
        this.setSize(1000,1000);
        Font f7=new Font("courier",Font.BOLD,20);
        setFont(f7);
        lfirst=new Label("First Name:");
        lpass=new Label("Password:");
        lphoneno=new Label("Phone No:");
        lemail=new Label("Email id :");
        ladd=new Label("Address :");
        tfirst=new TextField();
        tpass=new TextField();
        tphoneno=new TextField();
        temail=new TextField();
        tadd=new TextField();
        lfirst.setBounds(100, 240, 200, 50);
        lpass.setBounds(100,320,200,50);
        lphoneno.setBounds(100,400,200,50);
        lemail.setBounds(100,480,200,50);
        ladd.setBounds(100,560,200,50);
        tfirst.setBounds(320,240,200,50);
        tpass.setBounds(320,320,200,50);
        tphoneno.setBounds(320,400,200,50);
        temail.setBounds(320,480,200,50);
        tadd.setBounds(320,560,300,50);
        submit=new Button("OK");
        submit.setBounds(400,700,200,50);
        add(submit);
        add(lfirst);
        add(lpass);
        add(lphoneno);
        add(lemail);
        add(ladd);
        add(tfirst);
        add(tpass);
        tpass.setEchoChar('*');
        add(tphoneno);
        add(temail);
        add(tadd);
        submit.addActionListener(this);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
                Connection con; 
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/Priya","happy","happy");
            
                String query;
                query = "INSERT INTO HOTEL VALUES(?,?,?,?,?)";
                PreparedStatement st;
                st = con.prepareStatement(query);
                st.setString(1,tfirst.getText());
                st.setString(2,tpass.getText());
                st.setString(3,temail.getText());
                st.setString(4,tphoneno.getText());
                st.setString(5,tadd.getText());
                
                st.execute();
                con.close();
            
                    }
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        lfirst.setVisible(false);
        lpass.setVisible(false);
        lemail.setVisible(false);
        lphoneno.setVisible(false);
        ladd.setVisible(false);
        tfirst.setVisible(false);
        tpass.setVisible(false);
        temail.setVisible(false);
        tphoneno.setVisible(false);
        tadd.setVisible(false);
        submit.setVisible(false);
        Course c1=new Course();
        c1.init();
        add(c1);
}
}