<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int num = 0;
	//파라미터 넣은 값(num)을 문자열로 받는다.
	String snum = request.getParameter("num");
	if(snum != null && snum.equals("") == false){
		num = Integer.parseInt(snum);
	}
	//팩토리얼 함수에 적용
	int a = num;
	for (int i = num-1 ; i > 0; i--){
		a *= i;
	}
	//소수 판별의 자바 프로그래밍에 적용
	int b;
	boolean result = true;

	for (b = 2; b < num; b++) {
		if (num % b == 0) {
			result = false;
			break;
		} else {
			result = true;
		}
	}
		
	
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>팩토리얼</title>
</head>
<body>
	<h2> <%=num%>의 팩토리얼 값은 <%=a%>입니다</h2>
	<h2> <%=num%>의 소수 판별은 <%=result %> </h2>
</body>
</html>