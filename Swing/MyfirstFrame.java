import javax.swing.*;
import java.awt.*;
class MyfirstFrame{
public static void main(String args[]){
JFrame frame=new JFrame();
frame.setVisible(true);//for visible the frame
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//click on close button command were terminate
//frame.setSize(700,500);//set the frame size
//frame.setLocation(100,50);//set the frame location
frame.setBounds(100,100,1000,500);//set the location left top right bottom
frame.setTitle("My Frame");//set the title of the frame

//set the image icon
ImageIcon icon=new ImageIcon("prince.png");
frame.setIconImage(icon.getImage());

//change the backgraoun color
Container c= frame.getContentPane();
//Color color=new Color(255,0,0); you define your own color
c.setBackground(Color.RED);

//Resizable
frame.setResizable(false);
}
}