package hashCode2020;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        /*GET FIRST LINE TXT FILE AS String. */
        String firstLine = FileHandel.readFirstLine("src/hashCode2020/Sample");
        System.out.println(firstLine);
        // int firstvalue=Integer.valueOf(firstLine);
        // System.out.println(firstvalue);

        System.out.println("\nremaining data from the file\n");

        /*GET READ_REMAINING TXT FILE AS String. */
        String remainData = FileHandel.readRemaining("src/hashCode2020/Sample");
        System.out.println(remainData);

        /*GET ENTIRE TXT FILE AS String. */
        String dataOfFile = FileHandel.readFullFile("src/hashCode2020/Sample");
        System.out.println(dataOfFile);

        /*WRITE ON THE TXT FILE.*/
        String data0 = "ENTRE YOUR STRING TO WRITE ON FILE";
        String data1 = "ENTRE YOUR STRING TO WRITE ON FILE ALSO"; // Asign your arrayOutput as string
        FileHandel.writeUsingOutputStream(data0+" "+data1,"H:\\A_Padma_Codes\\Code_Java\\untitled1\\src\\hashCode2020\\HashCode.txt");

    }
}
