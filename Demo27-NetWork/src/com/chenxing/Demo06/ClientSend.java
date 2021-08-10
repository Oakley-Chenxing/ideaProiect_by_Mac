package com.chenxing.Demo06;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName TcpSend
 * @Description: TODO 客户端 发送数据
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/10 11:13 上午
 */
public class ClientSend {
    public static void main(String[] args) throws IOException {
        // 创建客户端的 Socket 对象
        Socket socket = new Socket("127.0.0.1", 27149);
        // 通过 socket 对象来获取输出流
        OutputStream os = socket.getOutputStream();
        // 通过输出流写 输入 发送数据
        os.write("Hello，Oakley!".getBytes());
        // 关闭资源
        socket.close();
    }
}
