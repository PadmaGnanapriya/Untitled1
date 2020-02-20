package typeConverting;

import java.util.Arrays;



public class ArrayHadel {

    /*Char array to string*/
    public static String CharArry_2_String(char[] ary) {
        char[] charary = new char[ary.length];
        charary=ary;
        String name=new String(String.valueOf(charary));
        return name;
    }


    /*string to Char array */
    public static char[] string2CharArray(String ary) {
        String str = ary;
        char[] ch = new char[str.length()]; // Creating array of string length
        for (int i = 0; i < str.length(); i++) {  // Copy character by character into array
            ch[i] = str.charAt(i);
        }
        return ch;
    }

    /* pass Int array convert to string like:-  1 2 4 4 5 6 8  */
    public static String intArray_2_String(int[] ary01){
        int[] arry=ary01;
        int i=0;
        String v="";
        for(int xx:arry) {
            v=v.concat(" ");
            v=v.concat(String.valueOf(xx));
        }
        return v;
    }


    /*pass Int array convert to string like [1, 2, 4, 4, 5, 6, 8]*/
    public static String intArry2String(int[] ary01){
        int[] arry=ary01;
        String word= Arrays.toString(ary01);
        return word;
    }


}
