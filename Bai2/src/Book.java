public class Book extends Library{
    private String author;

    public Book() {
    }

    public Book(String documentID, String companyPublish, int releaseQuantity, String author) {
        super(documentID, companyPublish, releaseQuantity);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: "+super.toString()+", Tác giả: "+author;
    }
}
