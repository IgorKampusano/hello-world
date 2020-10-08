package OOP_Denis.lab4;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
public class Table implements TableModelListener{
    ArrayList<Ship> shipsAL;
    JTable tbl;
    TableModel tableModel;
    public Table() throws ParseException {
        JFrame frm = new JFrame("Корабли");
        JPanel pnltbl = new JPanel();
        JPanel pnledt = new JPanel();
        pnltbl.setLayout(new BorderLayout());
        JTextField name = new JTextField(20);
        JTextField pass = new JTextField(10);
        JTextField disp = new JTextField(15);
        JTextField length = new JTextField(10);
        JTextField speed = new JTextField(10);
        JCheckBox isRus = new JCheckBox();
        JButton bAdd = new JButton("Добавить");
        JButton bDelete = new JButton("Удалить");

        bAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent al) {
                try {
                    shipsAL.add(new Ship(name.getText(), Integer.valueOf(pass.getText()), Double.valueOf(disp.getText()), Double.valueOf(length.getText()), Double.valueOf(speed.getText()), isRus.isSelected()));
                }
                catch (NumberFormatException e){
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
                pass.setText("");
                disp.setText("");
                length.setText("");
                speed.setText("");
                isRus.setSelected(false);
            }
        });

        frm.setLayout(new BorderLayout());
        frm.setSize(1000, 700);
        frm.setLocation(300, 300);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ship[] ships = new Ship[9];
        ships[0] = new Ship("Knock Nevis",
                40,
                600.000,
                458.45,
                21.1,
                false);
        ships[1] = new Ship("Harmony of the Seas",
                6500,
                550.000,
                362.12,
                20.5,
                false);
        ships[2] = new Ship("Зороастр",
                40,
                590.000,
                56.0,
                18.52,
                true);
        ships[3] = new Ship("Symphony of the Seas",
                6680,
                598.000,
                228.081,
                21.5,
                false);
        ships[4] = new Ship("Тимофей Гуженко",
                45,
                560.000,
                257.0,
                29.1,
                true);
        ships[5] = new Ship("MSC Meraviglia",
                4500,
                540.000,
                315.83,
                42.04,
                false);
        ships[6] = new Ship("Liberty of the Seas",
                4370,
                230.000,
                338.0,
                40.74,
                false);
        ships[7] = new Ship("Балт Флот 16",
                30,
                530.000,
                140.85,
                18.52,
                true);
        ships[8] = new Ship("Академик Пашин",
                30,
                540.000,
                123.3,
                17.03,
                true);

        shipsAL = new ArrayList<>(Arrays.asList(ships));
        tableModel = new TableModel(shipsAL);
        tableModel.addTableModelListener(tbl);
        tbl = new JTable(tableModel);
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableModel);
        tbl.setRowSorter(sorter);
        JScrollPane scroll = new JScrollPane(tbl);
        tbl.setPreferredScrollableViewportSize(new Dimension(600, 100));
        pnltbl.add(scroll);
        pnledt.add(name);
        pnledt.add(pass);
        pnledt.add(disp);
        pnledt.add(length);
        pnledt.add(speed);
        pnledt.add(isRus);
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
