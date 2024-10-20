import java.sql.SQLOutput;

class Employee{
    private String name;
    private String lastName;
    private int position;
    private int age;
    private String eMail;

    public Employee(String name, String lastName, int position, int age, String eMail) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public int getPosition() {
        return position;
    }
    public int getAge() {
        return age;
    }
    public String geteMail() {
        return eMail;
    }
    public void logingToSystem() {
        System.out.println("Logging to system");
    }
    public void working(){
        System.out.println("Working");
    }
    public void endOfWork(){
        System.out.println("End Of Work");
    }
}
class Manager extends Employee{

    private String section;
    private int workers;
    private boolean isLogged;

    public Manager(String name, String lastName, int position, int age, String eMail, String section, int workers, boolean isLogged) {
        super(name, lastName, position, age, eMail);

    this.section = section;
    this.workers = workers;
    this.isLogged = isLogged;

    }
    public String getSection() {
        return section;
    }
    public int getWorkers() {
        return workers;
    }
    public boolean isLogged() {
        return isLogged;
    }
    public void givingTasksToWorkers() {
        System.out.println("Giving tasks to workers");
    }
    public void chceckingRaports(){
        System.out.println("Chcecking raports");
    }
    public void managerData(){
        System.out.println("Manager data");
    }
}


public class Main {
    public static void main(String[] args) {
        Manager antoni=new Manager("Antoni","Brzęczyszczykiewicz",2,25,"cwl@gmail.com","Cwl",3,true);
        antoni.logingToSystem();
        antoni.working();
        antoni.endOfWork();
        antoni.chceckingRaports();
        antoni.managerData();
        antoni.givingTasksToWorkers();
        System.out.println(antoni.getName());
        System.out.println(antoni.getLastName());
        System.out.println(antoni.getPosition());
        System.out.println(antoni.getAge());
        System.out.println(antoni.geteMail());
        System.out.println(antoni.getSection());
        System.out.println(antoni.getWorkers());
        System.out.println("Status of login: "+antoni.isLogged());
    }
}