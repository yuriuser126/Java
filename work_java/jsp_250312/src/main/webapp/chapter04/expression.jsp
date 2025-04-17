<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

    <style>
        .table1{
            border: 1px solid black;
        }
        
        .table1 td{
            border: 1px solid black;
            padding: 10px;
        }
        
        .table1 p{
        text-decoration: underline;
        }

    </style>

</head>
<body>

<table class="table1">
<tr>
<td colspan="2">
공지사항 
게시판
FAQ
QnA
</td>
</tr>

<tr>

<td>
<p>Java</p>  
<p>JSP</p>   
<p>Oracle</p>   
<p>HTML</p>   
<p>CSS</p>   
</td>

<td >공지사항입니다.</td>
</tr>

<tr><td colspan="2">Since 2021</td></tr>
</table>


<%--      border-collapse: separate;
    padding: 10px; --%>


</body>
</html>