package day20_Array;

public class _10_UniqueElementsOfArray {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"};

        for (int i = 0; i < words.length; i++) {
            String element = words[i]; // "Java"
            int frequency = 0;
            for (int j = 0; j < words.length; j++) { // finds the frequency of element from array
                if(words[j].equals(words[i])){
                    frequency++;
                }
            }
            if(frequency == 1){
                System.out.println(element);
            }
        }
    }
}
