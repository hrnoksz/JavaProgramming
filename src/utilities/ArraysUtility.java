package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //print each integer of an integer array in separate lines
    public static void printEach(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }

    //print each double of a double array in separate lines
    public static void printEach(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    //print each char of a char array in separate lines
    public static void printEach(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    //print each string of a string array in separate lines
    public static void printEach(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    // return the maximum number for integer array
    public static int maxNumber(int[] array){
        int max = array[0];
        for (int each : array) {
            if(each>max){
                max = each;
            }
        }
        return max;
    }

    // return the maximum number for double array
    public  static double maxNumber(double[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

    // return the minimum number for integer array
    public static int minNumber(int[] array){
        Arrays.sort(array);
        return array[0];
    }

    // return the minimum number for double array
    public  static double minNumber(double[] array){
        Arrays.sort(array);
        return array[0];
    }

    // checks if the given integer is contained in the given array. Returns boolean
    public static boolean contains(int[] array, int element){
        boolean result = false;
        for (int each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    // checks if the given double is contained in the given array. Returns boolean
    public static boolean contains(double[] array, double element){
        boolean result = false;
        for (double each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    // checks if the given char is contained in the given array. Returns boolean
    public static boolean contains(char[] array, char element){
        boolean result = false;
        for (char each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    // checks if the given string is contained in the given array. Returns boolean
    public static boolean contains(String[] array, String element){
        boolean result = false;
        for (String each : array) {
            if(each.equals(element)){
                result = true;
            }
        }
        return result;
    }

    //adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length+1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    //adds the given element to array, returns a new array
    public  static  double[] addElement(double[] array, double element){
        double[] result = new double[array.length+1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    // adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length+1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    //adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length+1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return count;
    }

    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result = {}; // new int[0]
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) == 1){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result = {}; // new int[0]
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) == 1){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result = {}; // new int[0]
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) == 1){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length-1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length-1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length-1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length-1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == index){ // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    // merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2){
        double[] result = new double[arr1.length + arr2.length];
        int i = 0;
        for (double each : arr1) {
            result[i++] = each;
        }
        for (double each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    // merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2){
        char[] result = new char[arr1.length + arr2.length];
        int i = 0;
        for (char each : arr1) {
            result[i++] = each;
        }
        for (char each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    // merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2){
        String[] result = new String[arr1.length + arr2.length];
        int i = 0;
        for (String each : arr1) {
            result[i++] = each;
        }
        for (String each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    // reverses given the array, returns a new array
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    // reverses given the array, returns a new array
    public static double[] reverse(double[] array){
        double[] result = new double[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    // reverses given the array, returns a new array
    public static char[] reverse(char[] array){
        char[] result = new char[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    // reverses given the array, returns a new array
    public static String[] reverse(String[] array){
        String[] result = new String[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    // replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){
        int[] result = {};
        for (int each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){
        double[] result = {};
        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){
        char[] result = {};
        for (char each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){
        String[] result = {};
        for (String each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
    public static int[] insertElement(int[] array, int index, int element){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        int[] result = new int[array.length+1];
        result[index] = element;
        for (int i = 0, j=0; i < array.length; i++,j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
    public static double[] insertElement(double[] array, int index, double element){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        double[] result = new double[array.length+1];
        result[index] = element;
        for (int i = 0, j=0; i < array.length; i++,j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
    public static char[] insertElement(char[] array, int index, char element){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        char[] result = new char[array.length+1];
        result[index] = element;
        for (int i = 0, j=0; i < array.length; i++,j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
    public static String[] insertElement(String[] array, int index, String element){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        String[] result = new String[array.length+1];
        result[index] = element;
        for (int i = 0, j=0; i < array.length; i++,j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }
        return result;
    }

    // swaps the elements in the given array
    public static int[] swapElement(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    // swaps the elements in the given array
    public static double[] swapElement(double[] array, int i, int j){
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    // swaps the elements in the given array
    public static char[] swapElement(char[] array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    // swaps the elements in the given array
    public static String[] swapElement(String[] array, int i, int j){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

}


