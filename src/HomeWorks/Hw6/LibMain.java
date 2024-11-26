package HomeWorks.Hw6;

public class LibMain {
    public static void main(String[] args) {

        Book onegin = new Book();
        onegin.title = "Евгений Онегин";
        onegin.author = "A. C. Пушкин";
        onegin.language = "Russian";
        onegin.pages = 800;

        System.out.println(onegin.makeCard());

        Book anotherOnegin = new Book();
        anotherOnegin.title = "Евгений Онегин";
        anotherOnegin.author = "A. C. Пушкин";
        anotherOnegin.language = "Russian";
        anotherOnegin.pages = 800;

        System.out.println(onegin == anotherOnegin);



        Book ivenhoe = new Book();
        ivenhoe.title = "Ivanhoe";
        ivenhoe.author = "W. Scott";
        ivenhoe.language = "English";
        ivenhoe.pages = 500;

        Book gore = Library.makeBook("Горе от ума", "А.С. Грибоедов", "Russian");

        Library LibraryOfCongress = new Library();
        LibraryOfCongress.books = new Book[] {onegin, ivenhoe, gore};
        LibraryOfCongress.printIndexCards();
//
//        System.out.println("\n====================================\n");
//
//        Library schoolLibrary = new Library();
//        schoolLibrary.books = new Book [] {gore, onegin};
//        schoolLibrary.printIndexCards();

    }
}

