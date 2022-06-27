<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<c:if test="${result == 0 }">
	<script>
		alert("비밀번호가 일치하지 않습니다");
  </script>
</c:if>
<c:if test="${result == -1 }">
	<script>
		alert("아이디가 존재하지 않습니다");
  </script>
</c:if>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	
	<title>로그인</title>
  <style>

    html,
    body {
      height: 100%;
    }

    body {
      display: flex;
      align-items: center;
      padding-top: 40px;
      padding-bottom: 40px;
      background-color: #f5f5f5;
    }

    .form-signin {
      width: 100%;
      max-width: 330px;
      padding: 15px;
      margin: auto;
    }

  
    .form-signin .form-floating:focus-within {
      z-index: 2;
    }

   
    .form-signin input[type="password"] {
      margin-bottom: 10px;
      border-top-left-radius: 0;
      border-top-right-radius: 0;
    }


      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
			
			.bt {
					width:140px;
			}
			
  </style>

    
  </head>
  <body class="text-center">
    
<main class="form-signin">
  <form action="member/login.do" method="post">
    <h1 class="h3 mb-3 fw-normal">로그인</h1>

    <div class="form-floating">
      <input type="text" class="form-control" id="floatingInput" name="id" placeholder="id를 입력하세요">
      <label for="floatingInput">아이디</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="floatingPassword" name="password" placeholder="Password를 입력하세요">
      <label for="floatingPassword">패스워드</label>
    </div>
		<div>
		    <input class="btn btn-lg btn-primary bt" type="submit" value="로그인"/>
		    <input class="btn btn-lg btn-primary bt" value="회원가입" onclick="location.href='joinMemberForm.jsp'">
    	</div>
  </form>
</main>


    
  </body>
</html>