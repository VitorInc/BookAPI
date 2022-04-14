package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BookEntity;
import com.example.demo.specification.BookSpecification;
import com.example.demo.vo.BookFilterVO;

@Repository
public interface BookRepository extends PagingAndSortingRepository<BookEntity, Long>, JpaSpecificationExecutor<BookEntity> {

	
}
