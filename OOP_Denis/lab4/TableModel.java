package OOP_Denis.lab4;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
public class TableModel extends AbstractTableModel{
    ArrayList<Ship> ships;
    TableModel(ArrayList<Ship> ships) {
        super();
        this.ships = ships;
    }

    @Override
    public int getRowCount() {
        return ships.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int c) {
        String result = "";
        switch(c) {
            case 0:
                result = "Название";
                break;
            case 1:
                result = "Пассажировместимость";
                break;
            case 2:
                result = "Водоизмещение, т";
                break;
            case 3:
                result = "Длина корабля, м";
                break;
            case 4:
                result = "Скорость, км/ч";
                break;
            case 5:
                result = "Российское судно";
        }
        return result;
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0,c).getClass();
    }

    @Override
    public Object getValueAt(int r, int c) {
        switch (c) {
            case 0: return ships.get(r).getName();
            case 1: return ships.get(r).getPass();
            case 2: return ships.get(r).getDisp();
            case 3: return ships.get(r).getLength();
            case 4: return ships.get(r).getSpeed();
            case 5: return ships.get(r).getIsRus();
            default: return "";
        }
    }

}
