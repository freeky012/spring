<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.computer.DTO.memberDTO"%>
<%@ page import="com.computer.DAO.memberDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  	 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
      <title>상세페이지</title>
</head>
<body>

    
    <div class="container">
     <div class="cow">
       <table class="table table-striped">
          <thead>
            <tr>
              <th scope="col-1">번호</th>
              <th scope="col-1">아이디</th>
              <th scope="col-1">이메일</th>
              <th scope="col-1">전화번호</th>
              <th scope="col-1">주소</th>
              <th scope="col-1">직업</th>
              <th scope="col-1">가일날짜</th>
              <th scope="col-1">나이</th>
              <th scope="col-4">내용</th>
            </tr>
          </thead>
          <tbody>
            					
						<tr>
						 		<th scope="row">${memberdto.getNum()}</th>
								<td>${memberdto.getId()}</td>
								<td>${memberdto.getEmail()}</td>
								<td>${memberdto.getTel()}</td>
								<td>${memberdto.getAddr()}</td>
								<td>${memberdto.getJob()}</td>
								<td>${memberdto.getRegDate()}</td>
								<td>${memberdto.getAge()}</td>
								<td>${memberdto.getContent()}</td>
						</tr>
					
						
          </tbody>
          
          
        </table>
        <div class="cow  text-center">
     	 
          <div>
          	<button type="button" class="btn btn-primary btn-sm" onclick="history.go(-1)">전체항목</button>
          	<button type="button" class="btn btn-primary btn-sm" onclick="location.href='updateMemberForm.jsp'">정보수정</button>
			<button type="button" class="btn btn-secondary btn-sm" onclick="location.href='sessionLogout.jsp'">로그아웃</button>
          
         </div>
      </div>
  
</body>
</html>