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
        <title>TDP 2016</title>
    </head>
    <body>
        <h1>vista de editar partido</h1>
        <s:a action="admin">atras</s:a>
        <s:form action="editar" enctype="multipart/form-data">
            
            <s:hidden name="idBean" value="%{idBean}"/>
            <s:textfield name="nuevoNombre" label="Nombre" value="%{nombre}" required="true"/>
            <s:textfield name="nuevaCalificacion" label="Calificacion" value="%{calificacion}" required="true" type="number" max="10" min="0"/>
            <s:textarea name="nuevaDescripcion" label="Descripcion" value="%{descripcion}" cols="50" rows="10"/>
            <s:file name="nuevaImagen" label="imagen" />
            <s:textfield name="nuevoVideo" label="video YoutTube" value="%{video}"/>
            <s:submit value="aceptar"/><br>
        </s:form>
    </body>
</html>
