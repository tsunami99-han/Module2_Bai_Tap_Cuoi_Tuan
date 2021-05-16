import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of family:");
        int number = sc.nextInt();
        String trash = sc.nextLine();
        Family[] families = new Family[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Family " + Math.addExact(i, 1));
            System.out.println("Enter address:");
            int address = sc.nextInt();
            System.out.println("Enter number of member:");
            int numberMember = sc.nextInt();
            Person[] persons = new Person[numberMember];
            String trash1 = sc.nextLine();
            for (int j = 0; j < numberMember; j++) {
                System.out.println("Member " + Math.addExact(j, 1));
                System.out.println("Enter name :");
                String name = sc.nextLine();
                System.out.println("Enter age :");
                int age = sc.nextInt();
                String trash2 = sc.nextLine();
                System.out.println("Enter job :");
                String job = sc.nextLine();
                System.out.println("Enter ID :");
                int id = sc.nextInt();
//                for (int k = 0; k < town.size; k++) {
//                    for (int g = 0; g < families[k].getNumberMember(); g++) {
//                        if (persons[g].getPeopleID() == id) {
//                            System.out.println("Error; re-enter ID");
//                            id = sc.nextInt();
//                        }
//                    }
//                }
                sc.nextLine();
                persons[j] = new Person(name, age, job, id);
            }
            families[i] = new Family(number, persons, address);
            town.add(families[i]);
        }
        town.display();
    }
}
