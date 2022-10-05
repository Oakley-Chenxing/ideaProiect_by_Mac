package com.chenxing.demo02;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ClassName Demo02Test
 * @Description: TODO 测试静态封装的 JDBC 工具类
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 05/10/2022 16:36
 */
public class Demo02Test {
    public static void main(String[] args) throws SQLException {
        // 获取连接
        Connection conn = JdbcUtils.getconnection();
        // 获取执行的

    }
}
