package com.chenxing.Demo11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @ClassName ServerDownload
 * @Description: TODO 服务器 接收 下载文件
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/10 3:38 下午
 */
public class ServerDownload {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(27149);
        Socket socket = serverSocket.accept();
    // 通过socket封装输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    // 读取文件 并 处理文件名
        String fileName = br.readLine();
        final String path = "./";
        // 获取文件的扩展名
        String postfix = fileName.substring(fileName.lastIndexOf("."));
        // 生成一个新的文件名，保证在目录中不存在，如果存在重新生成
        do{
            fileName = getFileName()+ postfix;
        }while (new File(path+fileName).exists());
        // 通过新的文件名封装输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

        String line;
        while((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }// 客户端不会把空写过来 所以不会退出

        // 给出反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bwServer.write("文件上传成功！");
        bwServer.newLine();
        bwServer.flush();
        // 释放资源
        bw.close();
        bwServer.close();



        serverSocket.close();

    }

    /**
     * 获取新的文件名 （随机生成）
     * @return 新的文件名
     */
    private static String getFileName() {
        String charSet="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String fileName="";
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            fileName += charSet.charAt(ran.nextInt(charSet.length()));
        }
        return fileName;
    }
}
