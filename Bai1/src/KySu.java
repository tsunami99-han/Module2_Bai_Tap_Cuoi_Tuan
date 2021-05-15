public class KySu extends Canbo{
    private String chuyenNganh;

    public KySu() {
    }

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String chuyenNganh) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "Kỹ sư "+
                super.toString()+
                ", Chuyên ngành: "+getChuyenNganh();
    }
}
