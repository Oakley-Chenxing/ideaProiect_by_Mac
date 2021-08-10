package com.chenxing.Demo07;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * @ClassName ServerTest
 * @Description: TODO 服务器端 接收数据并实现反馈
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/10 11:32 上午
 */
public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(27149);
        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int length = is.read(bytes);
        System.out.println("客户端发来数据: "+new String(bytes,0,length));

        OutputStream os = socket.getOutputStream();
        os.write("已经收到客户端发来的数据".getBytes());

        serverSocket.close();



    }
}
