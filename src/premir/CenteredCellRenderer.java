package premir;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

class CenteredCellRenderer extends DefaultTableCellRenderer {
    public CenteredCellRenderer() {
        setHorizontalAlignment(JLabel.CENTER);
        setVerticalAlignment(JLabel.CENTER);
    }
}