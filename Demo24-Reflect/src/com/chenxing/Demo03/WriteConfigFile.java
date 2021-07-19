package com.chenxing.Demo03;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName WriteConfigFile
 * @Description: TODO 通过 properties 写入配置文件
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/19 11:10 上午
 */
public class WriteConfigFile {
    public static void main(String[] args) throws IOException {
        myStore();// 将键值对 写入到文件中
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();
        FileWriter fw = new FileWriter("./ConfigureFile.ini");
//        prop.setProperty("Classname = Teacher","1" );
//        prop.setProperty("methodname = teach","2");
        prop.store(fw,"There is mysql configure info!");
        fw.close();
    }
}
