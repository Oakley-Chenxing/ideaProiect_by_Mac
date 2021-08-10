package com.chenxing.Demo08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName ServerReceive
 * @Description: TODO 服务器端接收数据 并显示在控制台
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/10 11:47 上午
 */
public class ServerReceive {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(27149);
        Socket socket = serverSocket.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }

        serverSocket.close();


    }
}
