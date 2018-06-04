package nuc.sw.service;

import nuc.sw.Dao.BookDao;
import nuc.sw.vo.Book;

import java.util.List;

/**
 * Created by superzhaolu on 2017/9/27.
 */
public class BookService {
    private BookDao bDao=new BookDao();
    public void addBook(Book b){
        bDao.addBook(b);
    }
    public List<Book> findAllBook(){
        return bDao.findAllBook();
    }
}
