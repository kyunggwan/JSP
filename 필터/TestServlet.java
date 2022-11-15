package edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Practice")
public class TestServlet extends HttpServlet {
	//자바 직렬화, 자바 객체나 데이터를 바이트 형태로 변환
	//파일 저장을 위해 필요
	private static final long serialVersionUID = 1L;

	// 서비스
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
		System.out.println("서비스 :");
	}

	// get방식 전송
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		System.out.println("do get");
		// 자바 출력 스트림
		PrintWriter out = resp.getWriter();
		out.write("<h1>TESTServlet -doget</h1>");
	}

	// post방식 전송
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.doPost(req, resp);
		System.out.println("dopost");

		PrintWriter out = resp.getWriter();
		out.write("<h1>TESTServlet -doget</h1>");
	}
}
