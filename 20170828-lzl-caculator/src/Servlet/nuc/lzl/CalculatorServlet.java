package Servlet.nuc.lzl;

import JavaBean.nuc.sw.vo.Calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by superzhaolu on 2017/8/28.
 */
@WebServlet(name = "CalculatorServlet",urlPatterns ="/CalculaterServlet")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float option = 0;
        String op;
        float num1;
        float num2;
        Calculator calculator=new Calculator();
        calculator.setNum1(Float.valueOf(request.getParameter("num1")));
        calculator.setOp(request.getParameter("op"));
        calculator.setNum2(Float.valueOf(request.getParameter("num2")));
        num1=calculator.getNum1();
        num2=calculator.getNum2();
        op=calculator.getOp();
        switch (op){
            case"+":
                option=num1+num2;
                break;
            case "-":
                option=num1-num2;
                break;
            case "*":
                option=num1*num2;
                break;
            case "/":
                option=num1/num2;
                break;
        }
        request.setAttribute("option",option);
        request.setAttribute("calculator",calculator);
        request.getRequestDispatcher("/cal.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
