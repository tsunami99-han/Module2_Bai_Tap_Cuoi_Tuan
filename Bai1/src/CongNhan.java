public class CongNhan  extends Canbo{
    private int capBac;
    public CongNhan(){}

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int capBac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.capBac = capBac;
    }

    public int getCapBac() {
        return capBac;
    }

    public void setCapBac(int capBac) {
        this.capBac = capBac;
    }

    @Override
    public String toString() {
        return "Công nhân "+
                super.toString()+
                ", Cấp bậc: "+getCapBac();
    }
}
