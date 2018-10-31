package cn.xyh.io;

import java.io.File;
import java.io.IOException;

public class File类学习 {

    public static void main(String[] args) throws IOException {

        //构造器学习

        File file = new File("c:/test/b.txt");

        ////////静态方法学习////////

        /* 1.列出系统根 */
        File[] files = File.listRoots();

        for (File f : files) {
            System.out.println(f.getPath());
        }

        /* 2.创建文件，并指定前缀和后缀和目录 */
        File f1 = new File("c:/test");
        File.createTempFile("haha", ".txt", f1);

        /* 3.创建文件，不指定目录 */
        File.createTempFile("xixi", ".txt");


        ////////成员方法学习////////

        File f2 = new File("c:/test/a.txt");

//        删除路径下的文件或文件夹
//        boolean delete = f2.delete();

//        测试是否存在
//        System.out.println(f2.exists());

        //返回抽象路径的绝对形式
//        System.out.println(f2.getAbsoluteFile());

        //返回绝对路径
//        System.out.println(f2.getAbsolutePath());

        //返回这个File表示的文件夹名或者文件名
//        System.out.println(f2.getName());

        //返回父文件夹的路径
//        String parent = f2.getParent();
//        System.out.println(f2.getParent());

        //获取字符串路径
//        String path = f2.getPath();
//        System.out.println(path);

        //测试这个抽象路径名是否是绝对路径
//        System.out.println(f2.isAbsolute());


        //返回父文件夹的File
//        File parentFile = f2.getParentFile();
//        System.out.println(parentFile.getPath());







//
//        System.out.println(file.isAbsolute());
//
//        System.out.println(file.isFile());
//
//        System.out.println(file.isDirectory());
//
//        System.out.println(file.exists());
//
////        file.createNewFile();

    }
}
