<%-- 
    Document   : infoPartido
    Created on : 29/07/2016, 19:07:37
    Author     : Rodrigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>estas en la informacion de la entidad seleccionad!</h1>
        <p><s:property value="idBean"/></p>
        <p><s:property value="nombre"/></p>
        <p><s:property value="calificacion"/></p>
        <p><s:property value="descripcion"/></p>
        
        
        
    </body>
</html>
