/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Avinash Bhawnani
 */
public class Welcome extends Applet implements Runnable,ActionListener{
 Button b1;
 Image picture;
    String message1= " WELCOME TO HOTEL JARVIS!!   ";
    String message2="";
    
     
    Thread t=null;
    boolean stopFlag;
     //Image picture;  
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
          this.setLayout(null);
        this.setSize(1000, 1000);
        //picture = getImage(getDocumentBase(),"e.jpg"); 
    
         
        picture=getImage(getDocumentBase(),"pic_wlcum.jpg");
        Font f1=new Font("algerian",Font.BOLD,100);
        this.setFont(f1);
        b1= new Button("WELCOME");
        
          b1.setBounds(300, 800, 520, 100);
          Font f3=new Font("courier",Font.ITALIC,100);
        b1.setFont(f3);
        b1.setForeground(Color.black);
          add(b1);
          b1.addActionListener(this);
        // TODO start asynchronous download of heavy resources
    }
public void start()
    {
        t=new Thread (this);
        stopFlag=false;
        t.start();
    }
    // TODO overwrite start(), stop() and destroy() methods
@Override
    public void run() {
        char ch;
        while(!stopFlag)
                {
                    try
                    {
                        ch=message1.charAt(0);
                        message1=message1.substring(1,message1.length());
                        message1+=ch;
                        repaint();
                        Thread.sleep(270);
                    }
                    catch(InterruptedException e){}
                    }
                    
                }
    public void stop()
    {
        stopFlag=true;
        t=null;
        
    }
    
    
    public void paint(Graphics g)
    {
        //g.drawImage(picture, 0,0,1280,1024, this);
         g.drawImage(picture, 0, 0, 1000, 1000,this);
        g.setColor(Color.red);
        g.drawString(message1, 50, 250);
       
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        b1.setVisible(false);
        message1="";
        Mainn m=new Mainn();
        m.init();
        m.setBounds(0, 0, 1000, 1000);
        add(m);
    }
}
