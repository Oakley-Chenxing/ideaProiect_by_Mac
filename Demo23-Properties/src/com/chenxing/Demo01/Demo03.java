package com.chenxing.Demo01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName Demo03
 * @Description: TODO 写入配置文件中的键值对
 * @Author: lichenxingbeijing@163.com
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        myStore();// 将键值对 写入到文件中
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();
        FileWriter fw = new FileWriter("./myConfigureFile.txt");
        prop.setProperty("LOCALHOST","127.0.0.1");
        prop.setProperty("USERNAME","ROOT");
        prop.setProperty("PASSWORD","123456");
        prop.setProperty("PORT","3305");
        prop.store(fw,"There is mysql configure info!");
        fw.close();
    }

}
