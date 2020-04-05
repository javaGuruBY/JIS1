import bean.Book;
import exception.ItemNotFoundException;
import service.BookRepository;

import java.util.Arrays;

public class AppBook {
    public static void main(String[] args) throws ItemNotFoundException {
        BookRepository repository = new BookRepository();

        repository.save(new Book("Java за три дня", "Сказочник какой-то", 9999));
        repository.save(new Book("Coronavirus or how to cook the bat", "Chinese people", 25));
        repository.save(new Book("Surviving with MTZ-80 in field", "Belorussian government", 3));

        System.out.println(Arrays.toString(repository.findAll().toArray()));

        System.out.println(repository.findById(3));

        repository.delete(1);

        System.out.println(Arrays.toString(repository.findAll().toArray()));
    }
}
