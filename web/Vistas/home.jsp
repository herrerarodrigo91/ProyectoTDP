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
        <title>TDP 2016</title>
    </head>
    <body>
        <h1>PROYECTO TECNOLOGIA DE PROGRAMACION 2016</h1>
        <s:if test="modoAdmin">
            modo administrador
            <s:a action="admin">entrar</s:a>
            <s:a action="logout">salir</s:a>
        </s:if>
        <s:else>
            <s:form action="admin" theme="simple">
            <s:textfield name="user" placeholder="admin" required="true"/>
            <s:password name="password" placeholder="password" required="true"/>
            <s:submit value="atroden"/>
            </s:form>
        </s:else>
        <s:iterator value="ce">
            <s:form action="io" theme="simple">
                    <s:property value="nombre"/>
                    imagen: <img src="<s:property value="nombreImagen"/>" width="250px" height="200px"/>
                    <s:hidden name="idBean" value="%{id}"/>
                    <button type="submit" value="verEntidad" name="boton"  >ver</button>
                    
                    <hr>
                </s:form>
        </s:iterator>
       
    </body>
</html>
