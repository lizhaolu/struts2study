package nuc.sw.main;

import nuc.sw.dog.Dog;
import nuc.sw.factory.MyProxyFactory;
import nuc.sw.impl.DogImpl;

/**
 * Created by superzhaolu on 2017/11/5.
 */
public class TestDynamicProxy {
    public static void main(String[] args){
        Dog dog=new DogImpl();
        Dog dogProxy=(Dog) MyProxyFactory.getProxy(dog,"info");
        dogProxy.info();
    }
}
