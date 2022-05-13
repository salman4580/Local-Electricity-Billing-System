
package electricity.adop;

import javax.swing.*;

public  class welcome extends JFrame implements Runnable{
    Thread t;
    welcome()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/welcome.jpg"));
        
        
        
        JLabel image=new JLabel(i1);
        add(image);
        setSize(200,451);
       
        setVisible(true);
        int x=1;
        for(int i=2;i<600;i+=4,x+=1)
        {
            setSize(i+x,i);
            setLocation(536-((i+x)/2),467-(i/2));
            
                try {
                    Thread.sleep(10);
                } catch(Exception e) {
                    e.printStackTrace();
                }    
        }
        t=new Thread(this);
        t.start();
        setVisible(true);
    }
    
    public void run(){
        try{
           Thread.sleep(7000);
           setVisible(false);
           new spalsh();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        new welcome();
    }
    
}
