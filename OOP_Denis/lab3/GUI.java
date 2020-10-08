package OOP_Denis.lab3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI extends JFrame{
    public GUI() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLocation(50,50);
        frame.setTitle("Лабораторная работа №3");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        JPanel pnl = new JPanel();
        JCheckBox checkBox1 = new JCheckBox("1-й флажок");
        JCheckBox checkBox2 = new JCheckBox("2-й флажок");
        JCheckBox checkBox3 = new JCheckBox("3-й флажок");
        JTextField textField = new JTextField(30);
        textField.setText("Количество активных флажков: 0");
        textField.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl.add(checkBox1);
        pnl.add(checkBox2);
        pnl.add(checkBox3);
        pnl.add(textField);
        frame.add(pnl);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.pack();



        ActionListener listenerCount = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int count = 0;
                textField.setText("Количество активных флажков: " + count);
                if (checkBox1.isSelected()) {
                    count++;
                    textField.setText("Количество активных флажков: " + count);
                }
                if (checkBox2.isSelected()) {
                    count++;
                    textField.setText("Количество активных флажков: " + count);
                }
                if (checkBox3.isSelected()) {
                    count++;
                    textField.setText("Количество активных флажков: " + count);
                }

            }
        };

        checkBox1.addActionListener(listenerCount);
        checkBox2.addActionListener(listenerCount);
        checkBox3.addActionListener(listenerCount);






    }



    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}

