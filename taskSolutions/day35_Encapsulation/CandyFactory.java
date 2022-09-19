package day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        Candy candy1 = new Candy("Kent", 2, 20, true);
        Candy candy2 = new Candy("Lolipop", 1, 15,true);
        Candy candy3 = new Candy("ulker", 2, 25, false);
        Candy candy4 = new Candy("eti", 5, 10, true);
        Candy candy5 = new Candy("madlen", 2, 10, false);

        ArrayList<Candy> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(candy1, candy2, candy3, candy4, candy5));

        for (Candy each : candies) {
            System.out.println(each.getBrand()+ " : $" + each.getPrice());
        }
    }
}
/*
1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */