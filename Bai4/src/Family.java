import java.util.Arrays;
public class Family {
    private int numberMember;
    private Person[] persons = new Person[numberMember];
    private int address;

    public Family(int numberMember, Person[] persons, int address) {
        this.numberMember = numberMember;
        this.persons = persons;
        this.address = address;
    }

    public int getNumberMember() {
        return numberMember;
    }

    public void setNumberMember(int numberMember) {
        this.numberMember = numberMember;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public int getAdress() {
        return address;
    }

    public void setAdress(int adress) {
        this.address = adress;
    }
    @Override
    public String toString() {
        return "Family {" +
                "persons: " + Arrays.toString(persons) +
                ", address:" + address +
                '}';
    }
}
