<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<title>게시판</title>
</head>
<body>
 
<div class="container mt-3">
	  <div class="mt-4 p-5 bg-primary text-white rounded">
		  <h1 class="text-center">게시판</h1>
      </div>
</div>

<div class="container">
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  <div class="container-fluid">
	    <ul class="navbar-nav">
	  
	      <li class="nav-item">
	        <a class="nav-link" href="${pageContext.request.contextPath}/bbsInsert">가입</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="${pageContext.request.contextPath}/bbsList">조회</a>
	      </li>
	     </ul>
	  </div>
	</nav>
</div> 
 
</body>
</html>