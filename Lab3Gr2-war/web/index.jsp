<%-- 
    Document   : index
    Created on : 14.03.2020, 16:14:54
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="MozgGr2" method="POST">
            Введите логин:
            <input type="text" name="login" value="" size="16" /><br/>
            Введите пароль:
            <input type="password" name="psw" value="" size="15" /><br/>
            <input type="submit" value="Пустите меня !" name="enter" />
            <input type="submit" value="Хочу сообщение!" name="getMsg" />
        </form>
        
        <%= (String)request.getAttribute("result")%>
        
    </body>
</html>
