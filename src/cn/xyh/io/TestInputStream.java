package cn.xyh.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestInputStream {

    public static void main(String[] args) throws IOException {

        //测试输入流读取文件
//       testInputStreamReadFile();

        testOuputStreamWriterFile();

    }

    /**
     * 测试OutputStreamFile 写入
     */
    public static void testOuputStreamWriterFile(){

    }

    /**
     * 测试InputStreamFile 读取
     * @throws IOException
     */
    public static void testInputStreamReadFile() throws IOException {
        //准备文件
        File file = new File("C:/test/a.txt");

        //获取输入流
        FileInputStream fileInputStream = new FileInputStream(file);

        //创建字节数组，长度为文件长度
        byte[] all = new byte[(int)file.length()];

        //以字节流的形式读取文件内容
        fileInputStream.read(all);

        for (byte b : all) {
            //打印出来的ASCII码
            System.out.println(b);
        }

        fileInputStream.close();
    }

}
