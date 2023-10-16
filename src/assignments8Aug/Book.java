package assignments;

import java.util.ArrayList;

public class Book {

		   String title;
		   String Author;
		   String ISBN;
		   ArrayList < String > BookList;

		  public Book(String BookTitle, String Author, String ISBN) {
			  this.title = BookTitle;
			  this.Author = Author;
			  this.ISBN = ISBN;
			  this.BookList = new ArrayList < String > ();
		  }

		  public String get_title() {
			    return this.title;
			  }
		  
		  public void set_radius(String Booktitle) {
			  	this.title = Booktitle;
			  }
		  public String get_Author() {
			    return this.title;
			  }
		  
		  public void set_Author(String BookAuthor) {
			  	this.title = BookAuthor;
			  }
		  public String get_ISBN() {
			    return this.title;
			  }
		  
		  public void set_ISBN(String ISBN) {
			  	this.ISBN = ISBN;
			  }
		 

		  public ArrayList < String > getBookList() {
		    return BookList;
		  }

		  public void addBooks(String course) {
			  BookList.add(course);
		  }

		  public void removeBooks(String course) {
			  BookList.remove(course);
		  }
		  public void printBookDetails() {
			  System.out.println("Book Title: " + title+ " Author: " + Author+ " and ISBN is "+ISBN);
			  System.out.println("Course List: "+this.BookList);
		  }
		}
