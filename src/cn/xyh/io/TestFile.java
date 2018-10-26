package cn.xyh.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile {

    public static void main(String[] args) {

//        testFileConstructor();

        testFileMethods();

    }

    /**
     * 测试文件的方法
     */
    public static void testFileMethods(){
        //C:/test/test.txt这个文件里路径是真实存在的
        File f = new File("C:/test");

        System.out.println("当前文件是：" + f);

        System.out.println("是否是文件夹：" + f.isDirectory());

        System.out.println("是否是文件：" + f.isFile());

        System.out.println("获取文件的长度：" + f.length());

        //设置文件最后的修改时间
        f.setLastModified(0);

        //文件最后的修改时间
        long time = f.lastModified();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(new Date(time)));

        //修改文件名字
//        File f2 = new File("C:/test/a.txt");
//        f.renameTo(f2);

        //已字符串的形式返回当亲文件下的所有文件（不包含子文件和子文件夹）
        String[] list = f.list();
        for (String s : list) {
            System.out.println(s);
        }

        //已字符串形式获取当前文件的父文件夹
        String parent = f.getParent();
        System.out.println(parent);

    }


    /**
     * 测试File的构造器
     */
    public static void testFileConstructor() {
        //绝对路径
        File f1 = new File("C:/test");
        System.out.println("f1的绝对路径：" + f1.getAbsolutePath());

        //相对路径，相对于工作目录
        File f2 = new File("test.txt");
        System.out.println("test.txt的相对路径：" + f2.getAbsolutePath());

        //把f1座位父目录创建文件
        File f3 = new File(f1, "test.txt");
        System.out.println("f3的绝对路径：" + f3.getAbsolutePath());
        System.out.println(f3.exists());
    }
}
