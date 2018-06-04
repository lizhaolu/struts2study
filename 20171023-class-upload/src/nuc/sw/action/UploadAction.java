package nuc.sw.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.*;

/**
 * Created by superzhaolu on 2017/10/29.
 */
public class UploadAction extends ActionSupport {
    private String title;
    private File upload;
    private String uploadContentType;
    private String uploadFileName;
    private String savePath;

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }
    /*  get set方法  */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String upload() {
        System.out.println(upload);
        System.out.println(uploadContentType);
        System.out.println(uploadFileName);
        //for (int i = 0; i <upload.length; i++) {
            try {
                FileInputStream fis = new FileInputStream(upload);
                FileOutputStream fos = new FileOutputStream(savePath + "\\" + uploadFileName);
                byte[] buffer=new byte[1024];
                int len=0;
                while ((len=fis.read(buffer))>0){
                    fos.write(buffer,0,len);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
 //      }
        return "uploadOK";
    }
}