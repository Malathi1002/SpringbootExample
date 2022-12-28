package com.kgisl.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.demo1.model.Book;

@Repository
public interface Bookrepository extends JpaRepository<Book,Integer> {
    
}