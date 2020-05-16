package com.whw.action;

import java.io.*;

public class TestFile {
    private String name;
    private String[] filesFileName;
    private String[] filesContentType;
    private File[] files;

    public void setName(String name) {
        this.name = name;
    }

    public void setFilesFileName(String[] filesFileName) {
        this.filesFileName = filesFileName;
    }

    public void setFilesContentType(String[] filesContentType) {
        this.filesContentType = filesContentType;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }
    public void upload() throws IOException {
        System.out.println(name);
        FileInputStream is = null;
        FileOutputStream out =null;
        for (int i = 0; i <files.length ; i++) {
            try {
                is =new FileInputStream(files[i]);
                out = new FileOutputStream("E:\\vm1\\"+filesFileName[i]);
                System.out.println(filesContentType[i]);
                System.out.println(filesFileName[i]);
                while (true){
                    int read = is.read();
                    out.write(read);
                    if (read ==-1) break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                is.close();
                out.close();
            }
        }
    }

    public String down(){
        System.out.println(name);
        System.out.println("wancheng");
        return "success";
    }
    public InputStream getInputStream() throws FileNotFoundException {
        return new FileInputStream("E:\\copy\\struts\\struts\\struts01\\struts01.txt");
    }
}
