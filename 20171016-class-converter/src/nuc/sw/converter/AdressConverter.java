package nuc.sw.converter;


import nuc.sw.vo.Address;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by superzhaolu on 2017/10/24.
 */
public class AdressConverter extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        Address address=new Address(strings[0],strings[1],strings[2],strings[3]);
        return address;
    }

    @Override
    public String convertToString(Map map, Object o) {
        Address address = (Address)o;
        return address.getProvince()+address.getCity()+address.getArea()+address.getStreet();

    }
}
