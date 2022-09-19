package day35_Encapsulation.restaurantTask;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Harun", "Ankara", 5);

        Server[] servers = {
                new Server("Muhtar", 11, 45, true),
                new Server("Oscar", 12, 40, false),
                new Server("Asya", 13, 35, true),
        };

        restaurant.hireServers(servers);

        Chef chef = new Chef("Emir", 15, 45, true);

        restaurant.hireChef(chef);

        System.out.println(restaurant);

        chef.makeOrder();

        System.out.println(chef.getEmployeeID());


    }}
/*
6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set.
	        	  Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set.
	              Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */