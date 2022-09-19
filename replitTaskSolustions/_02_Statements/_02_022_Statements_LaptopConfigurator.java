package _02_Statements;

import java.util.Scanner;

public class _02_022_Statements_LaptopConfigurator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size:");
        double size = scan.nextDouble();
        double laptopPrice = 0;

        if(size == 13.3){
            laptopPrice += 200;
        }if(size == 15.0){
            laptopPrice += 300;
        }if(size == 17.3){
            laptopPrice += 400;
        }

        System.out.println("Select CPU type:");
        String type = scan.next();
        if(type.equals("i3")){
            laptopPrice += 150;
        }else if(type.equals("i5")){
            laptopPrice += 250;
        }else if(type.equals("i7")){
            laptopPrice += 350;
        }

        System.out.println("Select RAM size:");
        int ramSize = scan.nextInt();
        laptopPrice += (ramSize * 50)/4;

        System.out.println("Select storage type:");
        String storage = scan.next();

        System.out.println("Enter memory size:");
        int memory = scan.nextInt();
        if(storage.equals("HDD")){
            laptopPrice += (memory / 500)*50;
        }else if(storage.equals("SSD")){
            laptopPrice += (memory / 500)*100;
        }
        System.out.println("Enter screen resolution:");
        String resolution = scan.next();
        if(resolution.equals("FULLHD")){
            laptopPrice += 100;
        }else if(resolution.equals("4K")){
            laptopPrice += 200;
        }

        System.out.println("Laptop price is: $" + laptopPrice);


    }
}
/*
Write a program that will calculate laptop price based on the components.

First ask user for a screen size.

If screen size is equals to 13.3, add $200 to the laptop price.
If screen size is equals to 15.0 - add $300 to the laptop price.
If screen size is equals to 17.3 - add $400 to the laptop price.
Then ask user for CPU type.

If CPU type equals to i3, add $150 to the laptop price.
If CPU type equals to i5, add $250 to the laptop price.
If CPU type equals to i7, add $350 to the laptop price.
Then ask user for RAM size.

Add $50 for every 4GB of ram to the laptop price.
Then, ask user for storage type. There are 2 options: SSD and HDD.

If it's HDD - add $50 to the laptop price for every 500gb.
If it's SSD - add $100 to the laptop price for every 500GB.
Then ask user for for screen resolution. There are 2 options: FULLHD and 4K.

Add $100 if it's FULLHD screen
Add $200 if it's 4K screen.
Example:

Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i7
Display message: Select RAM size:
input: 8
Display message: Select storage type:
input: SSD
Display message: Enter memory size:
input: 1000
Display message: Enter screen resolution:
input: 4K
Display message: Laptop price is: $1050.0

 */