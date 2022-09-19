package week05;

public class ReplacePractice {

    public static void main(String[] args) {

        String word = "github";

        System.out.println(word.replace("hub", "lab")); // gitlab

        System.out.println("word = " + word); // github ==> String is immutable

        System.out.println(word.replace('i', 'o')); //gothub

        String searchResult = "1-48 of over 6000 results for java";
        String actualResult = searchResult.replace("1-48 of over", "").replace("results for java", "");
        System.out.println("result = " + actualResult); // 6000

        String expectedResult = "6000";

        if (expectedResult.equals(actualResult)) {

            System.out.println("PASS");
        }else {
            System.out.println("FAİL");
        }


    }
}
/*

 */