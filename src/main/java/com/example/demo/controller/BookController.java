package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BookService;
import com.example.demo.vo.BookVO;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping
	private ResponseEntity<BookVO> persistBookData(@Valid @RequestBody BookVO vo) {

		return ResponseEntity.status(HttpStatus.CREATED).body(bookService.savingBook(vo));
	}

}
