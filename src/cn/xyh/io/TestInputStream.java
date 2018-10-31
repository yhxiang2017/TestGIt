package cn.xyh.io;

import java.io.*;

public class TestInputStream {

    public static void main(String[] args) throws IOException {

        //测试输入流读取文件
//       testInputStreamReadFile();

        testOuputStreamWriterFile();

    }

    /**
     * 测试OutputStreamFile 写入
     */
    public static void testOuputStreamWriterFile() throws IOException {

        File file = new File("c:/test/d.txt");

        //读取文件
        FileInputStream fileInputStream = new FileInputStream(file);

        byte[] bytes = new byte[(int) file.length()];

        fileInputStream.read(bytes);

        File newFile = new File("c:/test/e.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(newFile);

        fileOutputStream.write(bytes);

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
