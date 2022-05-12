package com.xxxx;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * 创建Servlet
 *      1.创建普通 java类
 *      2.遵循servlet标准(继承 HttpServlet)
 *      3.重写service方法（当前Servlet 类被访问时自动调用service方法）
 *      4.设置对外访问的路径 (设置@WebServlet("/路径"))
 *
 */

@WebServlet("/ser01")
public class Servlet01 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet");
    }
    /*
     *初始化方法 当类第一次调用时会创建
     */

    @Override
    public void init() throws ServletException {
        System.out.println("int...初始化");
    }
    /*
     *销毁方法  当服务器/容器关闭时  servlet销毁
     */

    @Override
    public void destroy() {
        System.out.println("destroy...销毁");
    }
}
