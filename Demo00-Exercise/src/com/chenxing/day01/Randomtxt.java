package com.chenxing.day01;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
/**
 * @ClassName Randomtxt
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 23/02/2022 16:21
 */
public class Randomtxt {
    public static void main(String[] args) {
        String filepath = System.getProperty("user.dir");
        filepath += "\\data20000000.txt";
        System.out.println(filepath);

        try
        {
            File file = new File(filepath);
            if(!file.exists())
            {
                file.createNewFile();
                System.out.println("Complete txt");
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);


            Random random = new Random();
            for (int i = 0; i < 20000000; i++) {
                int randint = (int)Math.floor((random.nextDouble())*100000.0);
                bw.write(String.valueOf(randint));
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


