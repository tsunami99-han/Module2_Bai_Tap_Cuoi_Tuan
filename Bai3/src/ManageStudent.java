import java.util.Scanner;

public class ManageStudent {
    Student[] student = new Student[50];
    public int size = 0;
    public Scanner sc = new Scanner(System.in);

    public void addNewStudent(Student st) {
        student[size] = st;
        size++;
    }

    public void displayList() {
        for (int i = 0; i < size; i++) {
            System.out.println(student[i]);
        }
    }

    public void addByEnter() {
        System.out.println("Enter new student's information:");
        System.out.println("ID: ");
        int id = sc.nextInt();
        while (findByID(id) != -1) {
            System.out.println("Error, re-enter ID:");
            id = sc.nextInt();
        }
        System.out.println("Name:");
        String trash = sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Adress:");
        String adress = sc.nextLine();
        System.out.println("Priority:");
        int priority = sc.nextInt();
        System.out.println("ExamBlock:");
        String block = sc.next();
        while (!block.equals("A")&&!block.equals("B")&&!block.equals("C")) {
            System.out.println("Error. Please re-enter block:");
            block = sc.next();
        }
        if (block.equals("A")) {
            StudentBlockA studentBlockA = new StudentBlockA(id, name, adress, priority);
            addNewStudent(studentBlockA);
        } else if (block.equals("B")) {
            StudentBlockB studentBlockB = new StudentBlockB(id, name, adress, priority);
            addNewStudent(studentBlockB);
        } else if (block.equals("C")) {
            StudentBlockC studentBlockC = new StudentBlockC(id, name, adress, priority);
            addNewStudent(studentBlockC);
        }
    }

    public int findByID(int id) {
        for (int i = 0; i < size; i++) {
            if (student[i].getIdStudent() == id) {
                return i;
            }
        }
        return -1;
    }

}
