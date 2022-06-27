<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<title>가입</title>
</head>

<body>
   <div class="container">
      <div class="input-form-backgroud row">
        <div class="input-form col-md-12 mx-auto">
        
          <h3 class="mb-3 text-center">글수정 </h3>
          <form class="validation-form" action="bbsUpdatePro" method="post" >
          
             <input type="text" class="form-control" name="bbsNo" readonly value="${bvo.bbsNo }">
            
 			 <div class="mb-3">
               <label class="">글쓴이</label>
               <input type="text" class="form-control" name="name" readonly value="${bvo.name }">
             </div>
             
         	 <div class="mb-3">
                <label for="name">주제</label>
                <input type="text" class="form-control" name="title" >
             </div>

         	 <div class="mb-3">
                <label for="name">사진</label>
                <input type="file" class="form-control" name="photo" >
             </div>
            
             <div class="mb-3">
                <label for="name">내용</label>
                <textarea class="form-control" rows="5" cols="40" name="content" placeholder="하고싶은말을 입력하세요."></textarea>
             </div>
                                 
	           <div class="mb-4 text-center">
	              <input class="btn btn-primary btn-sm btn-block" type="submit" value="글쓰기">
	              <input class="btn btn-primary btn-sm btn-block" type ="reset" value="취소" onclick='location.href="bbsList";'>
	           </div>
          </form>
        </div>
      </div>
     </div>
</body>
</html>