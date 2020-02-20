package typeConverting;

public class Main2 {
    public static void main(String[] args) {

        /*Char array to string*/
        char[] ary1=new char[]{'P', 'a', 'd', 'm', 'a', ' ','G', 'n', 'a', 'n', 'a', 'p', 'r', 'i', 'y', 'a'};
        String word1=ArrayHadel.CharArry_2_String(ary1);  //****Method is called here
        System.out.println(word1);

        /*string to Char array */
        char charAry[]=ArrayHadel.string2CharArray("King Gnanapaala"); //****Method is called here
        for(char x:charAry)
            System.out.print(x+" ");

        /*Int array convert to string like:-  1 2 4 4 5 6 8  */
        int[] intArry=new int[]{1,2,4,4,5,6,8};
        String word2=ArrayHadel.intArray_2_String(intArry); //****Method is called here
        System.out.println(word2);

        /*Int array convert to string like [1, 2, 4, 4, 5, 6, 8]*/
        int[] intArry1=new int[]{1,2,4,4,5,6,8};
        String word3=ArrayHadel.intArry2String(intArry1);  //****Method is called here
        System.out.println(word3);

    }
}
