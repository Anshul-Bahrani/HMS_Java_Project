package Course;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Sunil
 */
class Bill
{
    boolean item[];
    int price[];
    int qty[];
    
    
    Bill()
    {
        item = new boolean[9];
        price= new int[9];
        price[0]=70;
        price[1]=90;
        price[2]=250;
        price[3]=170;
        price[4]=30;
        price[5]=150;
        price[6]=120;
        price[7]=70;
        price[8]=150;

        qty= new int[9];
        
    }
    
}
public class Course extends Applet implements ActionListener {
 Button starter , maincourse,dessert;
// Image picture;
  Checkbox c1,c2,c3,mc1,mc2,mc3,dc1,dc2,dc3;
   Choice q1,q2,q3,mq1,mq2,mq3,dq1,dq2,dq3;
   Button done,ok;
   Label display,mdisplay,ddisplay;
  
    
 @Override
    public void init() {
        this.setLayout(null);
        this.setSize(1000,1000);
        Font f=new Font("ALGERIAN",Font.BOLD,25);
        starter=new Button("STARTER");
        maincourse= new Button("MAINCOURSE");
        dessert= new Button("DESSERT");
        starter.setBounds(20, 250, 200, 100);
        starter.setFont(f);
        maincourse.setBounds(20, 380, 200, 100);
        maincourse.setFont(f);
        dessert.setFont(f);
        dessert.setBounds(20, 510, 200, 100);
        add(starter);
        add(maincourse);
        add(dessert);
         display=new Label("STARTERS");
        c1=new Checkbox("PANEER CHILLY (Rs70)",null,false);
         c2=new Checkbox("MUSHROOM MULTANI (Rs 90)",null,false);
          c3=new Checkbox("CHEESE TUKDI (Rs 250)",null,false);
          done=new Button("DONE");
          ok=new Button("BILL");
          Font f5=new Font("courier",Font.BOLD,20);
          q1=new Choice();
          q2=new Choice();
          q3=new Choice();
          for(int i=1;i<=5;i++)
          {
              q1.add(String.valueOf(i));
              q2.add(String.valueOf(i));
              q3.add(String.valueOf(i));
              
          }
          display.setBounds(400,180,300,40);
          c1.setBounds(220, 260, 350, 100);
          c2.setBounds(220,420,380,100);
          c3.setBounds(220,580,350,100);
          q1.setBounds(620, 300,50, 30);
          q2.setBounds(620,460,50,30);
          q3.setBounds(620,620,50,30);
          done.setBounds(400,750,100,50);
          ok.setBounds(550,750,100,50);
          Font f4=new Font("algerian",Font.BOLD,25);
          c1.setFont(f4);
          c2.setFont(f4);
          c3.setFont(f4);
          Font f2=new Font("dialogue",Font.BOLD,40);
          display.setFont(f2);
          q1.setFont(f5);
          q2.setFont(f5);
          q3.setFont(f5);
          done.setFont(f5);
          ok.setFont(f5);
            add(q1);
            add(q2);
            add(q3);
            add(c1);
            add(c2);
            add(c3);
            add(display);
            add(done);
            add(ok);
            c1.setVisible(false);
            c2.setVisible(false);
            c3.setVisible(false);
            q1.setVisible(false);
            q2.setVisible(false);
            q3.setVisible(false);
            done.setVisible(false);
            ok.setVisible(false);
            display.setVisible(false);
            
            
            mdisplay=new Label("MAINCOURSE");
        mc1=new Checkbox("VEG DUM BIRYANI (Rs170)",null,false);
         mc2=new Checkbox("ROTI (Rs 30)",null,false);
          mc3=new Checkbox("BUTTER PANEER (Rs 150)",null,false);
          
          mq1=new Choice();
          mq2=new Choice();
          mq3=new Choice();
          for(int i=1;i<=5;i++)
          {
              mq1.add(String.valueOf(i));
              mq2.add(String.valueOf(i));
              mq3.add(String.valueOf(i));
              
          }
          
          mdisplay.setBounds(400,180,300,40);
          mc1.setBounds(220, 260, 350, 100);
          mc2.setBounds(220,420,380,100);
          mc3.setBounds(220,580,350,100);
          mq1.setBounds(620, 300,50, 30);
          mq2.setBounds(620,460,50,30);
          mq3.setBounds(620,620,50,30);
         
          mc1.setFont(f4);
          mc2.setFont(f4);
          mc3.setFont(f4);
          mdisplay.setFont(f2);
          mq1.setFont(f5);
          mq2.setFont(f5);
          mq3.setFont(f5);
            add(mq1);
            add(mq2);
            add(mq3);
            add(mc1);
            add(mc2);
            add(mc3);
           
            add(mdisplay);
            
            mc1.setVisible(false);
            mc2.setVisible(false);
            mc3.setVisible(false);
            mq1.setVisible(false);
            mq2.setVisible(false);
            mq3.setVisible(false);
            mdisplay.setVisible(false);
         
             ddisplay=new Label("DESSERT");
        dc1=new Checkbox("BROWNIE (Rs120)",null,false);
         dc2=new Checkbox("CHOCLATE ICECREAM (Rs 70)",null,false);
          dc3=new Checkbox("SPECIAL SHAKE (Rs 150)",null,false);
          
          dq1=new Choice();
          dq2=new Choice();
          dq3=new Choice();
          for(int i=1;i<=5;i++)
          {
              dq1.add(String.valueOf(i));
              dq2.add(String.valueOf(i));
              dq3.add(String.valueOf(i));
              
          }
          
          ddisplay.setBounds(400,180,300,40);
          dc1.setBounds(220, 260, 350, 100);
          dc2.setBounds(220,420,380,100);
          dc3.setBounds(220,580,350,100);
          dq1.setBounds(620, 300,50, 30);
          dq2.setBounds(620,460,50,30);
          dq3.setBounds(620,620,50,30);
         
          dc1.setFont(f4);
          dc2.setFont(f4);
          dc3.setFont(f4);
          ddisplay.setFont(f2);
          dq1.setFont(f5);
          dq2.setFont(f5);
          dq3.setFont(f5);
            add(dq1);
            add(dq2);
            add(dq3);
            add(dc1);
            add(dc2);
            add(dc3);
           
            add(ddisplay);
            
            dc1.setVisible(false);
            dc2.setVisible(false);
            dc3.setVisible(false);
            dq1.setVisible(false);
            dq2.setVisible(false);
            dq3.setVisible(false);
            ddisplay.setVisible(false);
         
            
            
        starter.addActionListener(this);
        dessert.addActionListener(this);
        maincourse.addActionListener(this);
          done.addActionListener(this);
          ok.addActionListener(this);
        
        
            
        /*starter.addActionListener(this);
        dessert.addActionListener(this);
        maincourse.addActionListener(this);
          done.addActionListener(this);*/
        
        
    }
 @Override
    /*public void paint(Graphics g)
    {
        g.drawImage(picture, 0, 0, 800, 800,this);
        
    }*/

    // TODO overwrite start(), stop() and destroy() methods

    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==starter)
        {
          maincourse.setVisible(false);
          dessert.setVisible(false);
          starter.setVisible(false);
          c1.setVisible(true);
            c2.setVisible(true);
            c3.setVisible(true);
            q1.setVisible(true);
            q2.setVisible(true);
            q3.setVisible(true);
            done.setVisible(true);
            ok.setVisible(true);
            display.setVisible(true);
          
          
          
        }
        if(e.getSource()==maincourse)
        {
            maincourse.setVisible(false);
          dessert.setVisible(false);
          starter.setVisible(false);
          
          c1.setVisible(false);
            c2.setVisible(false);
            c3.setVisible(false);
            q1.setVisible(false);
            q2.setVisible(false);
            q3.setVisible(false);
            done.setVisible(true);
            ok.setVisible(true);
            display.setVisible(false);
            
            mc1.setVisible(true);
            mc2.setVisible(true);
            mc3.setVisible(true);
            mq1.setVisible(true);
            mq2.setVisible(true);
            mq3.setVisible(true);
            mdisplay.setVisible(true);
           
            
            
            
        }
        if(e.getSource()==dessert)
        {
         maincourse.setVisible(false);
          dessert.setVisible(false);
          starter.setVisible(false);
          
          c1.setVisible(false);
            c2.setVisible(false);
            c3.setVisible(false);
            q1.setVisible(false);
            q2.setVisible(false);
            q3.setVisible(false);
            done.setVisible(true);
            ok.setVisible(true);
            display.setVisible(false);
            
            mc1.setVisible(false);
            mc2.setVisible(false);
            mc3.setVisible(false);
            mq1.setVisible(false);
            mq2.setVisible(false);
            mq3.setVisible(false);
            mdisplay.setVisible(false);
             dc1.setVisible(true);
            dc2.setVisible(true);
            dc3.setVisible(true);
            dq1.setVisible(true);
            dq2.setVisible(true);
            dq3.setVisible(true);
            ddisplay.setVisible(true);
           
        
        
        
        }
              
        if(e.getSource()==done)
        {
            c1.setVisible(false);
            c2.setVisible(false);
            c3.setVisible(false);
            q1.setVisible(false);
            q2.setVisible(false);
            q3.setVisible(false);
            done.setVisible(false);
            ok.setVisible(false);
            display.setVisible(false);
            
            mc1.setVisible(false);
            mc2.setVisible(false);
            mc3.setVisible(false);
            mq1.setVisible(false);
            mq2.setVisible(false);
            mq3.setVisible(false);
            mdisplay.setVisible(false);
            
            dc1.setVisible(false);
            dc2.setVisible(false);
            dc3.setVisible(false);
            dq1.setVisible(false);
            dq2.setVisible(false);
            dq3.setVisible(false);
            ddisplay.setVisible(false);
            
            maincourse.setVisible(true);
          dessert.setVisible(true);
          starter.setVisible(true);
          
          
            
            
        }
        if(e.getSource()==ok)
        {
             c1.setVisible(false);
            c2.setVisible(false);
            c3.setVisible(false);
            q1.setVisible(false);
            q2.setVisible(false);
            q3.setVisible(false);
            done.setVisible(false);
            ok.setVisible(false);
            display.setVisible(false);
            
            mc1.setVisible(false);
            mc2.setVisible(false);
            mc3.setVisible(false);
            mq1.setVisible(false);
            mq2.setVisible(false);
            mq3.setVisible(false);
            mdisplay.setVisible(false);
            
            dc1.setVisible(false);
            dc2.setVisible(false);
            dc3.setVisible(false);
            dq1.setVisible(false);
            dq2.setVisible(false);
            dq3.setVisible(false);
            ddisplay.setVisible(false);
            Bill b1=new Bill();
          if(c1.getState())
          {b1.item[0]=true;
          b1.qty[0]=Integer.parseInt(q1.getSelectedItem());
          }
          if(c2.getState())
          {b1.item[1]=true;
          b1.qty[1]=Integer.parseInt(q2.getSelectedItem());
          }
          if(c3.getState())
          {b1.item[2]=true;
          b1.qty[2]=Integer.parseInt(q3.getSelectedItem());
          }
          if(mc1.getState())
          {b1.item[3]=true;
          b1.qty[3]=Integer.parseInt(mq1.getSelectedItem());
          }
          if(mc2.getState())
          {b1.item[4]=true;
          b1.qty[4]=Integer.parseInt(mq2.getSelectedItem());
          }
          if(mc3.getState())
          {b1.item[5]=true;
          b1.qty[5]=Integer.parseInt(mq3.getSelectedItem());
          }
          if(dc1.getState())
          {b1.item[6]=true;
          b1.qty[6]=Integer.parseInt(dq1.getSelectedItem());
          }
          if(dc2.getState())
          {b1.item[7]=true;
          b1.qty[7]=Integer.parseInt(dq2.getSelectedItem());
          }
          if(dc3.getState())
          {b1.item[8]=true;
          b1.qty[8]=Integer.parseInt(dq3.getSelectedItem());
          }
            Pay_bill p;
            p = new Pay_bill(b1);
          
            p.init();
            add(p);
        }
    }
}
