class Book {
    int bookid;
    String bookName;

    Book(int id, String name) {
        this.bookid = id;
        this.bookName = name;
    }
}

class Library {
    public void display(Book[] books) {
        System.out.println("==========Library Books ==========");
        for (Book b : books) {
            System.out.println("ID: " + b.bookid);
            System.out.println("Name: " + b.bookName);
        }
        System.out.println("==================================");
    }
}
class LibrarySystem
{
    public static void main(String[] args) {
        
        Book b1 = new Book(101, "C++ Programming");
        Book b2 = new Book(102, "Database Technologies");
        Book b3 = new Book(103, "Object Oriented Programming");

        Book[] bklist = {b1, b2, b3};

        Library l = new Library();
        l.display(bklist);
    }
}
