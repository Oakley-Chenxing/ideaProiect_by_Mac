package com.chenxing.Demo05;

import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName ChatRoomMain
 * @Description: TODO 主方法  客户端调用收发 线程实现类聊天功能
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/8/9 4:32 下午
 */
public class ChatRoomMain {
    public static void main(String[] args) {
        Global.initUserPortMap();
        System.out.println("* ******************** *");
        System.out.println(" 用户列表如下 ");
        System.out.println("* ******************** *");
        Set<Integer> portMap = Global.portMap.keySet();
        int index = 1;
        for (Integer port : portMap) {
            System.out.println(index++ + " : " + Global.portMap.get(port));
        }
        do{
            System.out.println("请输入正确的用户编号：");
            index = new Scanner(System.in).nextInt();
        }while (index < 1 || index > 4);

        // 循环结束之后一定会得到一个合法的用户序号

        // 获取用户对应的端口号
        Integer port = 20000 + index;

        // 获取用户名
        String userName = Global.portMap.get(port);

        // 创建收发线程
        Thread sendThread = new Thread(new SendThread(), userName);
        Thread receiveThread = new Thread(new ReceiveThread(port), userName);
        // 启动线程
        sendThread.start();
        receiveThread.start();
    }
}
