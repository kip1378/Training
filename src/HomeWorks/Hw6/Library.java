package HomeWorks.Hw6;

public class Library {

    Book[] books = null;

    public void printIndexCards() {
        for (Book book : books) {
            System.out.println(indexCardHeader);
            System.out.println(book.makeCard());
            //System.out.println("-----------------------");
        }
    }
    static Book makeBook(String title, String author, String language) {
        Book book = new Book();
        book.author = author;
        book.title = title;
        book.language = language;
        return book;
    }

    static String indexCardHeader = "===========BOOK===========";
}

