package nuc.sw.intercepter;

/**
 * Created by superzhaolu on 2017/11/5.
 */
public class MyInterceptor {
    public void method1(){
        System.out.println("模拟struts2框架中访问action之前拦截器执行的方法");
    }
    public void method2(){
        System.out.println("模拟struts2框架中访问action之后拦截器执行的方法");
    }
}
