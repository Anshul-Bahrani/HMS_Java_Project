package Course;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Sunil
 */
public class Mainn extends Applet implements ActionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Label name;
    Button order,register;
    
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        this.setLayout(null);
        this.setSize(1000,1000);
        Font f=new Font("algiam",Font.BOLD,100);
         name=new Label("HOTEL JARVIS");
         name.setBounds(100, 20, 800, 200);
         name.setFont(f);
        Font f2=new Font("courier",Font.ITALIC,30);
        order=new Button("ORDER");
        register=new Button("SIGN UP");
        order.setBounds(300, 400,200, 200);
        register.setBounds(500, 400, 200, 200);
           order.setFont(f2);
        this.add(name);
        register.setFont(f2);
        add(order);
        add(register);
        order.addActionListener(this);
        register.addActionListener(this);
        
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==order)
       {
           order.setVisible(false);
           register.setVisible(false);
           Course c=new Course();
           c.setBounds(0, 0, 1000, 1000);
           c.init();
           add(c);
           
       }
       if(e.getSource()==register)
       {
           order.setVisible(false);
           register.setVisible(false);
           Register r;
           r=new Register();
           r.init();
           add(r);
       }
    }
}
