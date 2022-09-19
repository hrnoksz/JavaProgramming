package _03_Strings;

import java.util.Scanner;

public class _03_020_Strings_CarInsuranceQuote {

    public static void main(String[] args) {

        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your name");
        name = scan.next();
        System.out.println("Do you have a US driver license?");
        String yesOrNo = scan.next().toLowerCase();
        if(yesOrNo.equals("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        if(zipCode == 20910 || zipCode == 20740){
            premium += 60;
        }else if(zipCode == 22102 || zipCode == 22103){
            premium += 30;
        }else{
            premium += 50;
        }
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();
        if(vehicleOwnership.equalsIgnoreCase("Owned")){
            premium += 10;
        }else{
            premium += 20;
        }
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        if(vehicleUsage.equalsIgnoreCase("Business")){
            premium += 50;
        }else if(vehicleUsage.equalsIgnoreCase("Pleasure")){
            premium += 10;
        }else{
            premium += 20;
        }
        System.out.println("Days Driven To Work And/Or School");
        daysDrivenToWorkOrSchool = scan.nextInt();
        premium += daysDrivenToWorkOrSchool*5;
        System.out.println("Miles Driven To Work And/Or School");
        milesToWorkOrSchool = scan.nextInt();
        premium += milesToWorkOrSchool * 1;
        System.out.println("How old are you?");
        int age = scan.nextInt();
        if(age < 16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else if (age < 18){
            premium = premium * 20;
        }else if (age <= 18 && age <= 21){
            premium = premium * 6;
        }else if (age > 21 && age < 25){
            premium = premium * 2;
        }
        System.out.println("How many years you've been driving?");
        int driverYear = scan.nextInt();
        if(driverYear > 0 && age - driverYear >= 16){
            premium -= driverYear * 5;
        }else{
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println("Have you had any accidents in the last 5 years?");
        String accidents = scan.next();
        if(accidents.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium += (premium * 0.2) * accidentsAmount;
        }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();
        if(continuousInsurance.equalsIgnoreCase("no")){
            premium *= 2;
        }
        System.out.println("What is the highest level of education you have completed?");
        scan.nextLine();
        education = scan.nextLine();
        if(education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors")
                || education.equalsIgnoreCase("Masters")){
            premium -= premium * 0.05;
        }else if(education.equalsIgnoreCase("Doctors")){
            premium -= premium * 0.10;
        }else if(education.equalsIgnoreCase("Less than High School")){
            premium -= premium * 0.05;
        }
        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);
        System.out.println("Reference number: "+ name.substring(0, 2).toUpperCase() +age+""
                +name.substring(name.length()-2).toUpperCase()+""+zipCode+""
                +education.toUpperCase().replace(" ", ""));


    }
}
/*
Write a program that will calculate car insurance premium. Steps to write a program:

First things first, your program should ask customer to provide a name, so display a message: "Enter your name".

Then ask user about ownership of US driver license. Display message: "Do you have a US driver license?".

If user doesn't have a US driver license - display warning message: "Invalid data!" and stop the program (use System.exit(0) after displaying warning message to stop the program).

Then ask user to provide a zip code.

If zip code equals to 20910 or 20740, add $60 to the premium (an amount to be paid for an insurance policy).
If zip code equals to 22102 or 22103, add $30 to the premium.
Otherwise add $50 to the premium. Then ask user about car ownership. Display message: "Is this vehicle Owned, Financed, or Leased?". If car is owned, add $10 to the premium, otherwise add $20 to the premium.
Then ask user about car usage. Display message: "How is this vehicle primarily used?".

If car used for Business, add $50 to the premium.
If car for Pleasure add $10 to the premium.
If car is for Commute - add $20 to the premium, and ask user how many days per week user drives to work.
Display message: "Days Driven To Work And/Or School". Add $5 to the premium for every day driven to work.
Then, ask user about how many miles customers drives to work or school.

Display message: "Miles Driven To Work And/Or School". Increase premium per $1 for every 1 mile.

Then ask customer about his age.

Display message: "How old are you?".

If age is less than 16, display message: "Invalid data!", and stop the program.
If age is between 16 and 18 (exclusive), multiply premium by 20.
If age is between 18 (inclusive) and 21 (inclusive), multiply premium by 6.
If age is between 21 (exclusive) and 25 (exclusive), multiply premium by 2.
Then, ask customer about driving experience. Make sure that experience is greater than 0 and result of subtraction age from experience is greater or equals to 16. If no, display message: "Invalid data!" and stop the program. Reduce premium on $5 for every year of experience.

Then, ask customer about car accidents. Display message: "Have you had any accidents in the last 5 years?".

If answer equals to "Yes" or "YES", ask customer about amount of accidents.
Display message: "How many?", in order to get information about amount of accidents. Add 20% to the premium price for every accident.
Then, ask customer if he had continuous insurance for the past 12 months.

Display message: "Have you had continuous insurance for the past 12 months?". If customer provides negative answer (No) - double the premium.

Then ask user about level of education.

Display message: "What is the highest level of education you have completed?".

If level of education equals to "PhD" or "Bachelors"or "Masters": reduce premium by 5%.
If the level of education equals to "Doctors": reduce premium by 10%.
If level of education equals to "Less than High School" increase premium by 5%.
After all, display message "$customer, here's your quote!". Instead of $customer, you need to insert customer's name. The display message: "Start Your Policy Today For: $premium". Instead of premium, your program should print premium's variable value. Then display message with reference number: "Reference number: referenceNumber". In order to build reference number variable (referenceNumber), concatenate first 2 letters of customer's name, age, last 2 letters of of customer's name, zip code, and level of education without spaces. This value should be all upper case!

Example:
​
Display message: Welcome to the CountyFarm car insurance!
Display message: Welcome to the CountyFarm car insurance!
Display message: Enter your name
Display message: Enter your name
input from user: David
input from user: David
Display message: Do you have a US driver license?
Display message: Do you have a US driver license?
input from user: Yes
input from user: Yes
Display message: Enter your zip code
Display message: Enter your zip code
input from user: 20910
input from user: 20910
Display message: Is this vehicle Owned, Financed, or Leased?
Display message: Is this vehicle Owned, Financed, or Leased?
input from user: Owned
input from user: Owned
Display message: How is this vehicle primarily used?
Display message: How is this vehicle primarily used?
input from user: Pleasure
input from user: Pleasure
Display message: How old are you?
Display message: How old are you?
input from user: 25
input from user: 25
Display message: How many years you've been driving?
Display message: How many years you've been driving?
input from user: 5
input from user: 5
Display message: Have you had any accidents in the last 5 years?
Display message: Have you had any accidents in the last 5 years?
input from user: No
input from user: No
Display message: Have you had continuous insurance for the past 12 months?
Display message: Have you had continuous insurance for the past 12 months?
input from user: Yes
input from user: Yes
Display message: What is the highest level of education you have completed?
Display message: What is the highest level of education you have completed?
input from user: PhD
input from user: PhD
Display message: David, here's your quote!
Display message: David, here's your quote!
Display message: Start Your Policy Today For: $52.25
Display message: Start Your Policy Today For: $52.25
Display message: Reference number: DA25ID20910PHD
Display message: Reference number: DA25ID20910PHD
 */