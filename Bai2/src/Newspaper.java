public class Newspaper extends Library{
    private String releaseDate;

    public Newspaper(String documentID, String companyPublish, int releaseQuantity, String releaseDate) {
        super(documentID, companyPublish, releaseQuantity);
        this.releaseDate = releaseDate;
    }

    public Newspaper() {
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Newspaper "+super.toString()+ ", Ngày phát hành: "+releaseDate;
    }
}
