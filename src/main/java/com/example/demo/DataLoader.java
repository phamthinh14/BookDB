package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {
    @Autowired
    BookDBRepository bookDBRepository;

    @Override
    public void run(String... args) throws Exception {
        Book book = new Book("Game of Rome","George and yellow suit guy","06/07/2018");
        bookDBRepository.save(book);
        book = new Book("Barney","Purple Dinosaur","1/1/2011");
        bookDBRepository.save(book);
        book = new Book("Spring Boot in Action"," Baeldung","13/1/2011");
        bookDBRepository.save(book);
        book = new Book("Tales of demon and god","Snail","1/1/2099");
        bookDBRepository.save(book);
        book = new Book("Amazon Web Services","Andy Jassy","31/12/2000");
        bookDBRepository.save(book);
        book = new Book("Semiconductor manufacturing company","Robert H. Swan ","11/11/2111");
        bookDBRepository.save(book);

    }
}
