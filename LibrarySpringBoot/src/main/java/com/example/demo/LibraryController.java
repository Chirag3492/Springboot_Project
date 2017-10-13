package com.example.demo;

import java.util.List;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LibraryController {
	@Autowired
	LibraryRepository repository;
	private Library library;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
    public Library process(@RequestParam(value="book") String bookName,@RequestParam(value="author") String authorName,@RequestParam(value="date") Date publishDate,@RequestParam(value="quantity") int quantity,@RequestParam(value="price") int price ){
       /* repository.save(new Customer(first, last));
        return new Customer(first,last);*/
		return repository.save(new Library(bookName,authorName,publishDate,quantity,price));
    }
	
//	CrudRepository interface---> predefined methods to perform the crud op: create
//	public int run(){
//		return 0;
//	}
	
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public Library getLibrary(@RequestParam(value="id") long book_id)
	{
		return repository.findOne(book_id);
		
	}
	
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	public Iterable<Library> getAllLibrary()
	{
		return repository.findAll();
		
	}
	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
	public String deleteLibrary(@RequestParam(value="id") long book_id)
	{
		 repository.delete(book_id);
		 return "Record Deleted!!!";
		 
		
	}
	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
	public String deleteLibrary()
	{
		 repository.deleteAll();
		 return "All Records Deleted!!!";
		 
		
	}
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public Library updateLibrary(@RequestParam(value="id") long book_id)
	{
		Library lib = (Library) repository.findOne(book_id);
		lib.setBookName(library.getBookName());
		lib.setAuthorName(library.getAuthorName());
		lib.setPublishDate(library.getPublishDate());
		lib.setQuantity(library.getQuantity());
		lib.setPrice(library.getPrice());
		return repository.save(lib);
	}
	

}

