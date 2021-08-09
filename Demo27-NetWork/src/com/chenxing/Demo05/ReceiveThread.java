package com.chenxing.Demo05;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @ClassName ReceiveThread
 * @Description: TODO 接收线程
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/9 4:32 下午
 */
public class ReceiveThread implements Runnable {
 private  Integer port;
 public ReceiveThread(Integer port){
     this.port = port;
 }
    @Override
    public void run() {
     try {
         // 此处可能会有 bug 已解决
         DatagramSocket ds =null;
          try{
              ds = new DatagramSocket(port);
          }catch (IOException ee){
              System.err.println("用户重复登录，请重启程序！");
              System.exit(-1);
          }

         // 输出登录用户
         System.out.println(Thread.currentThread().getName() + " 登录成功!");
         // 循环接收
         while (true){
             // 定义数据接收缓冲区
             byte[] bytes = new byte[1024];
             // 定义接收数据包
             DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
             // 接收数据
             ds.receive(dp);
             // 将接收到的数据解析成字符串
             String recStr = new String(dp.getData(), 0, dp.getLength());
             // 接收到的字符串 格式 用户名 #@@#
             // 拆分字符串 info[0]为用户名 info[1]为用户信息
             String[] info = recStr.split("#@@#");
             // 此处可能有bug
             String message = info.length > 1 ? info[1] : "";
             if (!info[0].equals(Thread.currentThread().getName()) && !message.equals("")){
                 System.out.printf("接收到 - %s - 说 > %s\n",info[0],message);
             }

         }
     }catch (IOException e){
         e.printStackTrace();
     }finally {
        // ds.close();

     }

    }
}
