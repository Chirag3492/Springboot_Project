package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="library")
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long book_id;
	
	 @Column(name = "book_name")
	    private String bookName;
	 
	  @Column(name = "author_name")
	  private String authorName;
	  
	  @Column(name = "publish_date")
	  private Date publishDate;
	  
	  @Column(name = "quantity")
	  private int quantity;
	  
	 @Column(name = "price")
	  private int price;
	  
	  protected  Library() {
	    }
	 
	    public  Library(String bookName, String authorName,Date publishDate,int quantity,int price) {
	        this.bookName = bookName;
	        this.authorName = authorName;
	        this.publishDate = publishDate;
	        this.quantity = quantity;
	        this.price = price;
	    }

		public long getBookId() {
			return book_id;
		}

		public void setBookId(long book_id) {
			this.book_id = book_id;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public String getAuthorName() {
			return authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
	    
		public Date getPublishDate() {
			return publishDate;
		}

		public void setPublishDate(Date publishDate) {
			this.publishDate = publishDate;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
}


