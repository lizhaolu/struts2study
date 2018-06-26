package nuc.sw.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Date;

/**
 * Created by superzhaolu on 2017/11/9.
 */
public class LogInterceptor extends AbstractInterceptor {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("进入了日志拦截器");
        //获得被拦截的action名字
        String actionName=actionInvocation.getAction().getClass().getName();
        //获得代理的方法
        String methodName=actionInvocation.getProxy().getMethod();
        //记录放行之前的时间
        System.out.println(name+"准备开始访问"+actionName+"的方法"+methodName+"时间"+new Date());
        //放行
        long start=System.currentTimeMillis();
        String result=actionInvocation.invoke();
        long end=System.currentTimeMillis();
        System.out.println(name+"结束访问"+actionName+"的方法"+methodName+"时间"+new Date());
        return result;
    }
}
