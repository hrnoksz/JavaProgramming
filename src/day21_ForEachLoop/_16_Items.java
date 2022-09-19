package day21_ForEachLoop;

public class _16_Items {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        //                    0         1          2          3        4           5
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        //                    0          1       2         3           4        5
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        //                   0           1        2         3          4         5

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int id = itemIDs[i];

            System.out.println(item+" - "+id+" - $"+price);
        }
    }
}
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
 */