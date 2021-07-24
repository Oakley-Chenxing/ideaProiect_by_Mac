package com.chenxing.Demo01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName Demo01
 * @Description: TODO InetAddress 常用方法
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 2021/7/23 2:25 下午
 */
public class Demo01 {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("127.0.0.1");
//        System.out.println("主机名： "+ address.getHostName() );
//        System.out.println("IP地址： "+ address.getHostAddress());
//
//        System.out.println("================================");

        //InetAddress address01 = InetAddress.getByName("192.168.1.109");
        InetAddress address01 = InetAddress.getByName("oakleydeMacBook-Pro.local");
        System.out.println("主机名："+ address01.getHostName());
        System.out.println("IP地址："+ address01.getHostAddress());

    }
}