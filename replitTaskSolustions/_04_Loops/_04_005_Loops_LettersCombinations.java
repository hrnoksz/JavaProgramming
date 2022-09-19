package _04_Loops;

public class _04_005_Loops_LettersCombinations {

    public static void main(String[] args) {

        for (int i = 'z'; i >= 'v' ; i--) {
           char ch1 = (char) i;
            for (int j = 'z'; j >= 'v' ; j--) {
                char ch2 = (char) j;
                System.out.println(""+ch1+ch2);
            }
        }

    }
}
/*
Write a loop that displays all possible combinations of two letters
where the letters are 'z', or 'y', or 'x', or 'w', or 'v'.
The combinations should be displayed in descending alphabetical order:

zz

zy

zx

zw

zv

yz

....

vv
 */