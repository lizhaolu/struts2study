package nuc.sw.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc.sw.service.BookService;
import nuc.sw.vo.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by superzhaolu on 2017/9/27.
 */
public class BookAction extends ActionSupport implements ModelDriven<Book> {

    private Book b=new Book();
    private BookService bService= (BookService) new BookService();
    private List<Book> books=new ArrayList<Book>();

    @Override
    public Book getModel(){
        return b;
    }

    //添加书籍
    public String addBook(){
        bService.addBook(b);
        return "addOK";
    }

    //查询所有书籍
    public String findAllBook(){
        books=bService.findAllBook();
        return "findallOk";
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
