<%--
  Created by IntelliJ IDEA.
  User: 黄小帅
  Date: 2020/6/6
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook?bookId=${books.bookId}" method="post">
        书籍名称：<input class="form-control" type="text" name="bookName" value="${books.bookName}" required><br><br><br>
        书籍数量：<input class="form-control" type="text" name="bookCounts" value="${books.bookCounts}" required><br><br><br>
        书籍详情：<input class="form-control" type="text" name="detail" value="${books.detail}" required><br><br><br>
        <input class="btn btn-primary" type="submit" value="修改">
    </form>
</div>
</body>
</html>
