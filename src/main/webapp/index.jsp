<%@page import="org.example.CallMethod"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
<% CallMethod callMethod=new CallMethod(); %>
<%
    callMethod.callMethodGet();

    out.println(new java.util.Date());
    out.println("Hello "+ request.getParameter("myname"));
%>
</html>