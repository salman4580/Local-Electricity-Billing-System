
package electricity.adop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class proj extends JFrame{
    proj()
    {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/mainj.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i1);
        add(image);
        JMenuBar mb=new JMenuBar();
        setJMenuBar(mb);
       
        JMenu master=new JMenu("MASTER");
        mb.add(master);
        
        JMenuItem  newcustomer=new JMenuItem("NEW CUSTOMER");
        newcustomer.setMnemonic('D');
        newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        master.add(newcustomer);
        
        
         JMenuItem customerdetails=new JMenuItem("CUSTOMER details");
        customerdetails.setMnemonic('M');
        customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        master.add(customerdetails);
        
         JMenuItem Depositdetails=new JMenuItem("deposit deatils");
        Depositdetails.setMnemonic('S');
       Depositdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
        master.add(Depositdetails);
        
         JMenuItem calculatebill=new JMenuItem("calculate bill");
         calculatebill.setMnemonic('B');
         calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        master.add(calculatebill);
        
        
        JMenu information=new JMenu("Information");
        information.setForeground(Color.RED);
        mb.add(information);
        
        
         JMenuItem updateinformation=new JMenuItem("update information");
         updateinformation.setMnemonic('P');
         updateinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
         information.add(updateinformation);
          
         
         JMenuItem viewinformation=new JMenuItem("view information");
         viewinformation.setMnemonic('Q');
         viewinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,ActionEvent.CTRL_MASK));
         information.add(viewinformation);
        
          JMenu user=new JMenu("USER");
          user.setForeground(Color.BLUE);
          mb.add(user);
          
          JMenuItem paybill=new JMenuItem("paybill");
         paybill.setMnemonic('R');
         paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
         user.add(paybill);
          
         
         JMenuItem billdetails=new JMenuItem("bill details");
         billdetails.setMnemonic('B');
         billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        user.add(billdetails);
          
          
          
          
          
          
        
         
        setLayout(new FlowLayout());
        
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new proj();
    }
    
}
