import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManagement ql = new LibraryManagement();
        Scanner sc = new Scanner(System.in);
        Book a = new Book("M124", "KimDong", 100, "Tố hữu");
        Journal b = new Journal("M127", "NXB Hà Nội", 400, 12, 10);
        Newspaper c = new Newspaper("M129", "Báo Tiền Phong", 1000, "12/02");
        Book a1 = new Book("M125", "KimDong", 100, "Tố hữu");
        Journal b1 = new Journal("M128", "NXB Hà Nội", 400, 12, 10);
        Newspaper c1 = new Newspaper("M130", "Báo Tiền Phong", 1000, "12/02");
        ql.addToLibrary(a);
        ql.addToLibrary(b);
        ql.addToLibrary(c);
        ql.addToLibrary(a1);
        ql.addToLibrary(b1);
        ql.addToLibrary(c1);
        System.out.println("Trình quản lý thư viện: ");
        System.out.println("1.Thêm tài liệu");
        System.out.println("2.Tìm kiếm tài liệu theo ID");
        System.out.println("3.Tìm kiếm theo loại");
        System.out.println("4.Xóa theo ID");
        System.out.println("5.Hiển thị danh sách");
        System.out.println("0. Thoát");
        System.out.println("Nhập lựa chọn của bạn:");
        int choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    ql.addByType();
                    break;
                case 2:
                    System.out.println("Nhập ID tìm kiếm :");
                    String idFind = sc.next();
                    if (ql.findByID(idFind) != -1) {
                        System.out.println("Tài liệu cần tìm ở vị trí số" + ql.findByID(idFind) + 1);
                    } else {
                        System.out.println("Không có tài liệu cần tìm.");
                    }
                    break;
                case 3:
                    ql.findByType();
                    break;
                case 4:
                    System.out.println("Nhập ID muốn xóa:");
                    String idDelete = sc.next();
                    if (ql.findByID(idDelete) == -1) {
                        System.out.println("ID không tồn tại");
                    } else {
                        ql.deleteByID(idDelete);
                        System.out.println("Đã xóa tài liệu có ID là :" + idDelete);
                    }
                    break;
                case 5:
                    ql.disPlay();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn.");
            }
            System.out.println("Trình quản lý thư viện: ");
            System.out.println("1.Thêm tài liệu");
            System.out.println("2.Tìm kiếm tài liệu theo ID");
            System.out.println("3.Tìm kiếm theo loại");
            System.out.println("4.Xóa theo ID");
            System.out.println("5.Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn:");
            choice = sc.nextInt();
        }
    }

}
