package com.rcnjtech.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import sun.reflect.misc.FieldUtil;

import java.io.File;
import java.io.IOException;

public class UploadFile extends ActionSupport {
    private File myFile;
    private String myFileContentType;
    private String myFileName;
    private String destPath;

    @Override
    public String execute() throws Exception {
        destPath = "E://";
        try{
            File destFile = new File(destPath,"aa.txt");
            FileUtils.copyFile(myFile,destFile);
        }catch (IOException e){
            e.printStackTrace();
            return ERROR;
        }
        return SUCCESS;
    }

    public File getMyFile() {
        return myFile;
    }

    public void setMyFile(File myFile) {
        this.myFile = myFile;
    }

    public String getMyFileContentType() {
        return myFileContentType;
    }

    public void setMyFileContentType(String myFileContentType) {
        this.myFileContentType = myFileContentType;
    }

    public String getMyFileName() {
        return myFileName;
    }

    public void setMyFileName(String myFileName) {
        this.myFileName = myFileName;
    }

    public String getDestPath() {
        return destPath;
    }

    public void setDestPath(String destPath) {
        this.destPath = destPath;
    }
}
