import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ManageStudent manageStudent=new ManageStudent();
        StudentBlockA a=new StudentBlockA(123,"Doan Son","Nam Dinh",1);
        StudentBlockB b=new StudentBlockB(124,"Nguyen Tien","Hai Phong",2);
        StudentBlockC c=new StudentBlockC(125,"Hieu Nguyen","Ha Noi",3);
        manageStudent.addNewStudent(a);
        manageStudent.addNewStudent(b);
        manageStudent.addNewStudent(c);
        System.out.println("Student Management!");
        System.out.println("1.Add new student.");
        System.out.println("2.Display list.");
        System.out.println("3.Find by ID");
        System.out.println("0.Exit");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        while (choice!=0){
            switch (choice){
                case 1:
                    manageStudent.addByEnter();
                    break;
                case 2:
                    manageStudent.displayList();
                    break;
                case 3:
                    System.out.println("Enter ID:");
                    int id=sc.nextInt();
                    if (manageStudent.findByID(id)!=-1){
                        System.out.println("Information by id "+id+" is "+manageStudent.student[manageStudent.findByID(id)]);
                    }else {
                        System.out.println("No information!");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
            System.out.println("Student Management!");
            System.out.println("1.Add new student.");
            System.out.println("2.Display list.");
            System.out.println("3.Find by ID");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
        }
    }
}
