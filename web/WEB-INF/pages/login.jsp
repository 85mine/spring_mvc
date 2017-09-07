<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><title>Login</title></head>
<body>
<h1>Login</h1>
<h3>Enter user name and password:</h3>
<form:form action="/login" method="POST" commandName="loginForm">
    <table>
        <tr>
            <td>User:</td>
            <td><form:input path="username"/></td>
            <td><form:errors path="username" cssStyle="color:red;display:block"></form:errors></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><form:password path="password"/></td>
            <td><form:errors path="password" cssStyle="color:red;display:block"></form:errors></td>
        </tr>
        <tr>
            <td><input name="submit" type="submit" value="submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>