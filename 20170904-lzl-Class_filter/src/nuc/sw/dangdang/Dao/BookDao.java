package nuc.sw.dangdang.Dao;

import nuc.sw.dangdand.vo.Book;
import nuc.sw.dangdang.DB.BookDB;

import java.util.List;

/**
 * Created by superzhaolu on 2017/9/7.
 */
public class BookDao {
    public void AddBook(Book book){
        BookDB.bookList.add(book);
    }
    public List<Book> getBooks(){
        return BookDB.bookList;
    }
}
