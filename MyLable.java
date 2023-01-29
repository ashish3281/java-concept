import javax.swing.*;
import java.awt.*;

class MyLable{
public static void main(String args[]){
JFrame frame=new JFrame();
frame.setVisible(true);//for visible the frame
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//click on close button command were terminate
frame.setBounds(100,100,1000,500);//set the location left top right bottom
Container c= frame.getContentPane();
c.setLayout(null);


//JLabel label=new JLabel("Username");
//label.setBounds(100,50,200,30);

//Font font=new Font("Arial",Font.PLAIN,30);
//label.setFont(font);

//label.setText("Password");
//c.add(label);


//ImageIcon icon=new ImageIcon("prince.png");
//JLabel label=new JLabel(icon);
//label.setBounds(100,50,icon.getIconWidth(),icon.getIconHeight());
//c.add(label);

ImageIcon icon=new ImageIcon("prince.png");
JLabel label=new JLabel("Text",icon,JLabel.CENTER);
label.setBounds(0,100,500,100);
c.add(label);
}
}