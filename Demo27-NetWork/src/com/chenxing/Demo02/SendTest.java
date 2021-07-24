package com.chenxing.Demo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @ClassName SendTest
 * @Description: TODO UDP 发送案例
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/23 3:00 下午
 */
public class SendTest {
    public static void main(String[] args) throws IOException {
//        1. 创建发送端的 Socket 对象 （DatagramSocket）
        DatagramSocket ds = new DatagramSocket();
//        2. 创建数据，并把数据打包
        byte[] bytes = "Hello Java".getBytes();
        int length = bytes.length;
        InetAddress address00 = InetAddress.getByName("127.0.0.1");
        int port = 27149;

        DatagramPacket dp = new DatagramPacket(bytes,length,address00,port);
//        3. 调用 DatagramSocket 对象的方法发送数据
        ds.send(dp);
//        4. 关闭发送
        ds.close();
    }
}
