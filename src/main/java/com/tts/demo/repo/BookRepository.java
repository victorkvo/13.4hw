package com.tts.demo.repo;

import com.tts.demo.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    // this method will be generated for us by spring
    // the generation will follow the name of the method
    // in order to perform the requested functionality
    List<Book> findByTitle(String title);

}
