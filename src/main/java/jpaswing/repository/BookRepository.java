package jpaswing.repository;

import jpaswing.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface BookRepository extends CrudRepository<Book, Long> {
    public Book findFirstByOrderByIdAsc();
}