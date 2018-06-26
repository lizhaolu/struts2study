import java.util.Locale;

/**
 * Created by superzhaolu on 2017/11/11.
 */
public class LocalList {
    public static void main(String[] args){
        Locale[] localelist=Locale.getAvailableLocales();
        for (Locale i:localelist){
            System.out.println(i.getDisplayCountry()+"="+i.getCountry()+";"+i.getDisplayLanguage()
            +"="+i.getLanguage());
        }
    }
}
