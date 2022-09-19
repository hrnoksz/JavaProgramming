package _02_Statements;

import java.util.Scanner;

public class _02_028_Statements_ConsoleMenu {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("select an option:");
        System.out.println("1) option 1");
        System.out.println("2) option 2");
        System.out.println("3) option 3");
        System.out.println("---------------");

        int choice = s.nextInt();
        s.close();
        boolean isValidMenu = choice == 1 || choice == 2 || choice ==3;

        if(isValidMenu){
            if(choice == 1){
                System.out.println("user selected 1");
            }else if(choice == 2){
                System.out.println("user selected 2");
            }else{
                System.out.println("user selected 3");
            }
        }

    }
}
/*
A console menu is basically a text menu. After it is outputted to the console a user input is captured.
Then the program decides what to do according to the user input (what the user selected).

This is done using separate if statements(without else) or branched if statements.

Your console menu has 3 items called "options"

Flow:

Prints:
---------------
select an option:
1) option 1
2) option 2
3) option 3
---------------

---------------
if choice is 1
print:
user selected 1
 */