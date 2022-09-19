package day20_Arrays;

public class _02_ReverseNames {

    public static void main(String[] args) {

        String[] classmates = {"Harun Oksuz", "Aysen Cesur", "Ali Yılmaz"};

        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverse = "";
            for (int j = name.length()-1; j >= 0; j--) {
                reverse += name.charAt(j);
            }
            System.out.println(reverse);
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