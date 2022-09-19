package week02;

public class AnimalSpecies {

    public String name; //instanceVariable
    public int population;
    public int growthRate;

    //static variable: living habitat
    public static String habitat = "Earth";

    //instance method

    public void setInfo(String name, int population, int growthRate){
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
    }
    //initialization with Constructor

    public AnimalSpecies(String name, int population, int growthRate) { //constructor
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
    }

    public AnimalSpecies() { //default constructor
    }

    public int getPopulation(){
        return population;
    }

    public int getGrowthRate(){
        return growthRate;
    }

    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", growthRate=" + growthRate +
                '}';
    }
}
/*
          Create a class AnimalSpecies
            - Create these variables in the class:
                 - name (String),
                - population (int - for practice we can consider 1  unit as 1 million.
                Ex: population = 20 would represent 20 million ),
                - growth rate (int - percent number)

        - Create these methods :
            - setInfo()
                - parameters: name, population, and growth rate
                - returns: void
                - action: assigns the name, population, and growth rate of the object given from the parameters.

        - getName()
             no parameters, returns the name variable

        - getPopulation ()
             no parameters, returns the population variable

        - getGrowthRate()
             no parameters, returns the growth rate variable

        - toString()   generate the toString method as shown in class.

        - Create a class Earth

        - Create AnimalSpecies objects, call  get methods of the objects
     */