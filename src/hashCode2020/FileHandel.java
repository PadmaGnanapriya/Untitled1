package hashCode2020;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandel<line> {


    /* NEW TXT WRITING METHOD*/
    public static void writeUsingOutputStream(String data,String path) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(new File(path));
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*PASS ENTIRE TXT FILE AS String. */
    public static String readFullFile(String path) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(path))) {
            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        String paragraph=sb.toString();
        return paragraph;
    }

    /*PASS FIRST LINE  TXT FILE AS String. */
        public static String readFirstLine(String path) {
            StringBuilder sb = new StringBuilder();
            try (BufferedReader br = Files.newBufferedReader(Paths.get(path))) {
                return br.readLine();
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }
            return null;
        }

    /*PASS READ_REMAINING TXT FILE AS String. */
    public static String readRemaining(String path) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(path))) {
            // read line by line
            String line;
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        String paragraph=sb.toString();
        return paragraph;
    }

    /*PASS ENTIRE TXT FILE AS String. */
    public static String readRead(String path) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(path))) {
            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        String paragraph=sb.toString();
        return paragraph;
    }




}