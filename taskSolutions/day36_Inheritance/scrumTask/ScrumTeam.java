package day36_Inheritance.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private ProductOwner PO;
    private BusinessAnalyst BO;
    private ScrumMaster SM;

    private ArrayList<Tester> testers;
    private ArrayList<Developer> developers;

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BO, ScrumMaster SM) {
        setPO(PO);
        setBO(BO);
        setSM(SM);
        this.SM = SM;
        testers = new ArrayList<>();
        developers = new ArrayList<>();
    }

    public ProductOwner getPO() {
        return PO;
    }

    public void setPO(ProductOwner PO) {
        this.PO = PO;
    }

    public BusinessAnalyst getBO() {
        return BO;
    }

    public void setBO(BusinessAnalyst BO) {
        this.BO = BO;
    }

    public ScrumMaster getSM() {
        return SM;
    }

    public void setSM(ScrumMaster SM) {
        this.SM = SM;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int id){
        testers.removeIf(p->p.getId()==id);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper(int id){
        developers.removeIf(p->p.getId()==id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.getName() +
                ", BO=" + BO.getName() +
                ", SM=" + SM.getName() +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }
}
/*
8. Creat a class named ScrumTeam:
			Variables:
				PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
				testers (ArrayList<Testers>),  developers (ArrayList<Developers>)

			Methods:
				addTester(Tester tester): adds the given tester to testers arraylist

				ddTesters(Tester[] testers): adds the given testers to testers arraylist

				removeTester(int id): removes the tester with the given id from the arraylist of tester

				addDeveloper(Developer developer): adds the given developer to testers arraylist

				addDeveloper(Developer[] developer): adds the given developers to testers arraylist

				removeDeveloper(int id): removes the developer with the given id from the arraylist of developer

				toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers
 */