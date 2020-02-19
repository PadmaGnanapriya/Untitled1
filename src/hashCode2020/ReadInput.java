package hashCode2020;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadInput {


    String path;
    ReadInput(String path){
        this.path=path;
    }

    /*read first line from the file */
    int[] firstLine() throws FileNotFoundException {
        File file= new File(path);
        Scanner scanner=new Scanner(file);
        String line01=scanner.nextLine();
        int[] arry=new int[5];  //Change 2 as in order to given file
        int i=0;
        for(String w:line01.split("\\b")){
            arry[i++]=Integer.valueOf(w);
            System.out.println(arry[i]);
        }
        return arry;

    }

     ArrayList<Integer> readRemainParagraph() throws FileNotFoundException {
        ArrayList<Integer> valueList=new ArrayList<Integer>();
        File file=new File(path);
        Scanner scanner=new Scanner(file);
        String line2_end=scanner.nextLine();
        while (line2_end!=null){
            //System.out.println(line2_end);
            line2_end=scanner.nextLine();
        }
        for(String val:line2_end.split("\\b")) {
            valueList.add(Integer.valueOf(val));
        }
        return valueList;


    }
}
