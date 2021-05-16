public class Library {
    private String documentID;
    private String companyPublish;
    private int releaseQuantity;

    public Library(String documentID, String companyPublish, int releaseQuantity) {
        this.documentID = documentID;
        this.companyPublish = companyPublish;
        this.releaseQuantity = releaseQuantity;
    }

    public Library() {
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getCompanyPublish() {
        return companyPublish;
    }

    public void setCompanyPublish(String companyPublish) {
        this.companyPublish = companyPublish;
    }

    public int getReleaseQuantity() {
        return releaseQuantity;
    }

    public void setReleaseQuantity(int releaseQuantity) {
        this.releaseQuantity = releaseQuantity;
    }

    @Override
    public String toString() {
        return "Mã tại liệu: "+documentID+
                ", Nhà xuất bản: "+companyPublish+
                ", Số bản phát hành: "+releaseQuantity;
    }
}
