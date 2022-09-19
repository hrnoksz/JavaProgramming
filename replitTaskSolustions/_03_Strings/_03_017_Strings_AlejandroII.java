package _03_Strings;

import java.util.Scanner;

public class _03_017_Strings_AlejandroII {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        s.close();
        String result = "";
        if(a.contains("alejandro") && a.contains("project")){
            result = "read";
        }else{
            result = "don't read";
        }
        System.out.println(result);

    }
}
/*

 */