package com.chenxing.Demo01;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName Demo04
 * @Description: TODO Properties 读的操作
 * @Author: lichenxingbeijing@163.com
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        myLoad();
    }

    private static void myLoad() throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("./myConfigureFile.txt");
        prop.load(fr);
        fr.close();

//        System.out.println(prop);
        Set<String> keySet = prop.stringPropertyNames();
        for(String key:keySet){
            System.out.println(key+" "+prop.getProperty(key));
        }
    }
}
