package SecondSemester.lab3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI {
    public GUI() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLocation(50, 50);
        frame.setTitle("Лабораторная работа №3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setResizable(true);
        JPanel pnl = new JPanel();
        JMenu mFile = new JMenu("Файл");
        JMenuItem miOpen = new JMenuItem("Открыть");
        JMenuItem miClose = new JMenuItem("Закрыть");
        JMenuItem miSave = new JMenuItem("Сохранить");
        JMenuItem miEdit = new JMenuItem("Редактировать");
        JMenuBar mainMenu = new JMenuBar();
        JLabel label = new JLabel("Метка");
        mFile.add(miOpen);
        mFile.add(miClose);
        mFile.add(miSave);
        mFile.add(miEdit);
        mainMenu.add(mFile);
        frame.setJMenuBar(mainMenu);
        pnl.add(label);
        label.setFont(new Font("Serif", Font.PLAIN, 14));
        label.setSize(200,30);
        frame.add(pnl);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.pack();

        miOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Открыть");
                System.out.println("Открыть");
            }
        });

        miClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Закрыть");
                System.out.println("Закрыть");
            }
        });

        miSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Сохранить");
                System.out.println("Сохранить");
            }
        });

        miEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Редактировать");
                System.out.println("Редактировать");
            }
        });

    }

    public static void main(String[] args) {
        GUI app = new GUI();
    }
}
