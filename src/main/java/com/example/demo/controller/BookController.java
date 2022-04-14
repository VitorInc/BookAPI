package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BookService;
import com.example.demo.vo.BookFilterVO;
import com.example.demo.vo.BookResumeVO;
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
	
	@GetMapping("/filter")
	public ResponseEntity<Page<BookResumeVO>> searchFilteredBooks(
			@PageableDefault(size = 20) Pageable pageable, BookFilterVO vo) {

		return ResponseEntity.status(HttpStatus.OK)
				.body(bookService.bookFilteredResearch(pageable, vo));
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<BookVO> findBookPerId(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).body(bookService.findBookById(id));
	}

}
