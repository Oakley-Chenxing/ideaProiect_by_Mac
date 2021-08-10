package com.chenxing.Demo09;

import java.io.*;
import java.net.Socket;

/**
 * @ClassName ClientSend
 * @Description: TODO 客户端键盘输入要发送的内容
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/10 11:53 上午
 */
public class ClientSend {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",27149);

        // 自己封装输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));



        String line;
        while ((line = br.readLine())!=null){
            if("over".equals(line))
                break;
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        socket.close();


    }
}
