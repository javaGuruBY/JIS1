package by.jrr.test;


import by.jrr.bean.Book;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book("Max", "JavaGuru", 100);

        String authorOfBook = book.getAuthor();
        String titleOfBook = book.getTitle();
        int numberOfPagesInBook = book.getNumberOfPages();

        System.out.println("authorOfBook = " + authorOfBook + "\ntitleOfBook " + titleOfBook +"\nnumberOfPagesInBook = " + numberOfPagesInBook);
        System.out.println(book.toString());

        book.setAuthor("Ne Max");
        book.setTitle("Ne JavaGuru");
        book.setNumberOfPages(100);

        System.out.println(book.toString());

        Book secondBook = new Book("Ne Max", "Ne JavaGuru", 100);

        System.out.println("secondBook.equals(book) = " + secondBook.equals(book));
    }

}
