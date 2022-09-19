package week11;

import java.util.Arrays;

public class _01_AddElementToArray {

    public static void main(String[] args) {

        String[] browserTypes = {"Chrome", "Firefox", "Safari"};
        String newBrowserOne = "Edge";
        String newBrowserTwo = "Opera";

        browserTypes = addElement(browserTypes, newBrowserOne);
        // browserTypes : is reference variable to our Array object, and can be reassigned
        System.out.println(Arrays.toString(browserTypes));
        browserTypes = addElement(browserTypes, newBrowserTwo);
        System.out.println(Arrays.toString(browserTypes));

    }
    // create a method that adds new element to an Array
    //method will accept String Array, and string variable, and will return a new String array
    // with the string variable added to the array

    public static String[] addElement(String[] arr, String element){
        String[] newArray = new String[arr.length+1];
        int i = 0;
        for (; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[i] = element;
        return newArray;
    }

}
