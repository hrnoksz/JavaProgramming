package week08;

public class _04_ReportMaxPriceItem {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        double maxPrice = prices[0]; // assume that first one is maxPrice price
        int indexOfMaxPrice = 0;

        double minPrice = prices[0];
        int indexOfMinPrice = 0;

        for (int i = 0; i < prices.length; i++) {
           if(prices[i] > maxPrice){
               maxPrice = prices[i];
               indexOfMaxPrice = i;
           }
           if(prices[i]<minPrice){
               minPrice = prices[i];
               indexOfMinPrice = i;
           }

        }
        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice); // indexOfMaxPrice = 4
        System.out.println("Max price = " + maxPrice); // Max price = 439.5
        System.out.println("---------------------------------------");
        System.out.println("indexOfMinPrice = " + indexOfMinPrice); //indexOfMinPrice = 2
        System.out.println("minPrice = " + minPrice); //minPrice = 9.99

        /*
        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice + "Max price item : "+items[indexOfMaxPrice]);
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("-------------------------------");
        System.out.println("indexOfMinPrice = " + indexOfMinPrice+ "Min price item : "+items[indexOfMinPrice]);
        System.out.println("minPrice = " + minPrice);
         */

    }
}
