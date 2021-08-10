package com.chenxing.Demo07;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @ClassName ClientTest
 * @Description: TODO 客户端 发送数据 并接受服务器端给出的反馈
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/10 11:25 上午
 */
public class ClientTest {
    public static void main(String[] args) throws IOException {
        // 实例化对象
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),27149);

        // 发送数据
        OutputStream os = socket.getOutputStream();
        os.write("Hello,Jimmy".getBytes());

        // 接收反馈
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int length = is.read(bytes);
        System.out.println("接收到服务器的反应： "+new String(bytes,0,length));

        // 关闭资源
        socket.close();
    }
}
