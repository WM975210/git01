package com.xxxx;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/ser02  ")
public class Servlet02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        // 获取客户端请求的完整URL （从http开始，到?前面结束）
        String url = request.getRequestURL().toString();
        System.out.println("获取客户端请求的完整URL：" + url);
        // 获取客户端请求的部分URL （从站点名开始，到?前面结束）
        String uri = request.getRequestURI();
        System.out.println("获取客户端请求的部分URL：" + uri);
        // 获取请求行中的参数部分
        String queryString = request.getQueryString();
        System.out.println("获取请求行中的参数部分：" + queryString);
        // 获取客户端的请求方式
        String method = request.getMethod();
        System.out.println("获取客户端的请求方式：" + method);
        // 获取HTTP版本号
        String protocol = request.getProtocol();
        System.out.println("获取HTTP版本号：" + protocol);
        // 获取webapp名字 （站点名）
        String webapp = request.getContextPath();
        System.out.println("获取webapp名字：" + webapp);

        System.out.println("====================================");

        // 获取指定名称的参数，返回字符串
        String uname = request.getParameter("uname");
        System.out.println("uname的参数值：" + uname);
// 获取指定名称参数的所有参数值，返回数组
        String[] hobbys = request.getParameterValues("hobby");
        System.out.println("获取指定名称参数的所有参数值：" + Arrays.toString(hobbys));

    }
}
