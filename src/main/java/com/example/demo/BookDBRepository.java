package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookDBRepository extends CrudRepository<Book, Long> {

}
