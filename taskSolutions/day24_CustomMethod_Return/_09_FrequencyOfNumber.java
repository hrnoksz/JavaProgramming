package day24_CustomMethod_Return;

public class _09_FrequencyOfNumber {

    public static void main(String[] args) {

        int[] array ={1,1,1,1,1,2,2};
        int frequency = frequencyOfNumber(array,1);
        System.out.println(frequency);
    }
    public static int frequencyOfNumber(int[] array, int element){
        int frequency = 0;
        for (int i = 0; i < array.length; i++) {
           if(array[i] == element){
               frequency++;
            }
        }
        return frequency;
    }
}
/*
5. create method that accepts one integer array and one integer number
    and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */