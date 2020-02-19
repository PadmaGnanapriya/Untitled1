package hashCode2020;


import java.util.Arrays;

public class Char_Arry_2_String {
    public static void main(String[] args) {
        char[] charary = new char[]{'P', 'a', 'd', 'm', 'a', 'G', 'n', 'a', 'n', 'a', 'p', 'r', 'i', 'y', 'a'};

        String name=new String(String.valueOf(charary));
        System.out.println(name);

        String name2=String.valueOf(charary);
        System.out.println(name2);

        String name3=String.copyValueOf(charary);
        System.out.println(name3);

        StringBuilder sb = new StringBuilder();
        for (char ch: charary)
            sb.append(ch);
        String name4= sb.toString();
        System.out.println(name4);

        String name5 = Arrays.toString(charary)
                .substring(1, 3*charary.length-1)
                .replaceAll(", ", "");
        System.out.println(name5);



    }
}
