package com.chenxing.Demo05;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Set;

/**
 * @ClassName Server
 * @Description: TODO 服务器类 转发服务器 先接收 后发送
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/9 4:31 下午
 */
public class Server {
    public static void main(String[] args) throws IOException {
        // 初始化测试用户
        Global.initUserPortMap();
        // 创建接收对象
        DatagramSocket dsReceive = new DatagramSocket(27149);
        // 创建发送对象
        DatagramSocket dsSend = new DatagramSocket();

        // 用于接收数据的缓冲区
        byte[] bytes = new byte[1024];
        while(true){
            // 创建用于接收的数据包
            DatagramPacket dpRec = new DatagramPacket(bytes, bytes.length);
            // 接收数据
            dsReceive.receive(dpRec);
            // 获取转发数据必要参数
            int length = dpRec.getLength();
            InetAddress address =InetAddress.getByName("127.0.0.1");
            // 将数据打包 并发送
            Set<Integer> portSet = Global.portMap.keySet();
            for (Integer port : portSet) {
                dsSend.send(new DatagramPacket(bytes,length,address,port));
            }
            // 输出转发成功
            System.out.println("已经转发了一条数据！");

        }


        // 关闭 socket 因为服务器死循环做转发 用不到
//        dsReceive.close();
//        dsSend.close();


    }

}
