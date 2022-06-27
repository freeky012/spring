<%@page import="com.computer.DAO.memberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  


<!doctype html>
<html lang="ko">
  <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
  		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
      <title>회원목록</title> 

  </head>
  
  <body>
   	    
    <div class="container">
   	 <div class="cow">
        <table class="table table-striped">
          <thead>
            <tr>
              <th class="col-0.5">번호</th>
              <th class="col-1">아이디</th>
              <th class="col-1.5">이메일</th>
              <th class="col-1.5">전화번호</th>
              <th class="col-1.5">주소</th>
              <th class="col-0.5">직업</th>
              <th class="col-2">가일날짜</th>
              <th class="col-0.5">나이</th>
              <th class="col-3">내용</th>
            </tr>
          </thead>
          <tbody>
            
					<c:forEach var="member" items="${list}"> 
						<tr>
						 		<th scope="row">${member.num}</th>
								<td><a href='detailMemberPro.jsp?id=${member.id}'>${member.id}</a></td>
								<td>${member.email}</td>
								<td>${member.tel}</td>
								<td>${member.addr}</td>
								<td>${member.job}</td>
								<td>${member.regDate}</td>
								<td>${member.age}</td>
								<td>${member.content}</td>
						</tr>
					</c:forEach>
				
          </tbody>
        </table>
        </div>
        <div class="cow text-center">
     	   <div>
          	<button type="button" class="btn btn-primary btn-sm" onclick="location.href='deleteMemberPro.jsp'">회원탈퇴</button>
			<button type="button" class="btn btn-secondary btn-sm" onclick="location.href='sessionLogout.jsp'">로그아웃</button>
           </div>
      	</div>
      </div>
   	</body>
</html>
