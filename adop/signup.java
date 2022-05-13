
package electricity.adop;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class signup extends JFrame implements ActionListener{
    JButton create,back;
    signup()
    {
       
        setBounds(450,150,700,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JPanel panel=new JPanel();
        panel.setBounds(30,30,650,300);
        panel.setBorder(new TitledBorder(new LineBorder(new Color(173,216,230),2),"create account",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(172,216,230)));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        panel.setForeground(new Color(34,139,34));
        add(panel);
        
        
        JLabel heading =new JLabel("Create  account as");
        heading.setBounds(100,50,140,20);
        heading.setForeground(Color.GRAY);
        heading.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(heading);
        
        Choice accountType=new Choice();
        accountType.add("Admin");
        accountType.add("Customer");
        accountType.setBounds(260,50,150,20);
        panel. add(accountType);
       
       
        JLabel lblmeter =new JLabel("meter number");
        lblmeter.setBounds(100,90,140,20);
        lblmeter.setForeground(Color.GRAY);
        lblmeter.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(lblmeter);
        
        JTextField meter=new JTextField();
        meter.setBounds(260,90,150,20);
        panel.add(meter);
       
        JLabel lblusername =new JLabel("UserName");
        lblusername.setBounds(100,130,140,20);
        lblusername.setForeground(Color.GRAY);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(lblusername);
        
        JTextField username=new JTextField();
        username.setBounds(260,130,150,20);
        panel.add(username);
       
        JLabel lblname =new JLabel("Name");
        lblname.setBounds(100,170,140,20);
        lblname.setForeground(Color.GRAY);
        lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(lblname);
        
        JTextField name=new JTextField();
        name.setBounds(260,170,150,20);
        panel.add(name);
       
       JLabel lblpassword =new JLabel("password");
        lblpassword.setBounds(100,210,140,20);
        lblpassword.setForeground(Color.GRAY);
        lblpassword.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(lblpassword);
        
        JTextField password=new JTextField();
        password.setBounds(260,210,150,20);
        panel.add(password);
        
        create =new JButton("crate");
        create.setBackground(Color.BLACK);
        create.setForeground(Color.WHITE);
        create.setBounds(140,250,120,25);
       create.addActionListener(this);
        panel.add(create);
        
          back =new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(300,250,120,25);
       back.addActionListener(this);
               
        panel.add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/signupImage.png"));
        Image i2= i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        
        JLabel image=new JLabel(i3);
        image.setBounds(410,30,250,250);
        panel.add(image);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==create){
            
        }else if(ae.getSource()==back){
            setVisible(false);
            new login();
        }
        
    }
    
    public static void main(String[]args)
    {
        new signup();
    }
    
}
