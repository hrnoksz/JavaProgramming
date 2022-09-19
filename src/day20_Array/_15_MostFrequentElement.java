package day20_Array;

public class _15_MostFrequentElement {

    public static void main(String[] args) {

        int[] array = {0,1,2,3,1,2,0,1};

        int mostFreqNum = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i]==array[j]) {
                    count++;
                }
            }
            if(count>mostFreqNum){
                mostFreqNum = count;
            }
        }
        System.out.println(mostFreqNum);

    }
}
