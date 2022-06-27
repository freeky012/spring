<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String id = (String)session.getAttribute("id");
%>    
<!doctype html>
<html lang="en">
  <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
      <title>정보수정</title> 

    <style>
    body {
        min-height: 100vh;

        background: -webkit-gradient(linear, left bottom, right top, from(#92b5db), to(#1d466c));
        background: -webkit-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
        background: -moz-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
        background: -o-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
        background: linear-gradient(to top right, #92b5db 0%, #1d466c 100%);
      }

      .input-form {
        max-width: 680px;

        margin-top: 80px;
        padding: 32px;

        background: #fff;
        -webkit-border-radius: 10px;
        -moz-border-radius: 10px;
        border-radius: 10px;
        -webkit-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
        -moz-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
        box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15)
      }
    </style>
  </head>
  <body>
    <div class="container">
      <div class="input-form-backgroud row">
        <div class="input-form col-md-12 mx-auto">
        
          <h4 class="mb-3 text-center">회원수정</h4>
          <form class="validation-form" action="updateMember.do" method="post" >
            <div class="row">
            
              <div class="mb-3">
                <label for="id"></label>
                <input type="hidden" class="form-control" id="id" name="id" value="<%=id%>"readonly>
                <div class="invalid-feedback">
                  아이디를 입력해주세요.
                </div>
              </div> 
               
              <div class="mb-3">
                <label for="password">비밀번호</label>
                <input type="password" class="form-control" name="password" required>
                <div class="invalid-feedback">
                  비밀번호를 입력해주세요.
                </div>
              </div>
                         
              <div class="mb-3">
	              <label for="email">이메일</label>
	              <input type="email" class="form-control" id="email" name="email" required>
	              <div class="invalid-feedback">
	                이메일을 입력해주세요.
	              </div>
              </div>
              
              <div class="mb-3">
	              <label for="tel">전화번호</label>
	              <input type="tel" class="form-control" id="tel" name="tel" required>
	              <div class="invalid-feedback">
	                전화번호을 입력해주세요.
	              </div>
              </div>
             
             <div class="mb-3">
              <label for="address">주소</label>
              <input type="text" class="form-control" id="address" name="addr" required>
              <div class="invalid-feedback">
                주소를 입력해주세요.
              </div>
            </div>
            
             <div class="mb-3">
                <label for="name">직업</label>
                <input type="text" class="form-control" id="job" name="job" >
                <div class="invalid-feedback">
                  직업을 입력해주세요.
                </div>
              </div>
              
             <div class="mb-3">
                <label for="name">나이</label>
                <input type="text" class="form-control" id="name" name="age">
                <div class="invalid-feedback">
                  나이을 입력해주세요.
                </div>
              </div>
              
             <div class="mb-3">
                <label for="name">내용</label>
                <textarea class="form-control" rows="3" id="content" name="content" placeholder="하고싶은말을 입력하세요."></textarea>
                <div class="invalid-feedback">
                  하고 싶은 말을 입력해주세요.
                </div>
              </div>
                                 
	            <div class="mb-4 text-center">
	              <button class="btn btn-primary btn-lg btn-block" type="submit">변경</button>
	              <button class="btn btn-primary btn-lg btn-block" onclick="history.go(-1)">취소</button>
	            </div>
	        </div>           
          </form>
        </div>
      </div>
     </div>
  
  </body>
</html>