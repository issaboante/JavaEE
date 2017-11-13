package com.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 和首页相关的servlet
 */
public class IndexServlet extends HttpServlet {
	
	public String index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//去数据库中查询最新商品和热门商品
		return null;
	}

}
