<%-- 
    Document   : UserImage
    Created on : 11/01/2017, 15:37:41
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
        <s:actionerror />
        <s:form action="userImage" method="post" enctype="multipart/form-data">
            <s:file name="imagen" label="imagen"/>
            <s:submit value="Upload" align="center"/>
        </s:form>
    </body>
</html>
