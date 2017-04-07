<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <head>
  <%@ include file="/include/header.jsp" %>
</head>
<body>
  <%@ include file="/include/navigation.jsp" %>
  <div class="container" id="main">
    <div class="col-md-6 col-md-offset-3">
      <div class="panel panel-default content-main">
        <form name="question" method="post" action="/user/update">
          <input type="hidden" class="form-control" id="userId"
            name="userId" value=${user.userId}>
          <div class="form-group">
            <label for="password">비밀번호</label> <input type="password"
              class="form-control" id="password" name="password"
              placeholder=${user.password}>
          </div>
          <div class="form-group">
            <label for="name">이름</label> <input class="form-control"
              id="name" name="name" placeholder=${user.name}>
          </div>
          <div class="form-group">
            <label for="email">이메일</label> <input type="email"
              class="form-control" id="email" name="email"
              placeholder=${user.email}>
          </div>
          <button type="submit"
            class="btn btn-success clearfix pull-right">수정</button>
          <div class="clearfix" />
        </form>
      </div>
    </div>
  </div>

  <!-- script references -->
  <script src="../js/jquery-2.2.0.min.js"></script>
  <script src="../js/bootstrap.min.js"></script>
  <script src="../js/scripts.js"></script>
</body>
</html>