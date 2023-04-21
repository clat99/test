package org.example.test;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.List;

import org.example.domain.Book;

public class ListTest {
	private List<Book> bookList;

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void addBooks(Book[] arr) {
		if (this.bookList != null) {
			if (arr != null) {
				for (Book book : arr)
					this.bookList.add(book);
			}
		}
	}

	public Book findBook(int bookId) {
		if (this.bookList != null) {
			Book key = new Book();
			key.setId(bookId);
			if (this.bookList.contains(key)) {
				int index = this.bookList.indexOf(key);
				Book value = this.bookList.get(index);
				return value;
			}
		}
		return null;
	}

	public boolean removeBook(int bookId) {
		if (this.bookList != null) {
			Book key = new Book();
			key.setId(bookId);
			if (this.bookList.contains(key)) {
				this.bookList.remove(key);
				return true;
			}
		}
		return false;
	}

	public void printBooks(Comparator<Book> comparator) {
		if (this.bookList != null) {
			this.bookList.sort(comparator);
			this.bookList.forEach(System.out::println);
		}
	}
	
	public void writeRecord( String pathname )throws Exception {
		try( ObjectOutputStream outputStream = new ObjectOutputStream( new BufferedOutputStream(new FileOutputStream(new File(pathname))))){
			outputStream.writeObject(this.bookList);
		}
	}
	@SuppressWarnings("unchecked")
	public void readRecord( String pathname )throws Exception {
		try( ObjectInputStream inputStream = new ObjectInputStream(new BufferedInputStream( new FileInputStream(new File(pathname))))){
			this.bookList = (List<Book>) inputStream.readObject();
		}
	}
}
