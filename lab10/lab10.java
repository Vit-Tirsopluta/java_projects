package lab10;
import javax.swing.JFrame;

public class lab10{
    public static void main(String args[]){
        JFrame myFrame = new JFrame("Приховане вікно");
        myFrame.setBounds(50, 60, 400,300);
        myFrame.setVisible(false);
        System.out.println("Window's location is x = " + myFrame.getX() + ", location y = " + myFrame.getY());
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