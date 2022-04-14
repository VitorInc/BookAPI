package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BookEntity;
import com.example.demo.exception.NaoEncontradoException;
import com.example.demo.repository.BookRepository;
import com.example.demo.specification.BookSpecification;
import com.example.demo.vo.BookFilterVO;
import com.example.demo.vo.BookResumeVO;
import com.example.demo.vo.BookVO;

@Service
public class BookService {

	private static final Logger log = LoggerFactory.getLogger(BookService.class);
	
	@Autowired
	private BookRepository bookRepository;

	public BookVO findBookById(Long id) {
		
		
		
		log.info("\nSEARCH WITH ID\n");
		BookEntity entity = bookRepository.findById(id).
				orElseThrow(() -> new NaoEncontradoException("NO BOOK WERE FOUND WITH THE GIVEN ID"));
		log.info("\nSEARCH SUCCESSFUL\n");
		
		return converteToVO(new BookVO(), entity);
	}

	
	public Page<BookResumeVO> bookFilteredResearch(Pageable p, BookFilterVO filter){
		
		log.info("SEARCH WITH FILTER\n");
		
		Page<BookEntity> filtered = bookRepository.findAll(new BookSpecification(filter), p);
		log.info("SEARCH WITH SUCCESSFUL\n");

		
		return filtered.map(this::convertResumeToVO);
	}

	public BookVO savingBook(BookVO vo) {
		
		BookEntity entity = new BookEntity();
		
		log.info("\nSAVING METHOD BEGAN\n");
		entity = bookRepository.save(converteToEntity(vo, entity));
		log.info("\nSAVING DONE\n");
		
		return this.converteToVO(new BookVO(), entity);
	}
	
	public BookVO converteToVO(BookVO vo, BookEntity entity) {
		
		log.info("CONVERTING ENTITY TO VO");
		vo.setDateVO(entity.getDate());
		vo.setNameVO(entity.getName());
		vo.setGenderVO(entity.getGenre());
		vo.setPriceVO(entity.getPrice());
		vo.setAuthorVO(entity.getAuthor());
		vo.setLanguageVO(entity.getLanguage());
		
		log.info("CONVERTION DONE!");

		
		return vo;
	}
	
	public BookEntity converteToEntity (BookVO vo, BookEntity entity) {
		
		log.info("CONVERTING ENTITY TO VO");
		
		entity.setName(vo.getNameVO());
		entity.setPrice(vo.getPriceVO());
		entity.setGenre(vo.getGenderVO());
		entity.setPrice(vo.getPriceVO());
		entity.setLanguage(vo.getLanguageVO());
		entity.setAuthor(vo.getAuthorVO());
		
		log.info("CONVERTION DONE!");

		return entity;
		
	}
	
	public BookResumeVO convertResumeToVO(BookEntity entity) {
		BookResumeVO vo = new BookResumeVO();
		
		vo.setNameVO(entity.getName());
		vo.setGenreVO(entity.getGenre());
		vo.setAuthorVO(entity.getAuthor());
		
		return vo;
	}
	
	
	
	
}
