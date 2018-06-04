package nuc.sw.converter;

import nuc.sw.vo.Tel;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by superzhaolu on 2017/10/16.
 */
public class TelConverter extends StrutsTypeConverter {

    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        System.out.println("String------->Tel");
        String str=strings[0];
        String[] telNos=str.split("-");
        Tel tel=new Tel();
        tel.setSectionNo(telNos[0]);
        tel.setTelNo(telNos[1]);
        return tel;
    }

    @Override
    public String convertToString(Map map, Object o) {
        System.out.println("Tel---------->String");
        Tel tel=(Tel) o;
        return tel.getSectionNo()+"-"+tel.getTelNo();
    }
}
