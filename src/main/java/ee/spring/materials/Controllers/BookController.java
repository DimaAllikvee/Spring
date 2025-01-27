package ee.spring.materials.Controllers;


import ee.spring.materials.models.Book;
import ee.spring.materials.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @DeleteMapping("delete-book/{id}")
    public List<Book> deleteBook(@PathVariable long id) {
        bookRepository.deleteById(id);
        return bookRepository.findAll();
    }

    @PutMapping("change-book")
    public List<Book> changeBook(@RequestBody Book book) {
        bookRepository.save(book);
        return bookRepository.findAll();
    }

    @PostMapping("add-book")
    public List<Book> addBook(@RequestBody Book book) {
        bookRepository.save(book);
        return bookRepository.findAll();
    }

    @GetMapping("book/{id}")
    public Book getBook(@PathVariable long id) {
        return bookRepository.findById(id).get();
    }

}

