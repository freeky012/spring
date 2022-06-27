<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
    
<!DOCTYPE html>
<html> 
  <head>
	  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	  <title>메인 페이지 </title> 
	  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	 	  
	 	  <script>
		    function drop() 
		    {
		   		if (confirm("탈퇴하시겠습니까?")) {
			    	location.href="dropMember.do";    
			    } else {
			    	location.href="index.jsp";    
			    }
		    }
		   </script>
 
  </head>

  <body class="container"> 
		<header>
    <div class="p-5 bg-primary text-white text-center">
      <h1>동광노트북 </h1>
      
    </div> <!-- 타이틀 -->
    
      
      <div class="row">
        <div class="col">
          <nav class="navbar navbar-expand-sm bg-black">
            <div class="container-fluid ">
              <ul class="navbar-nav" >
                <li class="nav-item px-3">
                  <a class="nav-link active text-white" href="index.mem">홈</a>
                </li>
                <li class="nav-item px-3">
                  <a class="nav-link text-white" href="listMember.do">회원목록</a>
                </li>
                <li class="nav-item px-3">
                  <a class="nav-link text-white" href="listbbs.do">게시판</a>
                </li>
                <li class="nav-item px-3">
                  <a class="nav-link text-white" href="/ServletMVC/index.jsp?pageinfo=listNotebook.jsp">노트북목록</a>
                </li>
              </ul>

            
              <div class="nav-item justify-content-end flex-column">
                
                <div class="btn-group">
                  <a class="btn btn-primary text-light me-2" >
                              <c:if test="${empty sessionScope.id}">로그인 해주세요</c:if>
                              <c:if test="${not empty sessionScope.id}"> ${sessionScope.id}님</c:if>
                  </a>
                <div class="dropdown">
		  <c:choose> 
			  <c:when test="${not empty sessionScope.id}">
			  									<button type="button" class="btn btn-black text-light dropdown-toggle" data-bs-toggle="dropdown">회원정보</button>
		                      <ul class="dropdown-menu">
		                        <li><a class="dropdown-item" href="logout.do">로그아웃</a></li>
		                        <li><a class="dropdown-item" href="updateMemberForm.jsp">정보수정</a></li>
		                        <li><a class="dropdown-item" href="/ServletMVC/index.jsp?pageinfo=payReservation.jsp">장바구니</a></li>
		                        <li><a class="dropdown-item" onclick="drop()" >회원탈퇴</a></li>
		                      </ul>
		    </c:when>
			  <c:otherwise>
			  		<a class="btn btn-black text-light" href="loginForm.jsp" >로그인</a>
						<a class="btn btn-black text-light" href="joinMemberForm.jsp" >회원가입</a>
			  </c:otherwise>
			</c:choose>          
                  </div>
                </div>
              </div>
            </div>
          </nav>
        </div>	  
       </div>
       </header> <!-- end of header-->
		<main>
	    <div id="middle" class="container">
	    <c:choose> 
				<c:when test="${empty param.pageinfo}"><jsp:include page="homepicture.html"/>	</c:when>
				<c:otherwise><jsp:include page="${param.pageinfo}"/></c:otherwise>
	   </c:choose> 
	    </div> <!-- end of main-->      
		</main>
		<footer>
	    <div id="footer_wrapper">
	      <div class="row">
          <nav class="navbar navbar-expand-sm">
            <div class="container-fluid ">
              <ul class="navbar-nav" >
                <li class="nav-item px-3">
                  <a class="nav-link active text-black" href="#">회사소개</a>
                </li>
                <li class="nav-item px-3">
                  <a class="nav-link text-black" href="#">이용약관</a>
                </li>
                <li class="nav-item px-3">
                  <a class="nav-link text-black" href="#">개인정보처리방침</a>
                </li>
                <li class="nav-item px-3">
                  <a class="nav-link text-black" href="#">고객센터</a>
                </li>
              </ul>
             </div>
          </nav>
       </div>
       
		   <div class="p-5 bg-primary text-white text-center"> 	  
		      <h2>동광 노트북</h2>
		      <p>대표이사 : 박재형</p> 
		      <p>주소: 서울특별시 중구 한강대로 416, Tel: 1588-1234 </p>
					<p>사업자등록번호 : 110-11-01234, 통신판매업신고 : 2018-서울중구-1445</p> 
	    </div> <!-- 타이틀 -->
		</div>
    </footer> <!-- end of footer -->
    </body>
</html>