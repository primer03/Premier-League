package premir;

import java.io.File;
import java.io.IOException;
import java.security.spec.ECField;
import java.util.*;

public class readfile {
    private static String pathfile;
    private static String[][] dataarr;
    private static String strTeam = "";

    

    public readfile() {
        pathfile = "";
    }

    public readfile(String pathdata) {
        pathfile = pathdata;
    }

    public static String getPathfile() {
        return pathfile;
    }

    public static void setPathfile(String pathfile) {
        readfile.pathfile = pathfile;
    }

    public static String[][] getDataarr() {
        setDataarr();
        return dataarr;
    }

    private static void setDataarr() {
        setStrTeam();
        String[] dataXD = getStrTeam().split("\\|");
        System.out.println("sd"+dataXD.length);
        readfile.dataarr = new String[dataXD.length][];
        for (int i = 0; i < dataarr.length; i++) {
            dataarr[i] = dataXD[i].split(",");
        }
    }

    public static String getStrTeam() {
        return strTeam;
    }

    public static void setStrTeam() {
        try {
            Scanner adddata = new Scanner(new File(pathfile));
            while (adddata.hasNext()) {
                strTeam += adddata.nextLine()+"|";
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }  
    }
}
