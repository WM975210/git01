package com.xxxx;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/ser03")
public class Servlet03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");

        // 获取指定名称的参数，返回字符串
        String uname = request.getParameter("uname");
        System.out.println("uname的参数值：" + uname);


        // String uname = new String(request.getParameter("uname").getBytes("ISO-8859-1"),"UTF-8");
        // System.out.println("uname的参数值：" + uname);
    }
}
