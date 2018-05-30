package nuc.sw.dangdang.servlet;

import nuc.sw.dangdand.vo.Book;
import nuc.sw.dangdang.Dao.BookDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by superzhaolu on 2017/9/4.
 */
@WebServlet(name = "AddServlet",urlPatterns ="/addservlet")
public class AddServlet extends HttpServlet {
    List<Book> list;
    private BookDao dao=new BookDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Book book=new Book();
        book.setBookName(request.getParameter("bookname"));
        book.setBookAuthor(request.getParameter("bookauthor"));
        book.setBookPrice(Float.valueOf(request.getParameter("bookprice")));
        dao.AddBook(book);
        request.setAttribute("blist",dao.getBooks());
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    public void init() throws ServletException {
        list=new ArrayList<>();
    }
}
