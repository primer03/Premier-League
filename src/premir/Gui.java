package premir;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import team.*;
import java.util.List;










///gregiergioerge
///gregergerg



public class Gui extends JFrame implements ActionListener {
    String dataTeamtol[][];
    JTextField TextScore[][] = new JTextField[38][10];
    JTextField TextScore2[][] = new JTextField[38][10];
    JButton btnScore[] = new JButton[38];
    JButton btnsave[] = new JButton[38];
    String Mathdata[][];
    Standings[] strStandings;
    Match[][] mathxd;
    String teamName[] = new String[20];
    JTable table;
    String[][] dataStrading = new String[20][10];
    DefaultTableModel tableModel;
    JLabel lalogo = new JLabel();
    JLabel lateam = new JLabel();
    JButton btnnew;
    String Datamarray[][];

    public Gui() throws FileNotFoundException {
        mathxd = new Match[38][10];
        readfile.setPathfile("data/team.dat");
        dataTeamtol = readfile.getDataarr();
        strStandings = new Standings[20];
        for (int i = 0; i < teamName.length; i++) {
            teamName[i] = dataTeamtol[i][2];
            strStandings[i] = new Standings(dataTeamtol[i][2], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }
        // PremierLeagueT pre = new PremierLeagueT(teamName);
        // pre.generateFixtures();
        FileWriter writer;
        Scanner scanner = new Scanner(new File("data/Match.dat"));
        if (!scanner.hasNext()) {
            // Mathdata = pre.getMathteam();
            createfile cf = new createfile();
            cf.createmath();
            String rarray[] = new String[38];
            String Mrarray[][] = new String[38][10];
            int x = 0;
            Scanner scannerxd = new Scanner(new File("data/Match.dat"));
            while (scannerxd.hasNext()) {
                rarray[x] = scannerxd.nextLine();
                x++;
            }
            for (int i = 0; i < rarray.length; i++) {
                Mrarray[i] = rarray[i].split("\\|");
            }
            Mathdata = Mrarray;
        } else {
            String rarray[] = new String[38];
            String Mrarray[][] = new String[38][10];
            int x = 0;
            while (scanner.hasNext()) {
                rarray[x] = scanner.nextLine();
                x++;
            }
            for (int i = 0; i < rarray.length; i++) {
                Mrarray[i] = rarray[i].split("\\|");
            }
            Mathdata = Mrarray;
        }
        setTitle("Premier League");
        setSize(1280, 720);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Container cx = getContentPane();
        cx.setLayout(new BorderLayout());
        // cx.add(tm.getContentPane(),BorderLayout.CENTER);
        JButton openButton = new JButton("Open Another Window");
        JPanel panelcenter = new JPanel();
        panelcenter.setLayout(new GridLayout(38, 1, 5, 5));
        panelcenter.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JPanel panelwest = new JPanel();
        panelwest.setLayout(new GridLayout(38, 1, 5, 5));
        panelwest.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // panelcenter.setPreferredSize(new Dimension(200,720));
        // for (int i = 0; i < 38; i++) {
        // JPanel panelXD = new JPanel();
        // panelXD.setPreferredSize(new Dimension(200, 500));
        // panelXD.setBorder(BorderFactory.createLineBorder(new Color(52, 0, 64)));
        // panelXD.setLayout(new BorderLayout());
        // JLabel Roundxd = new JLabel("Week " + (i + 1));
        // // Roundxd.setBorder(BorderFactory.createLineBorder(new Color(52, 0, 64)));
        // Roundxd.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        // Roundxd.setOpaque(true);
        // Roundxd.setBackground(new Color(52, 0, 64));
        // Roundxd.setForeground(new Color(242, 5, 92));
        // Roundxd.setHorizontalAlignment(JLabel.CENTER);
        // panelXD.add(Roundxd, BorderLayout.NORTH);
        // JPanel panelteam = new JPanel();
        // panelteam.setLayout(new GridLayout(10, 3, 2, 2));
        // // System.out.println(Mathdata[0][0].length());
        // ArrayList alist = new ArrayList();
        // for (int j = 0; j < Mathdata[i].length; j++) {
        // alist.add(Mathdata[i][j]);
        // }
        // String dataMathXd[][] = new String[10][2];
        // for (int j = 0; j < alist.size(); j++) {
        // dataMathXd[j] = alist.get(j).toString().split(",");
        // }
        // for (int j = 0; j < 10; j++) {
        // // String rounData[][] = new String[10][2];
        // // rounData[i] = Mathdata[i-1][j].split("\\|");
        // JLabel homelabel = new JLabel();
        // ImageIcon icon = new ImageIcon(getimg(dataMathXd[j][0]));
        // // System.out.println();
        // Image img = icon.getImage();
        // Image scaledImg = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        // ImageIcon scaledIcon = new ImageIcon(scaledImg);
        // homelabel.setIcon(scaledIcon);
        // homelabel.setHorizontalAlignment(JLabel.CENTER);
        // JLabel awaylabel = new JLabel();
        // ImageIcon iconaway = new ImageIcon(getimg(dataMathXd[j][1]));
        // Image imgaway = iconaway.getImage();
        // Image scaledImgaway = imgaway.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        // ImageIcon scaledIconaway = new ImageIcon(scaledImgaway);
        // awaylabel.setIcon(scaledIconaway);
        // awaylabel.setHorizontalAlignment(JLabel.CENTER);
        // panelteam.add(homelabel);
        // JLabel versus = new JLabel("VS");
        // versus.setHorizontalAlignment(JLabel.CENTER);
        // panelteam.add(versus);
        // panelteam.add(awaylabel);
        // // panelteam.add(new JLabel("VS"));
        // // panelteam.add(new JLabel("Leeds United"));
        // }
        // panelXD.add(panelteam, BorderLayout.CENTER);
        // panelcenter.add(panelXD);
        // }

        for (int i = 0; i < 38; i++) {
            JPanel panelXD = new JPanel();
            panelXD.setPreferredSize(new Dimension(200, 500));
            panelXD.setBorder(BorderFactory.createLineBorder(new Color(52, 0, 64)));
            panelXD.setLayout(new BorderLayout());
            JLabel Roundxd = new JLabel("Week " + (i + 1));
            Roundxd.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
            Roundxd.setOpaque(true);
            Roundxd.setBackground(new Color(52, 0, 64));
            Roundxd.setForeground(new Color(242, 5, 92));
            Roundxd.setHorizontalAlignment(JLabel.CENTER);
            panelXD.add(Roundxd, BorderLayout.NORTH);
            btnScore[i] = new JButton("ADD " + (i + 1));
            btnScore[i].setActionCommand("" + (i + 1));
            btnScore[i].setBackground(new Color(52, 0, 64));
            btnScore[i].setForeground(new Color(242, 5, 92));
            btnScore[i].setFocusPainted(false);
            btnScore[i].setBorder(new LineBorder(new Color(52, 0, 64)));
            btnScore[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            btnScore[i].setPreferredSize(new Dimension(200, 30));
            btnScore[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i < TextScore.length; i++) {
                        if (Integer.valueOf(e.getActionCommand()) - 1 == i) {
                            for (int j = 0; j < TextScore[i].length; j++) {
                                TextScore[i][j].setEditable(true);
                                TextScore2[i][j].setEditable(true);
                            }
                            btnsave[i].setEnabled(true);
                            btnScore[i].setEnabled(false);
                        } else {
                            for (int j = 0; j < TextScore[i].length; j++) {
                                TextScore[i][j].setEditable(false);
                                TextScore2[i][j].setEditable(false);
                            }
                            btnScore[i].setEnabled(false);
                        }
                    }
                }
            });
            JPanel panelbtn = new JPanel();
            panelbtn.setLayout(new GridLayout(1, 2, 2, 2));
            panelbtn.add(btnScore[i]);
            btnsave[i] = new JButton("SAVE");
            btnsave[i].setActionCommand("" + (i + 1));
            btnsave[i].setEnabled(false);
            btnsave[i].setBackground(new Color(242, 5, 92));
            btnsave[i].setForeground(new Color(52, 0, 64));
            btnsave[i].setFocusPainted(false);
            btnsave[i].setBorder(new LineBorder(new Color(242, 5, 92)));
            btnsave[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            btnsave[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    boolean checkvalue = true;
                    for (int i = 0; i < TextScore.length; i++) {
                        if (Integer.valueOf(e.getActionCommand()) - 1 == i) {
                            for (int j = 0; j < TextScore[i].length; j++) {
                                if ((TextScore[i][j].getText().equals("") || TextScore2[i][j].getText().equals(""))) {
                                    JOptionPane.showMessageDialog(null, "Data is null", "error",
                                            JOptionPane.ERROR_MESSAGE);
                                    checkvalue = false;
                                    break;
                                } else {
                                    if ((TextScore[i][j].getText().matches("[0-9]+$")
                                            && TextScore2[i][j].getText().matches("[0-9]+$"))) {
                                        checkvalue = true;
                                    } else {
                                        checkvalue = false;
                                        JOptionPane.showMessageDialog(null, "Not is Number", "error",
                                                JOptionPane.ERROR_MESSAGE);
                                        break;
                                    }
                                }
                            }
                            if (checkvalue == true) {
                                ArrayList alist = new ArrayList();
                                for (int j = 0; j < Mathdata[i].length; j++) {
                                    alist.add(Mathdata[i][j]);
                                }
                                String dataMathXd[][] = new String[10][2];
                                for (int j = 0; j < alist.size(); j++) {
                                    dataMathXd[j] = alist.get(j).toString().split(",");
                                }

                                for (int j = 0; j < TextScore[i].length; j++) {
                                    String wdl = "";
                                    TextScore[i][j].setEditable(false);
                                    TextScore2[i][j].setEditable(false);
                                    int homeid = getTeamid(dataMathXd[j][0]);
                                    int awayid = getTeamid(dataMathXd[j][1]);
                                    int goalhome = Integer.valueOf(TextScore[i][j].getText());
                                    int goalaway = Integer.valueOf(TextScore2[i][j].getText());

                                    mathxd[i][j] = new Match(dataMathXd[j][0], dataMathXd[j][1], goalhome, goalaway);
                                }
                                btnsave[i].setEnabled(false);
                                btnScore[i].setEnabled(true);
                            } else {
                                System.out.println("error");
                            }
                        } else {
                            for (int j = 0; j < TextScore[i].length; j++) {
                                TextScore[i][j].setEditable(false);
                                TextScore2[i][j].setEditable(false);
                            }
                            btnScore[i].setEnabled(true);
                        }
                    }
                    showMath();
                    updateTable();
                    oneTeam();
                    displayMatch();
                }

            });
            panelbtn.add(btnsave[i]);
            panelXD.add(panelbtn, BorderLayout.SOUTH);
            JPanel panelteam = new JPanel();
            panelteam.setLayout(new GridLayout(10, 3, 2, 2));
            // System.out.println(Mathdata[0][0].length());
            ArrayList alist = new ArrayList();
            for (int j = 0; j < Mathdata[i].length; j++) {
                alist.add(Mathdata[i][j]);
            }
            String dataMathXd[][] = new String[10][2];
            for (int j = 0; j < alist.size(); j++) {
                dataMathXd[j] = alist.get(j).toString().split(",");
            }
            for (int j = 0; j < 10; j++) {
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
                panelteam.add(homelabel);
                JLabel versus = new JLabel("VS");
                versus.setHorizontalAlignment(JLabel.CENTER);
                Scanner scannerMath = new Scanner(new File("data/dataMatch.dat"));
                String marray[] = new String[38];
                Datamarray = new String[38][10];
                int x = 0;
                while (scannerMath.hasNext()) {
                    marray[x] = scannerMath.nextLine();
                    x++;
                }
                for (int xo = 0; xo < marray.length; xo++) {
                    Datamarray[xo] = marray[xo].split("\\|");
                }
                ArrayList alistxd = new ArrayList();
                String dataMathXdSD[][] = new String[10][4];
                for (int xe = 0; xe < Datamarray[i].length; xe++) {
                    alistxd.add(Datamarray[i][xe]);
                }
                for (int xa = 0; xa < alistxd.size(); xa++) {
                    dataMathXdSD[xa] = alistxd.get(xa).toString().split(",");
                }

                TextScore[i][j] = new JTextField();
                TextScore[i][j].setHorizontalAlignment(JTextField.CENTER);
                TextScore[i][j].setEditable(false);
                TextScore[i][j].setText(dataMathXdSD[j][2]);
                TextScore2[i][j] = new JTextField();
                TextScore2[i][j].setHorizontalAlignment(JTextField.CENTER);
                TextScore2[i][j].setEditable(false);
                TextScore2[i][j].setText(dataMathXdSD[j][3]);
                mathxd[i][j] = new Match(dataMathXdSD[j][0], dataMathXdSD[j][1], Integer.valueOf(dataMathXdSD[j][2]),
                        Integer.valueOf(dataMathXdSD[j][3]));
                panelteam.add(TextScore[i][j]);
                panelteam.add(versus);
                panelteam.add(TextScore2[i][j]);
                panelteam.add(awaylabel);
                mathxd[i][j] = new Match(dataMathXdSD[j][0], dataMathXdSD[j][1], Integer.valueOf(dataMathXdSD[j][2]),
                        Integer.valueOf(dataMathXdSD[j][3]));
            }
            panelXD.add(panelteam, BorderLayout.CENTER);
            panelwest.add(panelXD);
        }
        showMath();
        createTable();
        oneTeam();
        JPanel panellist = new JPanel();
        panellist.setLayout(new GridLayout(20, 1, 5, 5));
        panellist.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        for (int k = 0; k < dataTeamtol.length; k++) {
            ImageIcon iconaways = new ImageIcon(dataTeamtol[k][0]);
            Image imgaways = iconaways.getImage();
            Image scaledImgaways = imgaways.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon scaledIconaways = new ImageIcon(scaledImgaways);
            btnnew = new JButton(dataTeamtol[k][2]);
            btnnew.setIcon(scaledIconaways);
            btnnew.setHorizontalAlignment(JButton.LEFT);
            btnnew.setActionCommand(dataTeamtol[k][2]);
            btnnew.setBackground(new Color(242, 5, 92));
            btnnew.setForeground(new Color(52, 0, 64));
            btnnew.setFocusPainted(false);
            btnnew.setBorder(new LineBorder(new Color(242, 5, 92)));
            btnnew.setCursor(new Cursor(Cursor.HAND_CURSOR));
            btnnew.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    showteam newFrame;
                    try {
                        newFrame = new showteam(e.getActionCommand(), readscore(), dataTeamtol);
                        newFrame.setLocationRelativeTo(null);
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }
                }

            });
            panellist.add(btnnew);
        }
        System.out.println(dataTeamtol.length);
        JScrollPane panelcenterscroll = new JScrollPane(panellist);
        panelcenterscroll.setWheelScrollingEnabled(true);
        panelcenterscroll.getVerticalScrollBar().setUnitIncrement(20);
        panelcenterscroll.setPreferredSize(new Dimension(300, 500));
        JScrollPane panelwestscroll = new JScrollPane(panelwest);
        panelwestscroll.setWheelScrollingEnabled(true);
        panelwestscroll.getVerticalScrollBar().setUnitIncrement(20);
        panelwestscroll.setPreferredSize(new Dimension(300, 720));
        cx.add(panelwestscroll, BorderLayout.WEST);
        JPanel panelEate = new JPanel();
        panelEate.setLayout(new BorderLayout());
        panelEate.add(panelcenterscroll, BorderLayout.NORTH);
        JPanel showTeam = new JPanel();
        showTeam.setLayout(new BorderLayout());
        showTeam.add(lateam, BorderLayout.NORTH);
        showTeam.add(lalogo, BorderLayout.CENTER);
        panelEate.add(showTeam, BorderLayout.CENTER);
        cx.add(panelEate, BorderLayout.EAST);
        JPanel Panelxen = new JPanel();
        Panelxen.setLayout(new BorderLayout());
        ImageIcon hicon = new ImageIcon("logo/premier-league-logo.png");
        Image image = hicon.getImage();
        Image scaledImage = image.getScaledInstance(300, 100, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newImageIcon = new ImageIcon(scaledImage);
        JLabel labelimges = new JLabel();
        labelimges.setIcon(newImageIcon);
        labelimges.setHorizontalAlignment(JLabel.CENTER);
        labelimges.setVerticalAlignment(JLabel.CENTER);
        Panelxen.add(labelimges, BorderLayout.NORTH);
        Panelxen.add(new JScrollPane(table), BorderLayout.CENTER);
        cx.add(Panelxen, BorderLayout.CENTER);
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teamtable window = new teamtable(dataTeamtol);
                window.setVisible(true);
            }
        });
        // showMath();
        setIconImage(new ImageIcon("logo/pngwing.png").getImage());
        setVisible(true);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Gui gui = new Gui();
    }

    public void actionPerformed(ActionEvent e) {

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

    public int getMath() {
        for (int i = 0; i < mathxd.length; i++) {
            for (int j = 0; j < mathxd[i].length; j++) {
                if (mathxd[i][j] == null) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void displayMatch() {
        try {
            File file = new File("data/dataMatch.dat");
            // if (file.delete()) {
            FileWriter writer;
            writer = new FileWriter("data/dataMatch.dat");
            for (int i = 0; i < mathxd.length; i++) {
                for (int j = 0; j < mathxd[i].length; j++) {
                    if (mathxd[i][j] != null) {
                        writer.write(mathxd[i][j].toString() + "|");
                    }
                }
                writer.write("\n");
            }
            writer.close();
            // } else {
            // System.err.println("NO");
            // }
        } catch (Exception e) {
            System.out.println("เกิดข้อผิดพลาด: " + e.getMessage());
        }
    }

    public void showMath() {
        strStandings = new Standings[20];
        for (int i = 0; i < teamName.length; i++) {
            teamName[i] = dataTeamtol[i][2];
            strStandings[i] = new Standings(dataTeamtol[i][2], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }
        List<Standings> standingsList = new ArrayList<>();
        for (int x = 0; x < strStandings.length; x++) {
            standingsList.add(strStandings[x]);
        }
        for (int i = 0; i < mathxd.length; i++) {
            for (int j = 0; j < mathxd[i].length; j++) {
                int homeid = getTeamid(mathxd[i][j].getTeamhome());
                int awayid = getTeamid(mathxd[i][j].getTeamaway());
                // System.out.println(mathxd[i][j].getTeamhome()+"
                // "+mathxd[i][j].getTeamaway());
                if (Integer.valueOf(mathxd[i][j].getScorehome()) > Integer.valueOf(mathxd[i][j].getScoreaway())) {
                    strStandings[homeid].setWon(strStandings[homeid].getWon() + 1);
                    strStandings[homeid].setPoints(strStandings[homeid].getPoints() + 3);
                    strStandings[homeid].setGoalsFor(strStandings[homeid].getGoalsFor() +
                            mathxd[i][j].getScorehome());
                    strStandings[homeid].setGoalsAgainst(strStandings[homeid].getGoalsAgainst() +
                            mathxd[i][j].getScoreaway());
                    strStandings[homeid].setGoalsScored(strStandings[homeid].getGoalsFor() -
                            strStandings[homeid].getGoalsAgainst());
                    strStandings[homeid].setGoalsConceded(strStandings[homeid].getGoalsAgainst()
                            - strStandings[homeid].getGoalsFor());
                    strStandings[awayid].setLost(strStandings[awayid].getLost() + 1);
                    strStandings[awayid].setGoalsFor(strStandings[awayid].getGoalsFor() +
                            mathxd[i][j].getScoreaway());
                    strStandings[awayid].setGoalsAgainst(strStandings[awayid].getGoalsAgainst() +
                            mathxd[i][j].getScorehome());
                    strStandings[awayid].setGoalsScored(strStandings[awayid].getGoalsFor() -
                            strStandings[awayid].getGoalsAgainst());
                    strStandings[awayid].setGoalsConceded(strStandings[awayid].getGoalsAgainst()
                            - strStandings[awayid].getGoalsFor());
                    strStandings[awayid].setPlayed(strStandings[awayid].getPlayed() + 1);
                    strStandings[homeid].setPlayed(strStandings[homeid].getPlayed() + 1);
                } else if (Integer.valueOf(mathxd[i][j].getScorehome()) < Integer
                        .valueOf(mathxd[i][j].getScoreaway())) {
                    strStandings[homeid].setLost(strStandings[homeid].getLost() + 1);
                    strStandings[homeid].setGoalsFor(strStandings[homeid].getGoalsFor() +
                            mathxd[i][j].getScorehome());
                    strStandings[homeid].setGoalsAgainst(strStandings[homeid].getGoalsAgainst() +
                            mathxd[i][j].getScoreaway());
                    strStandings[homeid].setGoalsScored(strStandings[homeid].getGoalsFor() -
                            strStandings[homeid].getGoalsAgainst());
                    strStandings[homeid].setGoalsConceded(strStandings[homeid].getGoalsAgainst()
                            - strStandings[homeid].getGoalsFor());
                    strStandings[awayid].setWon(strStandings[awayid].getWon() + 1);
                    strStandings[awayid].setPoints(strStandings[awayid].getPoints() + 3);
                    strStandings[awayid].setGoalsFor(strStandings[awayid].getGoalsFor() +
                            mathxd[i][j].getScoreaway());
                    strStandings[awayid].setGoalsAgainst(strStandings[awayid].getGoalsAgainst() +
                            mathxd[i][j].getScorehome());
                    strStandings[awayid].setGoalsScored(strStandings[awayid].getGoalsFor() -
                            strStandings[awayid].getGoalsAgainst());
                    strStandings[awayid].setGoalsConceded(strStandings[awayid].getGoalsAgainst()
                            - strStandings[awayid].getGoalsFor());
                    strStandings[awayid].setPlayed(strStandings[awayid].getPlayed() + 1);
                    strStandings[homeid].setPlayed(strStandings[homeid].getPlayed() + 1);
                } else if (Integer.valueOf(mathxd[i][j].getScorehome()) == Integer
                        .valueOf(mathxd[i][j].getScoreaway())) {
                    strStandings[homeid].setDrawn(strStandings[homeid].getDrawn() + 1);
                    strStandings[homeid].setPoints(strStandings[homeid].getPoints() + 1);
                    strStandings[homeid].setGoalsFor(strStandings[homeid].getGoalsFor() +
                            mathxd[i][j].getScorehome());
                    strStandings[homeid].setGoalsAgainst(strStandings[homeid].getGoalsAgainst() +
                            mathxd[i][j].getScoreaway());
                    strStandings[homeid].setGoalsScored(strStandings[homeid].getGoalsFor() -
                            strStandings[homeid].getGoalsAgainst());
                    strStandings[homeid].setGoalsConceded(strStandings[homeid].getGoalsAgainst()
                            - strStandings[homeid].getGoalsFor());
                    strStandings[awayid].setDrawn(strStandings[awayid].getDrawn() + 1);
                    strStandings[awayid].setPoints(strStandings[awayid].getPoints() + 1);
                    strStandings[awayid].setGoalsFor(strStandings[awayid].getGoalsFor() +
                            mathxd[i][j].getScoreaway());
                    strStandings[awayid].setGoalsAgainst(strStandings[awayid].getGoalsAgainst() +
                            mathxd[i][j].getScorehome());
                    strStandings[awayid].setGoalsScored(strStandings[awayid].getGoalsFor() -
                            strStandings[awayid].getGoalsAgainst());
                    strStandings[awayid].setGoalsConceded(strStandings[awayid].getGoalsAgainst()
                            - strStandings[awayid].getGoalsFor());
                    strStandings[awayid].setPlayed(strStandings[awayid].getPlayed() + 1);
                    strStandings[homeid].setPlayed(strStandings[homeid].getPlayed() + 1);
                }
            }
        }
        Collections.sort(standingsList);
        // System.out.println("Premier League Standings:");
        for (int x = 0; x < standingsList.size(); x++) {
            Standings s = standingsList.get(x);
            // System.out.println((x + 1) + ". " + s.getTeam() + " - " + s.getPoints()
            // + " points"
            // + ", W: " + s.getWon() + ", L: " + s.getLost() + ", D: " + s.getDrawn()
            // + ", GF: " + s.getGoalsFor() + ", GA: " + s.getGoalsAgainst()
            // + ", GS: " + s.getGoalsScored());
            dataStrading[x][0] = String.valueOf(x + 1);
            dataStrading[x][1] = String.valueOf(s.getTeam());
            dataStrading[x][2] = String.valueOf(s.getPlayed());
            dataStrading[x][3] = String.valueOf(s.getWon());
            dataStrading[x][4] = String.valueOf(s.getDrawn());
            dataStrading[x][5] = String.valueOf(s.getLost());
            dataStrading[x][6] = String.valueOf(s.getGoalsFor());
            dataStrading[x][7] = String.valueOf(s.getGoalsAgainst());
            dataStrading[x][8] = String.valueOf(s.getGoalsScored());
            dataStrading[x][9] = String.valueOf(s.getPoints());
        }
    }

    public int getTeamid(String teamname) {
        for (int i = 0; i < strStandings.length; i++) {
            if (strStandings[i].getTeam().equals(teamname)) {
                return i;
            }
        }
        return -1;
    }

    public void createTable() {
        Object[][] data = new Object[20][];
        for (int i = 0; i < data.length; i++) {
            data[i] = dataStrading[i];
        }
        String[] columnNames = { "number", "team", "match", "win", "drawn", "lost", "Goal", "Own goal",
                "goal difference", "points" };

        tableModel = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // always return false to disallow editing
                return false;
            }
        };

        table = new JTable(tableModel);
        table.setRowHeight(50);
        table.setDefaultRenderer(Object.class, new CenteredCellRenderer());
        table.setGridColor(new Color(242, 5, 92));
        table.setSelectionBackground(Color.WHITE);
        table.setSelectionForeground(new Color(242, 5, 92));
        table.setShowVerticalLines(false);
        table.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
        JTableHeader header = table.getTableHeader();
        header.setBackground(new Color(52, 0, 64));
        header.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        header.setForeground(new Color(242, 5, 92));
        table.getColumnModel().getColumn(1).setPreferredWidth(280);
    }

    public void updateTable() {
        for (int i = 0; i < dataStrading.length; i++) {
            for (int j = 0; j < dataStrading[i].length; j++) {
                tableModel.setValueAt(dataStrading[i][j], i, j);
            }
        }
        tableModel.fireTableDataChanged(); // อัพเดทข้อมูลใน JTable
    }

    public void oneTeam() {
        String value = table.getValueAt(0, 1).toString(); // ดึงค่าของ cell ใน row และ column ที่กำหนด
        System.out.println(value);
        String Filenamexs = "";
        for (int i = 0; i < dataTeamtol.length; i++) {
            if (dataTeamtol[i][2].equals(value)) {
                Filenamexs = dataTeamtol[i][0];
                break;
            }
        }
        System.out.println(Filenamexs);
        // lateam = new JLabel("#1 "+value);
        lateam.setText("#1 " + value);
        lateam.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        lateam.setHorizontalAlignment(JLabel.CENTER);
        // lalogo = new JLabel();
        ImageIcon logoicon = new ImageIcon(Filenamexs);
        Image imagelogo = logoicon.getImage();
        Image scaledImagelogo = imagelogo.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newImageIconlogo = new ImageIcon(scaledImagelogo);
        lalogo.setIcon(newImageIconlogo);

    }

    public String[][] readscore() throws FileNotFoundException {
        Scanner scannerMath = new Scanner(new File("data/dataMatch.dat"));
        String marray[] = new String[38];
        String[][] Datamarray = new String[38][10];
        int x = 0;
        while (scannerMath.hasNext()) {
            marray[x] = scannerMath.nextLine();
            x++;
        }
        for (int xo = 0; xo < marray.length; xo++) {
            Datamarray[xo] = marray[xo].split("\\|");
        }
        return Datamarray;
        // ArrayList alistxd = new ArrayList();
        // String dataMathXdSD[][] = new String[10][4];
        // for (int xe = 0; xe < Datamarray[i].length; xe++) {
        //     alistxd.add(Datamarray[i][xe]);
        // }
        // for (int xa = 0; xa < alistxd.size(); xa++) {
        //     dataMathXdSD[xa] = alistxd.get(xa).toString().split(",");
        // }
    }

    // public void updateTeam(){
    // String value = table.getValueAt(0, 1).toString(); // ดึงค่าของ cell ใน row
    // และ column ที่กำหนด
    // System.out.println(value);
    // String Filenamexs = "";
    // for (int i = 0; i < dataTeamtol.length; i++) {
    // if(dataTeamtol[i][2].equals(value)){
    // Filenamexs = dataTeamtol[i][0];
    // break;
    // }
    // }
    // System.out.println(Filenamexs);
    // lateam = new JLabel("#1 "+value);
    // lateam.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
    // lateam.setHorizontalAlignment(JLabel.CENTER);
    // // lalogo
    // ImageIcon logoicon = new ImageIcon(Filenamexs);
    // Image imagelogo = logoicon.getImage();
    // Image scaledImagelogo = imagelogo.getScaledInstance(300, 300,
    // java.awt.Image.SCALE_SMOOTH);
    // ImageIcon newImageIconlogo = new ImageIcon(scaledImagelogo);
    // lalogo.setIcon(newImageIconlogo);

    // }
}
