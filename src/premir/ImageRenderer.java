package premir;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

class ImageRenderer extends DefaultTableCellRenderer {
    JLabel lbl = new JLabel();
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof ImageIcon) {
            lbl.setIcon((ImageIcon) value);
        } else {
            try {
                Image img = ImageIO.read(new File(value.toString()));
                ImageIcon icon = new ImageIcon(img.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
                lbl.setIcon(icon);
                lbl.setHorizontalAlignment(JLabel.CENTER); // Center the icon horizontally
                lbl.setVerticalAlignment(JLabel.CENTER); // Center the icon vertically
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return lbl;
    }
}