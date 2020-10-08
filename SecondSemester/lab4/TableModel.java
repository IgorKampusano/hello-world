package SecondSemester.lab4;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
public class TableModel extends AbstractTableModel{
    ArrayList<Computer> comp;
    TableModel(ArrayList<Computer> comp) {
        super();
        this.comp = comp;
    }
    @Override
    public int getRowCount() {
        return comp.size();
    }
    @Override
    public int getColumnCount() {
        return 6;
    }
    @Override
    public String getColumnName(int c) {
        String result = "";
        switch (c) {
            case 0:
                result = "Название";
                break;
            case 1:
                result = "Процессор";
                break;
            case 2:
                result = "Операционная система";
                break;
            case 3:
                result = "Цена";
                break;
            case 4:
                result = "Частота процессора, ГГц";
                break;
            case 5:
                result = "Ноутбук";
                break;
        }
        return result;

    }
    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0,c).getClass();
    }
    @Override
    public Object getValueAt(int r, int c) {
        switch (c){
            case 0: return comp.get(r).getName();
            case 1: return comp.get(r).getType();
            case 2: return comp.get(r).getOS();
            case 3: return comp.get(r).getPrice();
            case 4: return comp.get(r).getCount();
            case 5: return comp.get(r).getIsAvailable();
            default: return "";
        }
    }

}
