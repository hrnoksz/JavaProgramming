package day21_ForEachLoop;

public class _13_ReverseNames {

    public static void main(String[] args) {

        String[] names = {"Harun Oksuz", "Ayse Cesur", "Ali Yilmaz"};

        for (String each : names) { // each: "Harun Oksuz", "Ayse Cesur", "Ali Yilmaz"
            String reversedName = "";
            for (int i = each.length()-1; i >= 0; i--) {
                reversedName += each.charAt(i);
            }
            System.out.println(reversedName);
        }

    }
}
/*
2. create string array, and store the names of your  classmates (10)
            reverse each student's names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */