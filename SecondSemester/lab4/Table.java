package SecondSemester.lab4;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
public class Table implements TableModelListener{
    ArrayList<Computer> computers;
    JTable tbl;
    TableModel tableModel;
    public Table() throws ParseException {
        JFrame frm = new JFrame("Компьютеры");
        JPanel pnltbl = new JPanel();
        JPanel pnledt = new JPanel();
        pnltbl.setLayout(new BorderLayout());
        JTextField name = new JTextField(20);
        JTextField type = new JTextField(10);
        JTextField os = new JTextField(15);
        JTextField price = new JTextField(10);
        JTextField count = new JTextField(10);
        JCheckBox isAvalaible = new JCheckBox();
        JButton bAdd = new JButton("Добавить");
        JButton bDelete = new JButton("Удалить");
        bAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent al) {
                try {
                    computers.add(new Computer(name.getText(), type.getText(), os.getText(), Integer.valueOf(price.getText()), Double.valueOf(count.getText()), isAvalaible.isSelected()));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                ((AbstractTableModel) tableModel).fireTableDataChanged();
                tbl.updateUI();
            }

        });
        bDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name.setText("");
                type.setText("");
                os.setText("");
                price.setText("");
                count.setText("");
                isAvalaible.setSelected(false);
            }
        });

        frm.setLayout(new BorderLayout());
        frm.setSize(1000, 700);
        frm.setLocation(300, 300);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Computer[] comp = new Computer[9];
        comp[0] = new Computer("Acer Aspire TC-885 DG.E0XER.015",
                "Intel Core i5-9400F",
                "Windows 10 Домашняя 64",
                43990,
                2.9,
                false);
        comp[1] = new Computer("Acer SF315-52G-52TJ NX.GZAER.003",
                "Intel Core i5-8250U",
                "Windows 10 Домашняя 64",
                49990,
                1.6,
                true);
        comp[2] = new Computer("HP Pavilion Gaming 690-0045ur 7EA44EA",
                "Intel Core i5-9400F",
                "Windows 10 Домашняя 64",
                63660,
                2.9,
                false);
        comp[3] = new Computer("Apple MacBook Pro 13 TB i5 1,4/8Gb/128GB",
                "Intel Core i5",
                "macOS",
                109990,
                1.4,
                true);
        comp[4] = new Computer("HP Pavilion Gaming 15-dk0090ur 8TY32EA",
                "Intel Core i5-9300H",
                "Windows 10 Домашняя 64",
                59990,
                2.4,
                true);
        comp[5] = new Computer("Apple Mac Mini i5 3.0/8Gb/256Gb",
                "Intel Core i5",
                "macOS",
                85990,
                3.0,
                false);
        comp[6] = new Computer("ASUS R540BA-GQ194T",
                "AMD A6-9225 2.6ГГц",
                "Windows 10 Домашняя 64",
                24990,
                2.6,
                true);
        comp[7] = new Computer("MSI Trident 3 9SI-442RU",
                "Intel Core i5-9400F",
                "Windows 10 Домашняя 64",
                82490,
                2.9,
                false);
        comp[8] = new Computer("HP Slim 290-a0010ur 7GP59EA",
                "AMD A6-9225",
                "Windows 10 Домашняя 64",
                22990,
                2.6,
                false);
        computers = new ArrayList<>(Arrays.asList(comp));
        tableModel = new TableModel(computers);
        tableModel.addTableModelListener(tbl);
        tbl = new JTable(tableModel);
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableModel);
        tbl.setRowSorter(sorter);
        JScrollPane scroll = new JScrollPane(tbl);
        tbl.setPreferredScrollableViewportSize(new Dimension(600, 100));
        pnltbl.add(scroll);
        pnledt.add(name);
        pnledt.add(type);
        pnledt.add(os);
        pnledt.add(price);
        pnledt.add(count);
        pnledt.add(isAvalaible);
        pnledt.add(bAdd);
        pnledt.add(bDelete);
        frm.getContentPane().add(pnltbl, BorderLayout.CENTER);
        frm.getContentPane().add(pnledt, BorderLayout.SOUTH);
        frm.pack();
        tbl.setDefaultRenderer(Object.class, new List());
        tbl.setDefaultRenderer(Boolean.class, new BoolRenderer());
        frm.setVisible(true);

    }


    public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int column = e.getColumn();
        TableModel model = (TableModel)e.getSource();
        String columnName = model.getColumnName(column);
        Object data = model.getValueAt(row, column);
    }

    public static void main(String[] args){
        try{
            new Table();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }

}
