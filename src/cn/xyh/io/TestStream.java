package cn.xyh.io;

import java.io.*;

/**
 * 不用介质之间有数据交互的时候，用流来实现
 */
public class TestStream {

    public static void main(String[] args) throws IOException {
        File file = new File("C:/test/test.txt");

        //创建基于文件的输入流
        FileInputStream fileInputStream = new FileInputStream(file);

        FileOutputStream fileOutputStream = new FileOutputStream(file);
    }
}
