package nuc.sw.factory;

import nuc.sw.handler.ProxyHandler;

import java.lang.reflect.Proxy;

/**
 * Created by superzhaolu on 2017/11/5.
 */
public class MyProxyFactory {
    public static Object getProxy(Object object,String methodName){
        ProxyHandler handler=new ProxyHandler(object,methodName);
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),handler);
    };
}
