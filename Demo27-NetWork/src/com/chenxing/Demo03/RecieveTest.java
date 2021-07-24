package com.chenxing.Demo03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @ClassName RecieveTest
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/23 5:05 下午
 */
public class RecieveTest {
    public static void main(String[] args) throws IOException {
//        1. 创建接收端的 Socket 对象 （DatagramSocket）
        DatagramSocket ds = new DatagramSocket(27150);

//        2. 创建一个数据包，用于接受数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

//        3. 调用 DatagramSocket 对象的方法接收数据
        ds.receive(dp);
//        4. 解析数据包
        byte[] data = dp.getData();
        int length = dp.getLength();
        System.out.println(new String(data,0,length));
//        5. 关闭接收端
        ds.close();
    }
}
