package day21_ForEachLoop;

public class _07_ForEachLoopPractice {

    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String word : words) {
           word = ""+ word.charAt(0)+word.charAt(word.length()-1);
           System.out.println(word);
        }
    }
}
