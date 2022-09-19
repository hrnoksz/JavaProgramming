package day24_CustomMethod_Return;

public class _01_BreakfastTasks {

    public static void main(String[] args) {

        initials("John", "Hopkins");
        System.out.println("------------------------");
        domain("harun1973@yahoo.com");
        System.out.println("---------------------------");

        String[] emails = {"josh@gmail.com", "jim@yahoo.com", "elminur@cydeo.com"};
        for (String email : emails) {
            domain(email);
        }
        System.out.println("----------------------------------");

        nameOfMonths(11);

        System.out.println("----------------------");

        nameOfDay(7);

        System.out.println("-------------------------------");

        numberDaysInMonth(2,2020);

    }
    // 1. Create a method that can display the initials of the person
    public static void initials(String firstName, String lastName){

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println(initial);
    }
    //2. Create a method that can display the domain of the email
    public static void domain(String email){
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }
    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonths(int number){
        String name = "";
        if(number>=1 && number <=12){
            name = (number==1)?"January" :(number==2)?"February" :(number==3)?"March" :(number==4)?"April"
                    :(number==5)?"May" :(number==6)?"June" :(number==7)?"July" :(number==8)?"August"
                    :(number==9)?"September":(number==10)?"October" :(number==11)?"November" : "December";
        }else{
            name = "Invalid";
        }
        System.out.println("Months' name = " + name);
    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        String name = "";
        switch (number){
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:
                name = "Invalid";
        }
        System.out.println("Days' name = " + name);
    }

    //5. Create a method that can print how many days a month has
    public static void numberDaysInMonth(int number, int year){
        String result = "";
        if(number>=1 && number<=12){
            switch (number){
                case 2:
                    result=(year%4 == 0)? "29 days" : "28 days";
                    break;
                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    break;
                default:
                    result = "31 days";
            }
        }else {
            result = "Invalid number";
        }
        System.out.println("result = " + result);
    }
}
/*
	5. Create a method that can print how many days a month has
       NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

	6. ageGroups
	                    infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
 */