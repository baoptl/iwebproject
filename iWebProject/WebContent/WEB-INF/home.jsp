<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello,${userId }!
<a href="${pageContext.request.contextPath}/${userId }/logout">注销</a><br/>
<a href="${pageContext.request.contextPath}/uploadProductPicture.jsp?userId=4">上传产品图片</a>
<a href="${pageContext.request.contextPath}/publishProduct.jsp">发布产品</a>
</body>
</html>