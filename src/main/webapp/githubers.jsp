<%--
  Created by IntelliJ IDEA.
  User: lapiscine
  Date: 2019-07-18
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Hello, world!</title>
</head>
<body>

<!-- ...........NavBar -->
<%@include file="header.jsp" %>
<h1 style="text-align: center;">Liste des Githubers</h1>
<!--for each githuber in the list -->

<div class="table-responsive">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Nom</th>
            <th scope="col">Email</th>
            <th scope="col">Login</th>
            <th scope="col">Avatar</th>
        </tr>
        </thead>
        <c:forEach items="${githuberList}" var="githuber">
        <tbody>
        <tr>
            <td>${githuber.id}</td>
            <td>${githuber.name}</td>
            <td>${githuber.email}</td>
            <td>${githuber.login}</td>
            <td>${githuber.avatarUrl}</td>
        </tr>
        </tbody>
        </c:forEach>
    </table>
</div>

<!-- Footer -->
<%@include file="footer.jsp" %>



