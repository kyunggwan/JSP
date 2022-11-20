<%@ page import="model2.mvcboard.MVCMemberDTO"%>
<%@ page import="model2.mvcboard.MVCMemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 로그인 폼으로부터 받은 아이디와 패스워드
String userId = request.getParameter("user_id"); 
String userPwd = request.getParameter("user_pw");  
// web.xml에서 가져온 데이터베이스 연결 정보
// String oracleDriver = application.getInitParameter("OracleDriver");
// String oracleURL = application.getInitParameter("OracleURL");
// String oracleId = application.getInitParameter("OracleId");
// String oraclePwd = application.getInitParameter("OraclePwd");

// String MySQLDriver = application.getInitParameter("MySQLDriver");
// String MySQLURL = application.getInitParameter("MySQLURL");
// String MySQLId = application.getInitParameter("MySQLId");
// String MySQLPwd = application.getInitParameter("MySQLPwd");
String H2Driver = application.getInitParameter("H2Driver");
String H2URL = application.getInitParameter("H2URL");
String H2Id = application.getInitParameter("H2Id");
String H2Pwd = application.getInitParameter("H2Pwd");

// 회원 테이블 DAO를 통해 회원 정보 DTO 획득
MVCMemberDAO dao = new MVCMemberDAO(H2Driver, H2URL, H2Id, H2Pwd);
MVCMemberDTO memberDTO = dao.getMVCMemberDTO(userId, userPwd);
dao.close();
// 로그인 성공 여부에 따른 처리
if (memberDTO.getId() != null) {
    // 로그인 성공
    session.setAttribute("UserId", memberDTO.getId()); 
    session.setAttribute("UserName", memberDTO.getName()); 
    response.sendRedirect("MVCLoginForm.jsp");
}
else {
    // 로그인 실패
    request.setAttribute("LoginErrMsg", "로그인 오류입니다."); 
    request.getRequestDispatcher("MVCLoginForm.jsp").forward(request, response);
}
%>