package com.chenxing.Demo10;

import java.io.*;
import java.net.Socket;

/**
 * @ClassName ClientSendFromeFile
 * @Description: TODO 客户端发送来自文件中的内容
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/10 12:13 下午
 */
public class ClientSendFromeFile {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",27149);

        // 先读 后写
        BufferedReader br = new BufferedReader(new FileReader("./myFile10-08.txt"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line;
        while ((line = br.readLine())!= null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }



        socket.close();

    }
}
