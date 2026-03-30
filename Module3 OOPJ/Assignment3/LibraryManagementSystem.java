class Book {
    int id;
    String title;
    String author;
    boolean isAvailable;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void display() {
        String status = isAvailable ? "Available" : "Issued";
        System.out.println("Book ID: " + id);
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Status: " + status);
    }
}

class LibraryManagementSystem {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        int totalBooks = 0;

        library[0] = new Book(101, "Winges of Fire", "APJ Abdul Kalam");
        library[1] = new Book(102, "C++ Programming", "Badrinath");
        library[2] = new Book(103, "Aptitude", "RD Sharma");
        totalBooks = 3;

        System.out.println("Total Books in Library: " + totalBooks);

        System.out.println("====== Attempting to Issue ID 101 =======");
        int searchId = 101;
        for (int i = 0; i < totalBooks; i++) {
            if (library[i].id == searchId) {
                if (library[i].isAvailable) {
                    library[i].isAvailable = false;
                    System.out.println("Success: Book Issued.");
                } else {
                    System.out.println("Error: Book already issued.");
                }
            }
        }

        System.out.println("====== Attempting to Issue ID 101 again =======");
        for (int i = 0; i < totalBooks; i++) {
            if (library[i].id == searchId) {
                if (library[i].isAvailable) {
                    library[i].isAvailable = false;
                } else {
                    System.out.println("Cannot issue. Book is currently unavailable.");
                }
            }
        }

        System.out.println("========= Returning ID 101 =========");
        for (int i = 0; i < totalBooks; i++) {
            if (library[i].id == searchId) {
                library[i].isAvailable = true;
                System.out.println("Success: Book returned to shelf.");
            }
        }

        System.out.println("========== Final Book Status ==========");
        for (int i = 0; i < totalBooks; i++) {
            library[i].display();
        }
    }
}
