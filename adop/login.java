
package electricity.adop;


import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class login extends JFrame implements ActionListener{
    JButton login,cancel,signup;
    login()
    {
        super("login page");
        getContentPane().setBackground(Color.white);
        setLayout(null);
       
        
        JLabel lblusername=new  JLabel("Username");
        lblusername.setBounds(300,20,100,20);
        add(lblusername);
        
        JTextField username=new JTextField();
        username.setBounds(400,20,150,20);
        add(username);
       
        
        
        
        
         JLabel lblpassword=new  JLabel("Password");
        lblpassword.setBounds(300,60,100,20);
        add(lblpassword);
        
        
        
         JTextField password=new JTextField();
        password.setBounds(400,60,150,20);
        add(password);
       
        
        JLabel logininas=new  JLabel("login in as");
        logininas.setBounds(300,100,100,20);
        add(logininas);
       
        Choice loginin=new Choice();
        loginin.add("Admin");
        loginin.add("Customer");
        loginin.setBounds(400,100,150,20);
        add(loginin);
       
        
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg"));
      Image i2=i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
      ImageIcon i3=new ImageIcon(i2);
      JLabel image=new JLabel(i3);
      image.setBounds(0, 0, 250, 250);
      add(image);
        
        
         login=new JButton("Login");
        login.setBounds(330, 160, 100, 20);
        login.addActionListener(this);
        add(login);
        
         cancel=new JButton("Cancel");
        cancel.setBounds(450, 160, 100, 20);
         cancel.addActionListener(this);
        add(cancel);
         
         signup=new JButton("Signup");
        signup.setBounds(380, 200, 100, 20);
         signup.addActionListener(this);
        add(signup);
        
        setSize(640,300);
       setLocation(400, 200);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login)
        {
    }else if(ae.getSource()==cancel){
        setVisible(false);
        
    }else if(ae.getSource()==signup){
        setVisible(false);
        new signup();
        
    }
    }
    

    public static void main(String[]args)
    {
        new login();
    }
}
