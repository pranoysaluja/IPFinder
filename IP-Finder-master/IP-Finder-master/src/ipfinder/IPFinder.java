package ipfinder;

import javax.swing.*;
import java.awt.event.*;
import java.net.*;


public class IPFinder extends JFrame implements ActionListener{     //The Java ActionListener is notified whenever you click on the button or menu item. It is notified against ActionEvent. The ActionListener interface is found in java.awt.event package. It has only one method: actionPerformed(). 
  //To determine where the user clicked on the screen, Java provides an interface called "ActionListener" through which we determine where the user clicked and generates an event to perform several tasks, like calculation, print a value, print a specific character, etcetera using a button.
    JLabel l;
    JTextField tf;
    JButton b;
    
    IPFinder(){
        super("IP Finder Tool");
       l= new JLabel ("Enter Address/URL"); 
       l.setBounds(50,70,150,20);                       //setBounds(int x-coordinate, int y-coordinate, int width, int height)
       tf=new JTextField();
       tf.setBounds(50,100,200,20);
       
       
       b=new JButton("Find IP");
       b.setBounds(50,150,80,30);
       b.addActionListener(this);
       add(l);
       add(tf);
       add(b);
       setSize(300,300);
       setLayout(null);
       setVisible(true);
       
    }
   
    public void actionPerformed(ActionEvent e){                             // Override the actionPerformed() method
        String url = tf.getText();
        try{
            InetAddress ia = InetAddress.getByName(url);
            String ip = ia.getHostAddress();
            JOptionPane.showMessageDialog(this,ip);
        } catch (UnknownHostException e1){
            JOptionPane.showMessageDialog(this, e1.toString());
        }
    }
 
    public static void main(String[] args) {
       new IPFinder();
    }
    
}



//How to write ActionListener
//The common approach is to implement the ActionListener. If you implement the ActionListener class, you need to follow 3 steps:
//
//1) Implement the ActionListener interface in the class:
//
//public class ActionListenerExample Implements ActionListener  
//2) Register the component with the Listener:
//
//component.addActionListener(instanceOfListenerclass);  
//3) Override the actionPerformed() method:
//
//public void actionPerformed(ActionEvent e){  
//           //Write the code here  
//}  





//The javax.swing.JFrame class is a type of container which inherits the java.awt.Frame class. JFrame works like the main window where components like labels, buttons, textfields are added to create a GUI.



