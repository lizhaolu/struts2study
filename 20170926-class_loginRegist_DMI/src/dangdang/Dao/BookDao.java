package dangdang.Dao;


import dangdang.DB.BookDB;
import dangdang.vo.Book;

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
