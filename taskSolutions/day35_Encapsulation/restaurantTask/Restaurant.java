package day35_Encapsulation.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    private String owner;
    private String location;
    private int numberOfStars;
    private ArrayList<Server> servers;
    private ArrayList<Chef> chefs;

    public Restaurant(String owner, String location, int numberOfStars) {
        setOwner(owner);
        setLocation(location);
        setNumberOfStars(numberOfStars);
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    public ArrayList<Chef> getChefs() {
        return chefs;
    }

    public void hireServer(Server server){
        servers.add(server);
    }

    public void hireServers(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChefs(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int id){
       chefs.removeIf(p->p.getEmployeeID()==id);
    }

    public void terminateServer(int employeeID){
        servers.removeIf(p->p.getEmployeeID()==employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of servers=" + servers.size() +
                ", number of chefs=" + chefs.size() +
                '}';
    }


}
/*
5. Restaurant Task:
    re-do the Restaurant task by making all the fields private in each custom classes

    Encapsulate all the field
        (salary cannot be set to negative)
        (employeeId cannot be set to negative or zero)

    Avoid any duplicated code fragments in each class

6.3 Create a class called Restaurant

	            Attributes:
	                Owner (String), Location (String), numberOfStars (int)
	                Servers (ArrayList of Server objects)
	                Chefs (ArrayList of Chef objects)

                Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)

	            hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
	            hireServer(Server [] servers): accepts an array of Server objects and
	            adds all of them to the Servers ArrayList

	            hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
	            hireChef(Chef [] chefs): accepts an array of Chef objects and
	            adds all of them to the Chef ArrayList

	            terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef
	            terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

	            toString(): Return (String) of all the information of a Restaurant object.
	            No need to print the whole list of Servers or Chefs.
	            Print the number of Servers and Chefs along side the other information

 */
