package day20_Array;

public class _11_AppearedTwice {

    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int frequency = 0;
            for (int j = 0; j < chars.length; j++) {
                char each = chars[j];
                if(each == ch){
                    frequency++;
                }
            }
            if(frequency == 2){
                System.out.println(ch);
                break;
            }
        }

    }
}
