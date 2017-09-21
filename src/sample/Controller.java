package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Controller extends JFrame{
    JButton b1, b2;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    int i, k, z,x;
    String a,b, n1, n2;
    eHandler handler = new eHandler();

    public Controller(String s){
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("Посчитать");
        b2 = new JButton("Очистить");
        l1 = new JLabel("Введите первое число");
        l2 = new JLabel("Введите второе число");
        l3 = new JLabel("Введите третье число");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
    }
    public class eHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                if (e.getSource() == b1) {
                    i = Integer.parseInt(t1.getText());
                    i++;
                    a = "Ваше число тепрь " + i;
                    l1.setText(a);
                    k = Integer.parseInt(t2.getText());
                    k++;
                    b = "Ваше число теперь " + k;
                    l2.setText(b);
                }
                if (e.getSource() == b2) {
                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);
                }
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Введите в поле число!!!");
               // if(t1.)
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);}
        }
    }
    public void Scan(){
        try {
            n1 = JOptionPane.showInputDialog("Введите первое число");
            n2 = JOptionPane.showInputDialog("Введите второе число");
            z = Integer.parseInt(n1);
            x = Integer.parseInt(n2);
        }catch(Exception ex){JOptionPane.showMessageDialog(null, "Введите в поле число!!!");}
    }
    public void Scan(int a, int b){
        JOptionPane.showMessageDialog(null, "теперь ваше первое число = " +a);
        JOptionPane.showMessageDialog(null, "теперь ваше второе число = " +b);
    }
}
