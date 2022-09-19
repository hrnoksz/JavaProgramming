package day21_ForEachLoop;

public class _03_CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        // solution 1:
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+ " "); // 4 5
                }
            }
        }
        System.out.println();
        System.out.println("-------------------------------------------");
        // solution 2:

        for (int num : arr1) {
            for (int num1 : arr2) {
                if(num == num1){
                    System.out.print(num + " "); //4 5
                }
            }
        }
        System.out.println();
    }
}
/*
3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops

 */