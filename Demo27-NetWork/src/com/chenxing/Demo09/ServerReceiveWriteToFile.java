package com.chenxing.Demo09;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName ServerReceiveWriteToFile
 * @Description: TODO 服务端将收到的内容存在文件当中
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/10 11:53 上午
 */
public class ServerReceiveWriteToFile {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(27149);
        Socket socket = serverSocket.accept();
        // 通过 socket 获取字节输入流 封装成字符流 在封装成缓冲区字符流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        BufferedWriter bw = new BufferedWriter(new FileWriter("./myFile10-08.txt"));

        String line;
        while ((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }



        serverSocket.close();

    }
}
