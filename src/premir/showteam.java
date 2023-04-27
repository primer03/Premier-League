package premir;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class showteam extends JFrame {
    private String dataTeamtol[][];
    JPanel panelxd = new JPanel();
    JPanel panelteam = new JPanel();
    JPanel panelMiXD = new JPanel();

    public showteam(String name, String[][] team, String[][] datateamXD) {
        int num = 0;
        dataTeamtol = datateamXD;
        JPanel Mainpanel = new JPanel();
        Mainpanel.setLayout(new GridLayout(38, 1, 5, 5));
        for (int i = 0; i < 38; i++) {
            JPanel mmp = new JPanel();
            mmp.setLayout(new BorderLayout());
            JPanel ttp = new JPanel();
            ttp.setLayout(new GridLayout(1, 5, 5, 5));
            ArrayList alist = new ArrayList();
            for (int j = 0; j < team[i].length; j++) {
                alist.add(team[i][j]);
            }

            String dataMathXd[][] = new String[10][4];
            for (int j = 0; j < alist.size(); j++) {
                // System.out.println(alist.get(j).toString());
                dataMathXd[j] = alist.get(j).toString().split(",");
            }
            for (int j = 0; j < dataMathXd.length; j++) {
                if (dataMathXd[j][0].equals(name) || dataMathXd[j][1].equals(name)) {
                    // System.out.println(dataMathXd[j][0]+" "+dataMathXd[j][1]+"
                    // "+dataMathXd[j][2]);
                    JLabel homelabel = new JLabel();
                    ImageIcon icon = new ImageIcon(getimg(dataMathXd[j][0]));
                    Image img = icon.getImage();
                    Image scaledImg = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                    ImageIcon scaledIcon = new ImageIcon(scaledImg);
                    homelabel.setIcon(scaledIcon);
                    homelabel.setHorizontalAlignment(JLabel.CENTER);
                    JLabel awaylabel = new JLabel();
                    ImageIcon iconaway = new ImageIcon(getimg(dataMathXd[j][1]));
                    Image imgaway = iconaway.getImage();
                    Image scaledImgaway = imgaway.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                    ImageIcon scaledIconaway = new ImageIcon(scaledImgaway);
                    awaylabel.setIcon(scaledIconaway);
                    awaylabel.setHorizontalAlignment(JLabel.CENTER);
                    JLabel labelscorehome = new JLabel(dataMathXd[j][2]);
                    labelscorehome.setHorizontalAlignment(JLabel.CENTER);
                    JLabel labelscoreaway = new JLabel(dataMathXd[j][3]);
                    labelscoreaway.setHorizontalAlignment(JLabel.CENTER);
                    JLabel versus = new JLabel("Match " + (i + 1));
                    versus.setHorizontalAlignment(JLabel.CENTER);
                    ttp.add(homelabel);
                    ttp.add(labelscorehome);
                    ttp.add(versus);
                    ttp.add(labelscoreaway);
                    ttp.add(awaylabel);
                }
            }
            mmp.add(ttp, BorderLayout.CENTER);
            mmp.setBorder(BorderFactory.createLineBorder(new Color(242, 5, 92)));
            Mainpanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            Mainpanel.add(mmp);
        }
        pack();
        setTitle(name);
        setSize(500, 720);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(Mainpanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(10);
        c.add(scrollPane, BorderLayout.CENTER);
        setVisible(true);
        setResizable(false);
        setIconImage(new ImageIcon(getimg(name)).getImage());
    }

    public String getimg(String teamname) {
        for (int i = 0; i < dataTeamtol.length; i++) {
            for (int j = 0; j < dataTeamtol[j].length; j++) {
                if (dataTeamtol[i][j].equals(teamname)) {
                    return dataTeamtol[i][0];
                }
            }
        }
        return "";
    }
}
