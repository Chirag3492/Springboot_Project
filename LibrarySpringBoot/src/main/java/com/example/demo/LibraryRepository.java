package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.Date;


@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface LibraryRepository extends CrudRepository<Library,Long>{
	List<Library> findBybookName(@Param("book") String bookName);
	List<Library> findByauthorName(@Param("author") String authorName);
	List<Library> findBybook_id(@Param("id") long book_id,@Param("book") String bookName);	
	List<Library> findBypublishDate(@Param("date") Date publishDate );
	List<Library> findByquantity(@Param("quantity") int quantity);
	List<Library> findByprice(@Param("price") int price );
	
}
