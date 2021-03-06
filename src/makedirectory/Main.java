package makedirectory;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File folder = new File("C:\\Directory1");
        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("A 'directory1' könyvtár elkészült!");
            } else {
                System.out.println("Nem készült el a 'directory1' nevű könyvtár!");
            }
        }
        File subFolder1 = new File("C:\\Directory1\\elso");
        if (!subFolder1.exists()) {
            if (subFolder1.mkdirs()) {
                System.out.println("Az 'elso' nevű könyvtár elkészült!");
            } else {
                System.out.println("Nem készült el az 'elso' nevű könyvtár!");
            }
        }
        File subFolder2 = new File("C:\\Directory1\\masodik");
        if (!subFolder2.exists()) {
            if (subFolder2.mkdirs()) {
                System.out.println("A 'masodik' nevű könyvtár elkészült!");
            } else {
                System.out.println("Nem készült el a 'masodik' nevű könyvtár!");
            }
        }
        try {

            File file = new File("c:\\Directory1\\virag.txt");

            if (file.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {

            File file = new File("c:\\Directory1\\jatek.txt");

            if (file.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {

            File file = new File("c:\\Directory1\\elso\\ajandek.txt");

            if (file.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
