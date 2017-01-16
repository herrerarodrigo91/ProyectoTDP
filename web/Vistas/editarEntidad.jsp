<%-- 
    Document   : editarPartido
    Created on : 10/08/2016, 18:04:11
    Author     : Rodrigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>vista de editar partido</h1>
        <s:form action="editar" theme="simple">
            
            <s:hidden name="idBean" value="%{idBean}"/>
            <s:textfield name="nuevoNombre" value="%{nombre}"/>
            <s:textfield name="nuevaCalificacion" value="%{calificacion}"/>
            <s:textfield name="nuevaDescripcion" value="%{descripcion}"/>
            <s:submit value="aceptar"/>
        </s:form>
    </body>
</html>
