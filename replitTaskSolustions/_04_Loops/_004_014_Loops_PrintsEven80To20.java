package _04_Loops;

public class _004_014_Loops_PrintsEven80To20 {

    public static void main(String[] args) {

        String result = "";
        for (int i = 80; i >= 20 ; i-=2) {
            if(i %2== 0){
                result += (i + " ");
            }
        }
        System.out.print(result.trim());


    }
}
/*
Write a for loop that prints all even integers from 80 through and including 20. Seperate each number with a space
 */