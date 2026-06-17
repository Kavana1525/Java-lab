class Library {

    static class Book {
        int bookId;
        String bookName;
        String author;

        Book(int bookId, String bookName, String author) {
            this.bookId = bookId;
            this.bookName = bookName;
            this.author = author;
        }

        void displayBook() {
            System.out.println("----- Book Details -----");
            System.out.println("Book ID: " + bookId);
            System.out.println("Book Name: " + bookName);
            System.out.println("Author: " + author);
        }
    }
}

class Hospital {

    static class Doctor {
        int doctorId;
        String doctorName;
        String specialization;

        Doctor(int doctorId, String doctorName, String specialization) {
            this.doctorId = doctorId;
            this.doctorName = doctorName;
            this.specialization = specialization;
        }

        void displayDoctor() {
            System.out.println("----- Doctor Details -----");
            System.out.println("Doctor ID: " + doctorId);
            System.out.println("Doctor Name: " + doctorName);
            System.out.println("Specialization: " + specialization);
        }
    }
}

public class MainLibrary {
    public static void main(String[] args) {

        Library.Book b1 = new Library.Book(201, "Java Programming", "James Gosling");
        b1.displayBook();

        System.out.println();

        Hospital.Doctor d1 = new Hospital.Doctor(101, "Dr. Sharma", "Cardiology");
        d1.displayDoctor();
    }
}