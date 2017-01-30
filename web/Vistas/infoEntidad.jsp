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
        <a href="javascript:history.go(-1)">Atrás </a>
        
        <p><s:property value="idBean"/></p>
        <p><s:property value="nombre"/></p>
        <p><s:property value="calificacion"/></p>
        <p><s:property value="descripcion"/></p>
        imagen: <img src="<s:property value="imagen"/>" width="150px" height="150px"  />
        <iframe width="560" height="315" src="<s:property value="video"/>" frameborder="0" allowfullscreen></iframe>
        
        
    </body>
</html>
