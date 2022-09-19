package day21_ForEachLoop;

import java.util.Arrays;

public class _09_StringMethod_ToCharArray {

    public static void main(String[] args) {

        //toCharArray method()

        String str = "Java";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars)); //[J, a, v, a]

        for(char each : chars){
            System.out.println(each);
        }
    }
}
