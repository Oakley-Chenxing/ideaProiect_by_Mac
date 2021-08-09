package com.chenxing.Demo05;

import javax.imageio.IIOException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @ClassName SendThread
 * @Description: TODO 发送线程
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/9 4:31 下午
 */
public class SendThread implements Runnable{
    @Override
    public void run() {
        // 定义发送端的 Socket 对象
        DatagramSocket ds = null;
        try {
            // 实例化 对象
             ds = new DatagramSocket();
             // 要发送的字符串定义
            String line;
            while (true){
                // 获取要发生的信息内容
                line = new Scanner(System.in).nextLine();
                // 判断退出条件
                if ("exit".equals(line))
                    System.exit(0); // 退出系统

                byte[] bytes = (Thread.currentThread().getName()+"#@@#"+line).getBytes();
                int length = bytes.length;
                InetAddress address = InetAddress.getByName("127.0.0.1");
                int port = 27149;

                // 创建 要发送 的数据包
                DatagramPacket dp = new DatagramPacket(bytes, length, address, port);

                // 发送
                ds.send(dp);
        }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            ds.close();
        }
    }
}
