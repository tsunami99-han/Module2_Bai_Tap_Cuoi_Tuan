import java.util.Scanner;

public class QuanLyCanBo {
    Canbo[] danhSach = new Canbo[100];
    int size = 0;


    public void them(Canbo canbo) {
        danhSach[size] = canbo;
        size++;
    }

    public int timKiem(String ten) {
        for (int i = 0; i < size; i++) {
            if (danhSach[i].getHoTen().equals(ten)) {
                return i;
            }
        }
        return -1;
    }

    public void hienThi() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
    }

    public static void main(String[] args) {
        QuanLyCanBo ql = new QuanLyCanBo();
        System.out.println("Quản lí cán bộ");
        System.out.println("1.Thêm");
        System.out.println("2.Tìm kiếm");
        System.out.println("3.Hiển thị danh sách");
        System.out.println("0.Thoát!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lựa chọn:");
        int luachon = sc.nextInt();
        while (luachon != 0) {
            switch (luachon) {
                case 1:
                    System.out.println("Đối tượng bạn muốn thêm là:");
                    System.out.println("1.Nhân viên");
                    System.out.println("2.Công nhân");
                    System.out.println("3.Kỹ Sư");
                    System.out.println("Nhập lựa chọn:");
                    int viTri = sc.nextInt();
                    if (viTri < 0 || viTri > 3) {
                        System.out.println("Lựa chọn không hợp lệ!Mời chọn lại:");
                        viTri = sc.nextInt();
                    }
                    //VẤN ĐỀ NÀY CẦN GIẢI QUYẾT
                    String trash = sc.nextLine();
                    System.out.println("Nhập họ tên:");
                    String ten = sc.nextLine();
                    System.out.println("Nhập tuổi:");
                    int tuoi = sc.nextInt();
                    System.out.println("Nhập giới tính:");
                    String gioiTinh = sc.next();
                    //VẤN ĐỀ NÀY CẦN GIẢI QUYẾT
                    String trash1 = sc.nextLine();
                    System.out.println("Nhập địa chỉ:");
                    String diaChi = sc.nextLine();
                    String congViec = null;
                    int capBac = 1;
                    String chuyenNganh = null;
                    if (viTri == 1) {
                        System.out.println("Nhập công việc:");
                        congViec = sc.nextLine();
                    }
                    if (viTri == 2) {
                        System.out.println("Cấp bậc là (1-10)");
                        capBac = sc.nextInt();
                        if (capBac < 1 || capBac > 10) {
                            System.out.println("Cấp bậc không phù hợp,mời nhâp lại:");
                            capBac = sc.nextInt();
                        }
                    }
                    if (viTri == 3) {
                        System.out.println("Chuyên ngành là:");
                        chuyenNganh = sc.nextLine();
                    }
                    if (viTri == 1) {
                        NhanVien nhanVien = new NhanVien(ten, tuoi, gioiTinh, diaChi, congViec);
                        ql.them(nhanVien);
                    } else if (viTri == 2) {
                        CongNhan congNhan = new CongNhan(ten, tuoi, gioiTinh, diaChi, capBac);
                        ql.them(congNhan);
                    } else if (viTri == 3) {
                        KySu kySu = new KySu(ten, tuoi, gioiTinh, diaChi, chuyenNganh);
                        ql.them(kySu);
                    }
                    break;
                case 2:
                    System.out.println("Nhập tên bạn muốn tìm kiếm:");
                    String trash3 = sc.nextLine();
                    String tenCanTim = sc.nextLine();
                    if (ql.timKiem(tenCanTim) != -1) {
                        System.out.println(tenCanTim + " ở vị trí số " + ql.timKiem(tenCanTim));
                    }else {
                        System.out.println("Người cần tìm không có trong danh sách!");
                    }
                    break;
                case 3:
                    ql.hienThi();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không phù hợp!");
            }
            System.out.println("Nhập lựa chọn:");
            System.out.println("Quản lí cán bộ");
            System.out.println("1.Thêm");
            System.out.println("2.Tìm kiếm");
            System.out.println("3.Hiển thị danh sách");
            System.out.println("0.Thoát!");
            luachon = sc.nextInt();
        }
    }
}


