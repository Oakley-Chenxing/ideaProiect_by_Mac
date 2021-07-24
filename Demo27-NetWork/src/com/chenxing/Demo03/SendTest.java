package com.chenxing.Demo03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @ClassName SendTest
 * @Description: TODO UDP 发送案例
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/23 4:59 下午
 */
public class SendTest {
    public static void main(String[] args) throws IOException {
//        1. 创建发送端的 Socket 对象 （DatagramSocket）
        DatagramSocket ds = new DatagramSocket();
//        2. 创建数据，并把数据打包
        byte[] bytes = "Hello Oakley".getBytes();
        int length = bytes.length;
        InetAddress address01 = InetAddress.getByName("127.0.0.1");
        int port = 27150;

        DatagramPacket dp = new DatagramPacket(bytes,length,address01,port);
//        3. 调用 DatagramSocket 对象的方法发送数据
        ds.send(dp);
//        4. 关闭发送
        ds.close();
    }
}
