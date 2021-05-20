import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OfficeManager officeManager = new OfficeManager();
        while (true) {
            System.out.println("Officier Management!");
            System.out.println("Menu:");
            System.out.println("1.Display");
            System.out.println("2.Add");
//        System.out.println("3.Add to index");
            System.out.println("3.Find by name");
//        System.out.println("5.Find by index");
            System.out.println("4.Edit by name");
            System.out.println("5.Sort by age");
            System.out.println("6.Sort by name");
            System.out.println("7.Display by officer");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
//            while (choice != 0) {
                switch (choice) {
                    case 1:
                        officeManager.display();
                        break;
                    case 2:
//                    officeManager.creatNewOfficer();
                        officeManager.addOfficer();
                        break;
                    case 3:
                        officeManager.findByName();
                        break;
                    case 4:
                        officeManager.findByName();
                        System.out.println(officeManager.officers.get(officeManager.findByName()));
                        break;
                    case 5:
                        officeManager.sortByAge();
                        break;
                    case 6:
                        officeManager.sortByName();
                        break;
                    case 7:
                        officeManager.displayByOffice();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("No choice!");
//                }
//                System.out.println("Enter your choice:");
//                sc.nextLine();
//                choice = sc.nextInt();
            }
        }
    }
}
