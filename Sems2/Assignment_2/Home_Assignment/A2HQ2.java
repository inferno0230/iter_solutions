package Sems2.Assignment_2.Home_Assignment;

class Book {
    String BName;
    int BEdition;
    double BPrice;

    public Book(String name, int edition, double price) {
        BName = name;
        BEdition = edition;
        BPrice = price;
    }

    public void display() {
        System.out.println("Name: " + BName);
        System.out.println("Edition: " + BEdition);
        System.out.println("Price: " + BPrice);
    }
}



public class A2HQ2 {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("Book 1", 1, 10.99);
        books[1] = new Book("Book 2", 2, 15.99);
        books[2] = new Book("Book 3", 3, 20.99);
        books[3] = new Book("Book 4", 1, 8.99);
        books[4] = new Book("Book 5", 2, 12.99);

        Book maxPriceBook = books[0];
        for (int i = 1; i < books.length; i++) {
            Book currentBook = books[i];
            if (currentBook.BPrice > maxPriceBook.BPrice) {
                maxPriceBook = currentBook;
            }
        }

        System.out.println("Book with maximum price:");
        maxPriceBook.display();
    }
}

