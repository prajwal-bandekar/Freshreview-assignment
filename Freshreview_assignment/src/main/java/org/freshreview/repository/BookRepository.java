package org.freshreview.repository;

import java.util.List;

import org.freshreview.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface BookRepository extends JpaRepository<Book, Long>{
    List<Book> findAll();
}
