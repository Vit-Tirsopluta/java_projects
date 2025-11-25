package lab10;
import javax.swing.*;
import java.awt.Point;

public class lab10{
    public static void main(String args[]){
        JFrame myFrame = new JFrame("Приховане вікно");
        myFrame.setBounds(50, 60, 400,300);
        myFrame.setVisible(true);
        Point location = myFrame.getLocation();
        int x = location.x;
        int y = location.y;

        myFrame.setResizable(true);

        
        System.out.println("Window's location x is = " + myFrame.getX() + ", location y = " + myFrame.getY());
        System.out.println("Window's location x and y are = " + myFrame.getLocation());
        System.out.println("Window's location x and y are = " + myFrame.getBounds());
        System.out.println("X: " + x + ", Y: " + y);

        System.out.println("Window's title is " + myFrame.getTitle());
        System.out.println("Window's state is " + myFrame.getState());
    }
}

class Lab10_Method2 extends JFrame {
    public Lab10_Method2() {
        super("Приховане вікно");
        setBounds(50, 60, 400, 300);

        setVisible(false);
    }

    public static void main(String[] args) {
        Lab10_Method2 myFrame = new Lab10_Method2();

        System.out.println("Спосіб 2 (через успадкування):");
        System.out.println("Window's location is x = " + myFrame.getX() + ", location y = " + myFrame.getY());
        System.out.println("Window's title is " + myFrame.getTitle());
        
        System.out.println("Window's state is " + myFrame.getExtendedState());
    }
}