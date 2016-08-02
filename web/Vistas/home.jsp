<%-- 
    Document   : home
    Created on : 29/07/2016, 13:17:47
    Author     : Rodrigo
--%>

<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <s:form action="admin" theme="simple">
            <s:textfield name="user" placeholder="user"/>
            <s:password name="password" placeholder="password"/>
            <s:submit value="log"/>
        </s:form>
        
        <s:iterator value="cl">
            <s:form action="info" theme="simple">
                    <s:property value="nombre"/>
                    
                    <s:hidden name="apellidoBean" value="%{apellido}"/>
                    <s:submit value="ver"/>
                    <hr>
                </s:form>
        </s:iterator>
                
        
        
        
    </body>
</html>
