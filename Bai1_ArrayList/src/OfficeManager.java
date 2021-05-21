import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class OfficeManager {
    ArrayList<Officer> officers;
    Scanner sc = new Scanner(System.in);

    public OfficeManager() {
        officers = new ArrayList<>();
    }

    public void addOfficer() {
        Officer officer = creatNewOfficer();
        officers.add(officer);
    }

    public Officer creatNewOfficer() {
        System.out.println("Đối tượng bạn muốn thêm là:");
        System.out.println("1.Nhân viên");
        System.out.println("2.Công nhân");
        System.out.println("3.Kỹ Sư");
        System.out.println("Nhập lựa chọn:");
        int choice = sc.nextInt();
        while (choice < 0 || choice > 3) {
            System.out.println("Lựa chọn không hợp lệ!Mời chọn lại:");
            choice = sc.nextInt();
        }
//trash
        String trash = sc.nextLine();
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter gender:");
        String gender = sc.next();
//trash
        String trash1 = sc.nextLine();
        System.out.println("Enter address:");
        String addrest = sc.nextLine();
        String job = null;
        int level = 1;
        String specialized = null;
        if (choice == 1) {
            System.out.println("Enter Job:");
            job = sc.nextLine();
            Staff staff = new Staff(name, age, gender, addrest, job);
            return staff;
        } else if (choice == 2) {
            System.out.println("Enter Level (1-10)");
            level = sc.nextInt();
            while (level < 0 || level > 10) {
                System.out.println("Error, re-enter:");
                level = sc.nextInt();
            }
            Worker worker = new Worker(name, age, gender, addrest, level);
            return worker;
        } else {
            System.out.println("Enter Specialized:");
            specialized = sc.nextLine();
            Engineer engineer = new Engineer(name, age, gender, addrest, specialized);
            return engineer;
        }
    }

    public void addByIndex() {
        System.out.println("Enter index:");
        int index = sc.nextInt();
        this.officers.add(index, creatNewOfficer());
    }

    public void display() {
        for (int i = 0; i < officers.size(); i++) {
            System.out.println(officers.get(i).toString());
        }
    }

    public void findByIndex() {
        sc.nextLine();
        int index = sc.nextInt();
        if (index >= officers.size()) {
            System.out.println("No officier");
        } else {
            System.out.println(officers.get(index));
        }
    }

    public int findByName() {
        sc.nextLine();
        String name = sc.nextLine();
        for (int i = 0; i < officers.size(); i++) {
            if (officers.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void edit() {
        int result = findByName();
        if (result == -1) {
            System.out.println("No officer!");
        } else {
            officers.set(result, creatNewOfficer());
        }
    }

    public void deleteByName() {
        int resuls = findByName();
        if (resuls == -1) {
            System.out.println("No officer");
        } else {
            officers.remove(resuls);
        }
    }

    public void sortByAge() {
        Collections.sort(officers, new Comparator<Officer>() {
            @Override
            public int compare(Officer o1, Officer o2) {
                return o1.getAge() - o2.getAge();
            }
        });
    }

    public void sortByName() {
        Collections.sort(officers, new Comparator<Officer>() {
            @Override
            public int compare(Officer o1, Officer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void displayByOffice() {
        System.out.println("What do you want to display?");
        System.out.println("Worker/Staff/Engineer");
        System.out.println("Enter officer");
        String officer = sc.nextLine();
        while (!officer.equals("Worker") && !officer.equals("Staff") && !officer.equals("Engineer")) {
            System.out.println("Error, re-enter officer");
            officer=sc.nextLine();
        }

        for (int i = 0; i < officers.size(); i++) {
            if (officer.equals("Worker")) {
                System.out.println(officers.get(i).toString());
            } else if (officer.equals("Staff")) {
                System.out.println(officers.get(i).toString());
            } else  {
                System.out.println(officers.get(i).toString());
            }
        }

    }
}
