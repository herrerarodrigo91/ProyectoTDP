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
        <s:a action="logout">salir</s:a>
        <br/>
        <s:form action="cargar"  enctype="multipart/form-data">
            
            <s:textfield name="nombre" label="Nombre" placeholder="ingrese un nombre..." requiredLabel="true"/>
            <s:textfield name="calificacion" label="Calificacion" required="true" placeholder="ingrese su calificacion..." requiredLabel="true"/>
            <s:textfield name="descripcion" label="Descripcion"/>
            <s:file name="imagen" label="imagen"/>
            <s:submit value="Listo!" align="center"/>
            
        </s:form>
        nombre hacker de imagen: <s:property value="imagen"/></br>
        tipo de imagen: <s:property value="imagenContentType"/></br>
        nombre piola del archivo: <s:property value="imagenFileName"/></br>
        imagen: <img src="<s:property value="NombreImagen"/>"/>
            
            
        
    
</html>
