package com.web.servlet;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通用的servlet
 */
public class BaseServlet extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// 获取子类
			Class<? extends BaseServlet> class1 = this.getClass();
			// 获取请求方法
			String m = request.getParameter("method");
			if (m==null) {
				m="index";
			}
			// 获取方法对象
			Method method = class1.getMethod(m, HttpServletRequest.class, HttpServletResponse.class);
			//让方法执行
			String s = (String) method.invoke(this, request, response);
			//判断s是否为空
			if (s!=null) {
				request.getRequestDispatcher(s).forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		} 
	}
}
