package premir;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.*;

public class teamtable extends JFrame {

    public teamtable(String datateam[][]) {
        String data[][] = datateam;
        JTextArea trea;
        JScrollPane scroll;
        JLabel labelText,labelLogo,labelLogotxt;
        JTable tableXD;
        JPanel Jhead;
        Object columns[] = { "#", "TeamID","TeamName"};
        Object[][] object = new Object[data.length][];
        for (int i = 0; i < data.length; i++) {
            object[i] = data[i];
        }
        TableModel model = new DefaultTableModel(object, columns) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 0 ? ImageIcon.class : Object.class;
            }

            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableXD = new JTable(model);
        TableColumn column = tableXD.getColumnModel().getColumn(0);
        column.setCellRenderer(new ImageRenderer());
        JTableHeader header = tableXD.getTableHeader();
        tableXD.setDefaultRenderer(Object.class, new CenteredCellRenderer()); // Set custom cell renderer
        tableXD.getTableHeader().setReorderingAllowed(false); // Disable column reordering
        header.setBackground(new Color(52, 0, 64));
        header.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
        header.setForeground(new Color(242, 5, 92));
        tableXD.setGridColor(new Color(242, 5, 92));
        tableXD.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        tableXD.setRowHeight(100);
        tableXD.setSelectionBackground(Color.WHITE);
        tableXD.setSelectionForeground(new Color(242, 5, 92));
        scroll = new JScrollPane(tableXD);
        scroll.setForeground(Color.YELLOW);
        scroll.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
                g.setColor(new Color(52, 0, 64));
                g.fillRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height);
            }
        });
        Jhead = new JPanel();
        Jhead.setLayout(new BorderLayout());
        labelLogo = new JLabel();
        // labelLogo.setText("OK");
        ImageIcon icon = new ImageIcon("logo/premier-league-logo.png");
        Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(850, 250, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
        labelLogo.setIcon(scaledIcon);
        labelLogo.setHorizontalAlignment(JLabel.CENTER); // Center the image horizontally
        labelLogo.setVerticalAlignment(JLabel.CENTER); // Center the image vertically
        Jhead.add(labelLogo,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(Jhead, BorderLayout.NORTH);
        c.add(scroll, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
    }
}
