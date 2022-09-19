package week04;

public class SwitchExamples {

    public static void main(String[] args) {

        double startingPrice = 0;
        int numberOfBedrooms = 1;
        String result = "";

        System.out.println("######WELCOME TO ADAIRE APARTMENTS#############");
        switch (numberOfBedrooms){
            case 0: case 5: // or logic for switch
                startingPrice = 1454.0;
                result = "Studio apartment selected\nStarted price : $" + startingPrice;
                break;
            case 1:
                startingPrice = 1725.0;
                result = "One bedroom apartment selected\nStarted price : $" + startingPrice;
                break;
            case 2:
                startingPrice = 2899.0;
                result = "Two bedroom apartment selected\nStarted price : $" + startingPrice;
                break;
            default:
                result = numberOfBedrooms + " bedroom apartment not available";
        }
        System.out.println(result);


    }
}
/*
add new class AdaireApartments
main method

#### WELCOME TO ADAIRE APARTMENTS ####

numberOfBedrooms = 0, 1, 2

startingPrice = 0;

when numberOfBedrooms 0:
print: "Studio apartment selected"
startingPrice -> 1454

when numberOfBedrooms 1:
print: "One bedroom apartment selected"
startingPrice -> 1725

when numberOfBedrooms 2:
print: "Two bedroom apartment selected"
startingPrice -> 2899

default:
print "5 bedroom currently unavailable"

------
"Starting price $1454"
 */