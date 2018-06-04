package nuc.sw.vo;

/**
 * Created by superzhaolu on 2017/10/16.
 */
public class Tel {
    private String sectionNo;
    private String telNo;

    public String getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(String sectionNo) {
        this.sectionNo = sectionNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    @Override
    public String toString() {
        return "Tel{" +
                "sectionNo='" + sectionNo + '\'' +
                ", telNo='" + telNo + '\'' +
                '}';
    }
}
