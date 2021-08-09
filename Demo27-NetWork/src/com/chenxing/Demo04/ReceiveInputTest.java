package com.chenxing.Demo04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @ClassName ReceiveInputTest
 * @Description: TODO UDP 接收端 接受键盘输入的东西
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/9 3:55 下午
 */
public class ReceiveInputTest {
    public static void main(String[] args) throws IOException {
        // 实例化接收对象
        DatagramSocket ds = new DatagramSocket(27149);
        // 通过死循环接收数据
        while (true){
            //定义数据缓冲区
            byte[] bytes = new byte[1024];
            // 创建接收数据包
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            // 接收数据
            ds.receive(dp);
            // 获取数据包中的数据 以及 数据长度
            byte[] data = dp.getData();
            int length = dp.getLength();
            // 将接收到的数据解析为字符串
            String info = new String(data, 0, length);
            // 输出接收到的数据
            System.out.println("接收到: "+info);



        }
// 关闭接收-因为死循环 所以运行不到
        //ds.close();

    }
}
