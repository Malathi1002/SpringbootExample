package com.kgisl.demo1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kgisl.demo1.model.Book;
import com.kgisl.demo1.repository.Bookrepository;


@Controller
public class Scontroller {
    @Autowired
    Bookrepository bookrepository;
    @RequestMapping("/wel")
    @ResponseBody
    public String hello(){
        System.out.println("welcome");
        return "Hai";
    }

@GetMapping("/books")
@ResponseBody
public List<Book> getall()
{
    return  bookrepository.findAll();
 }

 @RequestMapping("/create")
 @ResponseBody
public void create()
{
    Book b=new Book();
    b.setId(7);
    b.setAuthor("Priya");
    b.setPrice(4446);
    b.setTitle("Memories");
    bookrepository.save(b);
}

@RequestMapping("/delete")
@ResponseBody
public void delete()
{
    bookrepository.deleteById(1);;
}
@RequestMapping("/update")
@ResponseBody
public void update()
{
   Book b=new Book();
   b.setId(2);
   b.setAuthor("Sam");
   b.setPrice(123);
   b.setTitle("afsfg");
   bookrepository.save(b);
}
@RequestMapping("/id")
@ResponseBody
public Optional<Book> getbyid()
{
    return bookrepository.findById(2);
}
}
