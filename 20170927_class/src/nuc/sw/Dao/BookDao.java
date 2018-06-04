package nuc.sw.Dao;

import nuc.sw.DB.BookDB;
import nuc.sw.vo.Book;

import java.util.List;

/**
 * Created by superzhaolu on 2017/9/27.
 */
public class BookDao {
    public void addBook(Book b){
        BookDB.books.add(b);
    }
    public List<Book> findAllBook(){
        return BookDB.books;
    }
}
