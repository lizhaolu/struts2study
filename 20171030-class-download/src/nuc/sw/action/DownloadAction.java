package nuc.sw.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by superzhaolu on 2017/11/1.
 */
public class DownloadAction extends ActionSupport {
    private String inputPath;
    private String contentType;
    private String downFileName;

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        try {
            this.inputPath=new String(inputPath.getBytes("iso-8859-1"),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.inputPath = inputPath;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getDownFileName() {
        try {
            URLEncoder.encode(downFileName,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return downFileName;
    }

    public void setDownFileName(String downFileName) {
        try {
            this.inputPath=new String(downFileName.getBytes("utf-8"),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.downFileName = downFileName;
    }

    public InputStream getTargetFile(){
        InputStream is= null;
        try {
            is = new FileInputStream(inputPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return is;
    }
}
