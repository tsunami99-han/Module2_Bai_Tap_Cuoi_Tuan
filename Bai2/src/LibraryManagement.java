import java.util.Scanner;

public class LibraryManagement {
    Library[] library = new Library[20];
    int size = 0;
    Scanner sc = new Scanner(System.in);

    public void addToLibrary(Library name) {
        library[size] = name;
        size++;
    }

    public int findByID(String id) {
        for (int i = 0; i < size; i++) {
            if (library[i].getDocumentID().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public Library[] deleteByID(String id) {
        if (findByID(id) == -1) {
            return library;
        } else {
            Library[] library1 = new Library[library.length];
            for (int i = 0; i < findByID(id); i++) {
                library1[i] = library[i];
            }
            for (int i = findByID(id); i < size; i++) {
                library1[i] = library[i + 1];
            }
            size--;
            return library = library1;
        }
    }

    public void addByType() {
        String author = null;
        int releaseNumber = 0;
        int releaseMonth = 0;
        String releaseDate = null;
        System.out.println("Chọn loại tài liệu muốn thêm!");
        System.out.println("1.Sách");
        System.out.println("2.Tạp chí");
        System.out.println("3.Báo");
        System.out.println("Nhập lựa chọn:");
        int type = sc.nextInt();
        if (type < 1 || type > 3) {
            System.out.println("Lựa chọn không phù hợp,mời chọn lại");
            type = sc.nextInt();
        } else {
            System.out.println("Nhập ID:");
            String id = sc.next();
            if (findByID(id) != -1) {
                System.out.println("ID đã tồn tại, nhập lại ID");
                id = sc.next();
            }
            System.out.println("Nhà xuất bản: ");
            String trash = sc.nextLine();
            String nxb = sc.nextLine();
            System.out.println("Số lượng bản phát hành:");
            int releaseQuantity = sc.nextInt();
            if (type == 1) {
                System.out.println("Tên tác giả: ");
                String trash2 = sc.nextLine();
                author = sc.nextLine();
            } else if (type == 2) {
                System.out.println("Số phát hành:");
                releaseNumber = sc.nextInt();
                System.out.println("Tháng phát hành :");
                releaseMonth = sc.nextInt();
                if (releaseMonth < 1 || releaseMonth > 12) {
                    System.out.println("Tháng không phù hợp,nhập lại:");
                    releaseMonth = sc.nextInt();
                }
            } else {
                System.out.println("Ngày phát hành(dd/mm):");
//                    String trash3=sc.nextLine();
                releaseDate = sc.next();
            }
            if (type == 1) {
                Book book = new Book(id, nxb, releaseQuantity, author);
                addToLibrary(book);
            } else if (type == 2) {
                Journal journal = new Journal(id, nxb, releaseQuantity, releaseNumber, releaseMonth);
                addToLibrary(journal);
            } else if (type==3){
                Newspaper newspaper = new Newspaper(id, nxb, releaseQuantity, releaseDate);
                addToLibrary(newspaper);
            }
        }
    }


    public void findByType() {
        System.out.println("Bạn muốn tìm gì :");
        System.out.println("1.Sách");
        System.out.println("2.Tạp chí");
        System.out.println("3.Báo");
        System.out.println("0.Thoát");
        System.out.println("Nhập lựa chọn của bạn:");
        int choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("Danh sách sách trong thư viện:");
                    for (int i = 0; i < size; i++) {
                        if (library[i] instanceof Book) {
                            System.out.println(library[i].toString());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Danh sách tạp chí trong thư viện:");
                    for (int i = 0; i < size; i++) {
                        if (library[i] instanceof Journal) {
                            System.out.println(library[i].toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Danh sách báo trong thư viện");
                    for (int i = 0; i < size; i++) {
                        if (library[i] instanceof Newspaper) {
                            System.out.println(library[i].toString());
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không phù hợp! Mời chọn lại");
            }
            System.out.println("Nhập lựa chọn của bạn:");
            choice = sc.nextInt();
        }
    }

    public void disPlay() {
        for (int i = 0; i < size; i++) {
            System.out.println(library[i]);
        }
    }
}
