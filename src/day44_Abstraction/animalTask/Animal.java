package day44_Abstraction.animalTask;

public abstract class Animal {

    private String name;
    private final String breed;

    private final char gender;
    private int age;
    private String size;
    private final String color;

    public final static boolean canBreath; // we use static keyword, when ONE COPY is enough for variable
                                          // If we use final keyword, it means that we make the variable unchangeable
   static { // we use static block to initialize static variables
       canBreath = true;
   }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name); // setter method contains all the conditions. It means that setter method check all the conditions
                       // before local variable "name" is assigned to instance variable "name"
        this.breed = breed;
        if(!(gender == 'M' || gender == 'F')){
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    // !!!!!!!!!!!!!!!!!!!!We cannot create setter method for instance variable that has a FINAL keyword!!!!!!!!!!!!!!!!!!!!!!!!!!
    // But we create getter method for any instance variables
    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name == null){
            throw new RuntimeException("Invalid name");
        }
        if(name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age <= 0){
            throw new RuntimeException("Invalid age: "+age);
        }
        this.age = age;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getColor(){
        return color;
    }

    public final void drink(){
        System.out.println(name +" is drinking water");
    }

    public abstract void eat();

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal

		Create the following subclasses of Animal:
				Dog
					eat(): eats Pizza

				Cat
					eat(): eats Biryani

				Tiger
					eat(): eats deer

				Parrot
					eat(): eats chocolate

				Eagle
					eat(): eats snake
 */
