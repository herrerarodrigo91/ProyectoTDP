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
        <link rel="stylesheet" href="EstiloPaginaTDP.css"/>
        
    </head>
    <body>
        <h1>PROYECTO TECNOLOGIA DE PROGRAMACION 2016</h1>
        <s:if test="modoAdmin">
            modo administrador
            <s:a action="admin">entrar</s:a>
            <s:a action="logout">salir</s:a>
        </s:if>
        <s:else>
            <div class="divForm">
            <s:form action="admin" theme="simple" cssClass="form-style-1">
            <s:textfield name="user" placeholder="admin" required="true"/>
            <s:password name="password" placeholder="password" required="true"/>
            <s:submit value="atroden"/>
            </s:form>
            </div>     
        </s:else>
            <div class="container">
        <ul>    
            
        <s:iterator value="ce">
            
                    
                        <li>
                            
                                <s:form action="io" theme="simple" > 
                                    <div class="div-img">
                                        <img class="img" src="<s:property value="nombreImagen"/>" width="250px" height="200px"/>
                                            <div class="text">
                                                <s:property value="nombre"/>
                                                <button class="ver" type="submit" value="verEntidad" name="boton"   >ver</button>
                                                <s:hidden name="idBean" value="%{id}"/>
                                            </div>
                                    </div> 
                                </s:form>
                                
                           
                        </li>

        </s:iterator>
                         
       </ul>
                </div>
    </body>
</html>
