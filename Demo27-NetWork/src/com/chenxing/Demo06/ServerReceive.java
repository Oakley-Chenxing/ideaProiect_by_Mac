package com.chenxing.Demo06;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName ServerReceive
 * @Description: TODO 服务器 接收数据
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/10 11:18 上午
 */
public class ServerReceive {
    public static void main(String[] args) throws IOException {
        // 实例化服务器端的 Socket 对象
        ServerSocket serverSocket = new ServerSocket(27149);

        // 通过服务器端的 Server socket 对于 获取通信用的 Socket 对象
        Socket socket = serverSocket.accept();

        // 获取输入流
        InputStream is = socket.getInputStream();

        // 读数据
        byte[] bytes = new byte[1024];
        int length = is.read(bytes);

        // 解析数据
        System.out.println(new String(bytes,0, length));
        // 释放资源
        serverSocket.close();
    }
}
