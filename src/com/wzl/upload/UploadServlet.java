package com.wzl.upload;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@WebServlet(name = "UploadServlet" , urlPatterns = "/UploadServlet")
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决中文乱码1
        request.setCharacterEncoding("UTF-8");
        //得到解析工厂
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        //根据解析工厂得到解析器
        ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
        //解决中文乱码2
        servletFileUpload.setHeaderEncoding("UTF-8");
        //判断上传表单的类型
        if(!servletFileUpload.isMultipartContent(request)){
            return ;
        }
        //如果是表单数据,需要解析request请求的数据
        List<FileItem> list = new ArrayList<>();
        try {
            list = servletFileUpload.parseRequest(request);
            //迭代 判断所有数据
            for (FileItem fi: list) {

                if(fi.isFormField()){//得到普通字段
                    String name = fi.getFieldName();
                    String value = fi.getString();
                }else{//代表上传字段 需要把指定文件上传
                    String path = fi.getName();//是文件名wt_jobs定时任务配置说明.txt
                    InputStream is = fi.getInputStream();
                    int hasRead = 0;
                    byte[] buff = new byte[1024];
                    //存到web_inf里面 保护用户隐私
                    String savePath = this.getServletContext().getRealPath("/upload");
                    FileOutputStream fos = new FileOutputStream(makePath(path,savePath)+"\\"+makeFileName(path));
                    while ((hasRead = is.read(buff)) != -1){
                        fos.write(buff,0,hasRead);
                    }
                    is.close();
                    fos.close();
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }

    }

    /**
     * 解决文件同名覆盖
     * @param fileName
     * @return
     */
    public String makeFileName(String fileName){
        return UUID.randomUUID().toString()+"-"+fileName;
    }

    /**
     * 根据日期和文件的hashcode码确定唯一的目录,
     * 解决效率问题(上传到同一个文件夹内，随着内容的增加，效率会越来越慢)
     * @param fileName
     * @param savePath
     * @return
     */
    public String makePath(String fileName, String savePath){
        SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd");
        String subPath = sdf.format(new Date());
        String dir = savePath + subPath;//upload/2017/11/15

        //根据文件的名字 随机生成两层目录结构
        int hasCode = fileName.hashCode();
        int dir1 = hasCode & 0xf;//0-15位随机数
        int dir2 = (hasCode & 0xf0) >> 4;//0-15位随机数
        dir = dir + "\\" +dir1 + "\\" + dir2;//upload/2017/11/15/11/2
        System.out.println(dir);

        File file = new File(dir);
        if(!file.exists()){
            file.mkdirs();
        }
        return dir;
    }

}
