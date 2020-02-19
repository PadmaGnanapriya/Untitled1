package Lab_01;

import java.io.FileNotFoundException;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        /*GET FIRST LINE TXT FILE AS String. */
        String firstLine = FileHandel.readFirstLine("src/Lab_01/Sample");
        System.out.println(firstLine);
        // int firstvalue=Integer.valueOf(firstLine);
        // System.out.println(firstvalue);

        /*GET ENTIRE TXT FILE AS String. */
        String dataOfFile = FileHandel.readFullFile("src/Lab_01/Sample");
        System.out.println(dataOfFile);

        /*WRITE ON THE TXT FILE.*/
        String data0 = "ENTRE YOUR STRING TO WRITE ON FILE";
        String data1 = "ENTRE YOUR STRING TO WRITE ON FILE ALSO"; // Asign your arrayOutput as string
        FileHandel.writeUsingOutputStream(data0+" "+data1,"H:\\A_Padma_Codes\\Code_Java\\untitled1\\src\\Lab_01\\HashCode.txt");

    }
}
