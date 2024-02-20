package todospringboot.com.example.todospringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import todospringboot.com.example.todospringboot.model.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
