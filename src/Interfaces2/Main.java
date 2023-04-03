package Interfaces2;

public class Main {

    public static void main(String[] args) {
        Person[] abductedByAliens = new Person[10];
        Citizen[] citizenOfHonor = new Citizen[10];
        Employee[] employeesOfTheMonth = new Employee[10];

        Rebel rebel = new Rebel(18, "Mike");
        abductedByAliens[0] = rebel;
 //       citizenOfHonor[0] = rebel; -- compile error
 //       employeesOfTheMonth[0] = rebel; -- compile error

        RomanianOmwWorker olivia = new RomanianOmwWorker();

        abductedByAliens[1] = olivia;
        citizenOfHonor[1] = olivia;
        employeesOfTheMonth[1] = olivia;

        abductedByAliens[0].getAge();
        abductedByAliens[1].getAge();

        citizenOfHonor[1].getHomeCountry();

        abductedByAliens[2] = new Romanian();
    }
}
