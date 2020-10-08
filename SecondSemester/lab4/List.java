package SecondSemester.lab4;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
public class List implements TableCellRenderer{
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JTextField editor = new JTextField();
        if (value != null) {
            editor.setText(value.toString());
            editor.setBackground((row % 2 == 0) ? Color.GRAY : Color.YELLOW);
        }
        return editor;
    }
}
class BoolRenderer extends DefaultTableCellRenderer {
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JCheckBox editor = new JCheckBox();
        Boolean b = (Boolean)value;
        editor.setBackground((b)? Color.GREEN: Color.RED);
        editor.setSelected(b);
        editor.setHorizontalAlignment(SwingConstants.CENTER);
        return editor;
    }
}


