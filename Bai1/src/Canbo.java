public class Canbo {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public Canbo() {
        tuoi = 18;
    }

    public Canbo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String isGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String toString() {
        return "Họ tên: " + hoTen +
                ", Tuổi: " + tuoi +
                ", Giới tính: " + gioiTinh +
                ", Địa chỉ: " + diaChi;

    }


}

