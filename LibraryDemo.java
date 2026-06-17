abstract class LibraryItem {
    String title;

    LibraryItem(String title) {
        this.title = title;
    }

    abstract void issueItem();
    abstract void returnItem();
}

class Book extends LibraryItem {

    Book(String title) {
        super(title);
    }

    void issueItem() {
        System.out.println("Book \"" + title + "\" has been issued.");
    }

    void returnItem() {
        System.out.println("Book \"" + title + "\" has been returned.");
    }
}

class Magazine extends LibraryItem {

    Magazine(String title) {
        super(title);
    }

    void issueItem() {
        System.out.println("Magazine \"" + title + "\" has been issued.");
    }

    void returnItem() {
        System.out.println("Magazine \"" + title + "\" has been returned.");
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        LibraryItem book = new Book("Java Programming");
        LibraryItem magazine = new Magazine("Science Today");

        book.issueItem();
        book.returnItem();

        magazine.issueItem();
        magazine.returnItem();
    }
}