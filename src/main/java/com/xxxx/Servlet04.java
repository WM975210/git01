package com.xxxx;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/*
*   response  响应
*       getWriter  获取字符流
*       getOutPutStream  获取字节流
*/
@WebServlet("/ser04")
public class Servlet04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 获取字符流
        PrintWriter writer = response.getWriter();
        writer.write("zhangsan");
        writer.write("<h2>张三<h2>");
        writer.flush();
        writer.close();
    }
}
