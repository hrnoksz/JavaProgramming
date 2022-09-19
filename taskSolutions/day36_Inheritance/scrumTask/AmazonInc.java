package day36_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        Tester[] tester = {
                new Tester("Harun", 48, 'M', 1111, "SDET", 120000),
                new Tester("Enes", 24, 'M', 1112, "QA", 110000),
                new Tester("Esra", 34, 'F', 1113, "QA", 100000)
        };

        Developer[] developer = {
                new Developer("Muhtar", 30, 'M', 1114, "Developer", 150000),
                new Developer("Oscar", 38, 'M', 1115, "Developer", 160000),
        };

        BusinessAnalyst businessAnalyst = new BusinessAnalyst("Suna", 35, 'F', 1116, "BA", 100000);
        ScrumMaster scrumMaster = new ScrumMaster("Sena", 24, 'F', 1117, "SM", 115000);
        ProductOwner productOwner = new ProductOwner("Irem", 28, 'F', 1118, "PO", 125000);

        ScrumTeam scrumTeam = new ScrumTeam(productOwner, businessAnalyst, scrumMaster);

        scrumTeam.addDevelopers(developer);
        scrumTeam.addTesters(tester);

        System.out.println(scrumTeam);

        scrumTeam.removeDeveloper(1114);
        System.out.println(scrumTeam);

        System.out.println("----------------------------------------");

        for (Tester each : tester) {
            System.out.println(each.getName()+" : "+each.getSalary());
        }

        System.out.println("---------------------------------------");

        for (Developer each : developer) {
            System.out.println(each.getName()+" : "+each.getAge());
        }

    }
}
