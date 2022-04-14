package com.example.demo.specification; 
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.example.demo.entity.BookEntity;
import com.example.demo.vo.BookFilterVO;

public class BookSpecification implements Specification<BookEntity> {

	private static final long serialVersionUID = 1L;
	
	
	private transient BookFilterVO filter;
	
	public BookSpecification(BookFilterVO filter) {
		this.filter = filter;
	}
	
	
	@Override
	public Predicate toPredicate(Root<BookEntity> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

		List<Predicate> predicateList = new ArrayList<>();

		
		if (filter.existsAuthor()) {
			Predicate authorPredicate = criteriaBuilder.equal(root.get("author"), filter.getAuthorVO());
			predicateList.add(authorPredicate);
		}
		
		if (filter.existsGenre()) {
			Predicate genrePredicate = criteriaBuilder.equal(root.get("genre"), filter.getGenreVO());
			predicateList.add(genrePredicate);
		} 
		
		if (filter.existsLanguage()) {
			Predicate languagePredicate = criteriaBuilder.equal(root.get("language"), filter.getLanguageVO());
			predicateList.add(languagePredicate);
		}
		
	    return criteriaBuilder.and(predicateList.toArray(new Predicate[0]));
	}

}
