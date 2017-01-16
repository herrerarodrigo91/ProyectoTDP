<%-- 
    Document   : SuccessUserImage
    Created on : 11/01/2017, 15:50:22
    Author     : Rodrigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        nombre hacker de imagen: <s:property value="userImage"/></br>
        tipo de imagen: <s:property value="userImageContentType"/></br>
        nombre piola del archivo: <s:property value="userImageFileName"/></br>
        imagen: <img src="<s:property value="userImageFileName"/>"/>
        
    </body>
</html>
