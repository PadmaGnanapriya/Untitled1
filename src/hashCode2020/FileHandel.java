package hashCode2020;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

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

    /*Read a File into an int array */
    public static int[] readIntoArray(String path) throws IOException {
        File file = new File(path);
        Scanner scann=new Scanner(file);
        Scanner scanner = new Scanner(file);
        scanner.nextLine(); //To skip first line
        scann.nextLine(); //To skip first line
        int count=0;
        while (scann.hasNextInt()){
            count++;
            scann.nextInt();
        }
        int[] intArry = new int[count];//***Make limits here
        int i = 0;
        while (scanner.hasNext())
            intArry[i++] = scanner.nextInt();
        return intArry;
    }
}