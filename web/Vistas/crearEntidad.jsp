<%-- 
    Document   : crearPartido
    Created on : 10/08/2016, 14:03:16
    Author     : Rodrigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>pagina para crear partido</title>
    </head>
    
        <h1>estas en la pagina del administrado para crear partido</h1>
        <s:actionerror />
        <s:fielderror />
        <s:a action="logout">salir</s:a>
        <s:a action="admin">atras</s:a>
        <br/>
        <s:form action="cargar"  enctype="multipart/form-data">
            
            <s:textfield name="nombre" label="Nombre" placeholder="ingrese un nombre..." type="text" maxlength="23" requiredLabel="true" required="true" />
            <s:textfield name="calificacion" label="Calificacion" required="true" placeholder="ingrese su calificacion..." requiredLabel="true" type="number" min="0" max="10" />
            <s:textarea name="descripcion" label="Descripcion" placeholder="describa su entidad" cols="50" rows="10"/>
            <s:file name="imagen" label="imagen" />
            <s:textfield name="video" label="video YoutTube"/>
            <s:submit value="Listo!" align="center"/>
            
        </s:form>
        <s:if test="mostrarInfoImagen">
            
            imagen: <img src="<s:property value="nombreImagen"/>" width="150px" height="150px"  />
        </s:if>
        
            
            
        
    
</html>
