package HomeWorks.Hw6;

public class Book {
    String title;
    String author;
    String language;
    int pages;

    public String makeCard() {
        return title + "\n" + author + "\n" + language + ", " + pages + " pages";
    }

}
