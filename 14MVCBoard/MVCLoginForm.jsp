<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<link href="https://fonts.googleapis.com/css?family=Cute+Font&display=swap" rel="stylesheet">
<head><title>Session</title></head>
<body>
 	
    <h2  align="center">로그인 페이지</h2>
    <span style="color: red; font-size: 1.2em;"> 
        <%= request.getAttribute("LoginErrMsg") == null ?
                "" : request.getAttribute("LoginErrMsg") %>
    </span>
    <%
    if (session.getAttribute("UserId") == null) {  // 로그인 상태 확인
        // 로그아웃 상태
    %>
    <script>
    function validateForm(form) {
        if (!form.user_id.value) {
            alert("아이디를 입력하세요.");
            return false;
        }
        if (form.user_pw.value == "") {
            alert("패스워드를 입력하세요.");
            return false;
        }
    }  
    //로그인 프로세스를 알아보자
    </script>
    	  <form action="MVCLoginProcess.jsp" method="post" name="MVCloginFrm" align="center"
        onsubmit="return validateForm(this);">
        아이디 : <input type="text" name="user_id"  /><br />
        패스워드 : <input type="password" name="user_pw" /><br />
        <input type="submit" value="로그인하기" />
    </form>
    <%
    } else { // 로그인된 상태
    %>
        <%= session.getAttribute("UserName") %> 회원님, 로그인하셨습니다.<br />
        <a href="../mvcboard/list.do">게시판 목록 바로가기</a>
        <a href="MVCLogout.jsp">[로그아웃]</a>
    <%
    }
    %>
</body>
</html>