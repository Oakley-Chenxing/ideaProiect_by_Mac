package com.chenxing.Demo04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @ClassName SendTest01
 * @Description: TODO UDP 发送键盘输入的内容 直到over 结束操作
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/23 5:11 下午
 */
public class SendTest01 {
    public static void main(String[] args) throws IOException {
        // 实例化 发送对象
        DatagramSocket ds = new DatagramSocket();

        // 创建数据内容
        String line;
        while(true){
            System.out.print("Please input: ");
            line = new Scanner(System.in).nextLine();

            if ("over".equals(line))// 遇到over 结束
                break;

            // 打包 必要信息
            byte[] bytes = line.getBytes();
            int length = bytes.length;
            InetAddress address02 = InetAddress.getByName("127.0.0.1");
            int port = 27149;
            DatagramPacket dp = new DatagramPacket(bytes, length, address02, port);

            // 发送
            ds.send(dp);
        }

            // 关闭发送
            ds.close();


    }
}
