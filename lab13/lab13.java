package lab13;

import java.awt.*;
import java.awt.event.*;

public class lab13 extends Frame implements ActionListener, ItemListener {

    String actionMessage = "Остання дія: нічого";
    String checkboxMessage = "Стан Автопідбору: OFF";

    public lab13() {
        super("Лабораторна 13 - Варіант 10");
        
        MenuBar myMenuBar = new MenuBar();
        setMenuBar(myMenuBar);

        Menu menuFormat = new Menu("Формат");

        Menu submenuBackground = new Menu("Фон");
        MenuItem itemFill = new MenuItem("Способи заливки");
        MenuItem itemWatermark = new MenuItem("Підкладка");
        itemFill.addActionListener(this);
        itemWatermark.addActionListener(this);
        submenuBackground.add(itemFill);
        submenuBackground.add(itemWatermark);

        Menu submenuFrame = new Menu("Рамка");
        MenuItem itemHeader = new MenuItem("Заголовок");
        MenuItem itemNewPage = new MenuItem("Нова сторінка");
        itemHeader.addActionListener(this);
        itemNewPage.addActionListener(this);
        submenuFrame.add(itemHeader);
        submenuFrame.add(itemNewPage);

        menuFormat.add(submenuBackground);
        menuFormat.add(submenuFrame);

        Menu menuTable = new Menu("Таблиця");

        CheckboxMenuItem checkAutofit = new CheckboxMenuItem("Автопідбір");
        checkAutofit.setState(true);
        menuTable.add(checkAutofit);

        menuTable.addSeparator();

        MenuItem itemFormula = new MenuItem("Формула");
        itemFormula.addActionListener(this);
        menuTable.add(itemFormula);

        myMenuBar.add(menuFormat);
        myMenuBar.add(menuFormat);
        myMenuBar.add(menuTable);

        setSize(500, 300);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        actionMessage = "Ви обрали пункт: " + command;
        repaint();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            checkboxMessage = "Стан Автопідбору: ON (Включено)";
        } else {
            checkboxMessage = "Стан Автопідбору: OFF (Вимкнено)";
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.setFont(new Font("Serif", Font.BOLD, 14));
        g.drawString(actionMessage, 20, 100);
        g.drawString(checkboxMessage, 20, 130);
    }

    public static void main(String[] args) {
        new lab13();
    }
}