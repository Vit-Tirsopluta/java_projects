package lab10;
import javax.swing.JFrame;

public class lab10{
    public static void main(String args[]){
        JFrame myFrame = new JFrame("Приховане вікно");
        myFrame.setBounds(50, 60, 400,300);
        myFrame.setVisible(true);
        System.out.println("Window's location is x = " + myFrame.getX() + ", location y = " + myFrame.getY());
        System.out.println("Window's title is " + myFrame.getTitle());
        System.out.println("Window's state is " + myFrame.getState());
    }
}