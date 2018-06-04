package action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by superzhaolu on 2017/10/24.
 */
public class UploadAction extends ActionSupport {
    private String title;
    private File[] upload;
    private String[] uploadContentType;
    private String[] uploadFileName;
    private String savePath;
    /**
     * 处理上传的方法
     * @return
     */
    public String upload() {
        System.out.println(upload);
        System.out.println(uploadFileName);
        System.out.println(uploadContentType);
        for (int i = 0; i < upload.length; i++) {
            try {
                FileInputStream fis = new FileInputStream(upload[i]);
                FileOutputStream fos = new FileOutputStream(savePath + "/" + uploadFileName[i]);
                byte[] buffer = new byte[1024];
                int len = 0;
                while ((len = fis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        return "uploadOK";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUpload(File[] upload) {
        this.upload = upload;
    }

    public String[] getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String[] uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String[] getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String[] uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }
}
