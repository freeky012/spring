<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<title>게시판</title>
</head>
<body>


<c:import url="/WEB-INF/views/bbs/index.jsp"/>
<div class="container">
	
	  <table class="table table-bordered text-center mt-5">
	    <thead>
	      <tr>
	        <th class="col-1">게시판번호</th>
	        <th class="col-1">이름</th>
	        <th class="col-2">제목</th>
	        <th class="col-2">사진</th>
	        <th class="col-3">내용</th>
	        <th class="col-1">입력날짜</th>
	        <th class="col-2">기능</th>
	       </tr>
	    </thead>
	    
	    <tbody>
		<c:forEach var="bbsList" items="${list}">
	      <tr>
	        <td>${bbsList.bbsNo }</td>
	        <td>${bbsList.name }</td>
	        <td>${bbsList.title }</td>
	        <td><img src="resources/images/${bbsList.photo }" width="100%"></td>
	        <td>${bbsList.content }</td>
	        <td>${bbsList.regdate }</td>
	        <td>  <a class="btn btn-primary btn-sm btn-block" href="${pageContext.request.contextPath}/bbsUpdate?bbsNo=${bbsList.bbsNo}">수정</a>
	              <a class="btn btn-primary btn-sm btn-block" href="${pageContext.request.contextPath}/bbsDeletePro?bbsNo=${bbsList.bbsNo}">삭제</a></td>
	      </tr>
	   	</c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>