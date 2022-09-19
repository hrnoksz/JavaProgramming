package week08;

import java.util.Arrays;

public class _01_ArrayExample {

    public static void main(String[] args) {

        // declare and initialize an array

        int code = 200;

        int[] codes = new int[8]; // my codes array holds 8 elements, they are all int type

        System.out.println(Arrays.toString(codes)); // how we print an array //[0, 0, 0, 0, 0, 0, 0, 0] for integer
                                                    // default value is 0 (zero)

        codes[0] = 200; // first element
        codes[1] = 201; // second element

        int[] statusCodes = {200,201,204,400,401,403,404,500}; // another way of declaring and initialization

        System.out.println(Arrays.toString(statusCodes)); // [200, 201, 204, 400, 401, 403, 404, 500]

        System.out.println("---------------size of an array-----------------------");

        //String str = "Java"; str.length()----> size of the string

        // for arrays, length gets no parameter and returns an integer
        System.out.println("the size of our array: "+ statusCodes.length); // 8

        int sizeOfArrays = statusCodes.length; // 8, use it for creating loops

        String[] responseTypes = new String[]{"OK", "Created", "No content", "Bad Request", "Unauthorized", "Forbidden",
                    "Not Found", "Internal Server Error"};

        for (int i = 0; i < sizeOfArrays; i++) {
            String text = statusCodes[i]+" : "+ responseTypes[i];
            System.out.println("Each status code means: " + text);
        }



    }
}
