package nuc.sw.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc.sw.vo.Calculator;

/**
 * Created by superzhaolu on 2017/9/25.
 */
public class CalAction extends ActionSupport implements ModelDriven<Calculator> {
    private Calculator cal=new Calculator();
    @Override
    public Calculator getModel(){
        return cal;
    }
    @Override
    public String execute(){
        float result=0;
        System.out.println("cal.getNum1() = " + cal.getNum1());
        switch (cal.getOp().charAt(0)){
            case '+':result=cal.getNum1()+cal.getNum2();break;
            case '-':result=cal.getNum1()-cal.getNum2();break;
            case '*':result=cal.getNum1()*cal.getNum2();break;
            case '/':result=cal.getNum1()/cal.getNum2();break;
        }
        ActionContext.getContext().put("result",result);
        return SUCCESS;
    }
}
