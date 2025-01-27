package ee.spring.materials.Controllers;



import ee.spring.materials.models.Comment;
import ee.spring.materials.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class CommentController {

    @Autowired
    CommentRepository commentRepository;

    @GetMapping
    public List<Comment> getComments() {
        return commentRepository.findAll();
    }

    @DeleteMapping("delete-comment/{id}")
    public List<Comment> deleteComment(@PathVariable long id) {
        commentRepository.deleteById(id);
        return commentRepository.findAll();
    }

    @PutMapping("change-comment")
    public List<Comment> changeComment(@RequestBody Comment comment) {
        commentRepository.save(comment);
        return commentRepository.findAll();
    }

    @PostMapping("add-comment")
    public List<Comment> addBook(@RequestBody Comment comment) {
        commentRepository.save(comment);
        return commentRepository.findAll();
    }

    @GetMapping("comment/{id}")
    public Comment getComment(@PathVariable long id) {
        return commentRepository.findById(id).get();
    }

}

