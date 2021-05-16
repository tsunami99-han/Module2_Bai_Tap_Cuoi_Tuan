public class Journal extends Library {
    private int releaseNumber;
    private int releaseMonth;

    public Journal() {
    }

    public Journal(String documentID, String companyPublish, int releaseQuantity, int releaseNumber, int releaseMonth) {
        super(documentID, companyPublish, releaseQuantity);
        this.releaseNumber = releaseNumber;
        this.releaseMonth = releaseMonth;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "Journal " + super.toString() + ", Số phát hành: " + releaseNumber + ", Tháng phát hành: " + releaseMonth;
    }
}
