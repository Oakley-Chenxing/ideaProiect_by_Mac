package com.chenxing.Demo11;

import java.io.*;
import java.net.Socket;

/**
 * @ClassName ClientUploadFile
 * @Description: TODO 客户端上传文件 到服务器
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/10 3:38 下午
 */
public class ClientUploadFile {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 27149);
        File file = new File("./main.c");

        // 封装输入 输出流
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));

        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        // 发送一个文件名 过去（防止重名）
        bw.write(file.getName());
        bw.newLine();
        bw.flush();

        // 发文件中的内容
        String line;
        while((line = br.readLine())!= null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }// 在当前这个循环里 不可能把null 写过去

        // 结束标识 有弊端
//        bw.write("over");
//        bw.newLine();
//        bw.flush();
        // 通过 socket 提供的结束标识
        socket.shutdownOutput();

        // 接收服务器的反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(" 服务器的反馈为：  "+brClient.readLine());

        // 手动释放 bw 可以通过socket释放
        br.close();


        socket.close();


    }

}
